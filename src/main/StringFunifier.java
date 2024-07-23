package main;
//import java.util.List;
//import java.util.Vector;
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;

import java.util.*;
import java.util.concurrent.*;

public class StringFunifier {
    public String boringString;
    public List<Integer> startIndexes;
    public List<Integer> endIndexes;
    public List<Operation> funnyOperations;


    public StringFunifier(String boringString, List<Integer> startIndexes, List<Integer> endIndexes, List<Operation> operations) {

        this.boringString = boringString;
        this.startIndexes = startIndexes;
        this.endIndexes = endIndexes;
        this.funnyOperations = operations;


    }

    public StringBuilder getStringFunifier() throws ExecutionException, InterruptedException {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;


        ExecutorService executor = Executors.newFixedThreadPool(5);
        Vector<Future<StringBuilder>> futures = new Vector<Future<StringBuilder>>();
//
        for (int i = 0; i < startIndexes.size(); i++) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            Operation operation = funnyOperations.get(i);

            futures.add(executor.submit(() -> {
                StringBuilder builder = new StringBuilder(boringString.substring(start, end + 1));
                return operation.trial(builder);
            }));
        }


        for (int i = 0; i < startIndexes.size(); i++) {

            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            StringBuilder funSubString = futures.get(i).get();

            result.append(boringString, lastEnd, start);
            result.append("(").append(funSubString).append(")");
            lastEnd = end + 1;


        }

        executor.shutdown();
        return result;

    }

//
//
//            result.append(boringString, start, end);
//
//
//            StringBuilder funnyString = new StringBuilder(boringString.substring(start, end + 1));
//
//            funnyOperations.get(i).trial(funnyString);
//
//            result.append('(').append(funnyString).append(')');
//
//
//            lastEnd = end + 1;
//        }
//
//
//        result.append(boringString.substring(lastEnd));
//
//        return result;
//    }


//    public List<Future<StringBuilder>> startThreadsOperations() throws InterruptedException {
//
//
//        StringBuilder funnyString = new StringBuilder(boringString);
//
//        for (int i = startIndexes.size() - 1; i >= 0; i--) {
//            int start = startIndexes.get(i);
//            int end = endIndexes.get(i);
//            StringBuilder substring = new StringBuilder(funnyString.substring(start, end + 1));
//
//            StringBuilder modifiedSubstring = funnyOperations.get(i).trial(substring);
//            funnyString = new StringBuilder(funnyString.substring(0, start) + "(" + modifiedSubstring + ")" + funnyString.substring(end + 1));
//
//        }
//
//        return funnyString.toString();
//    }
}
