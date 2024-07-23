package main;

import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);


//
    String boringString="ccchHJKkklmlmmml";


        List<Integer> startIndexes = new ArrayList<>(List.of(1, 5, 7, 11, 13));
        List<Integer> endIndexes = new ArrayList<>(List.of(3, 5, 10, 12, 14));

        List<Operation> funnyOperations = new ArrayList<>(List.of(
                new Lower(new Reverse(new Base())),
                new Reverse(new Base()),
                new Reverse(new Base()),
                new Reverse(new Upper(new Lower(new Base()))),
                new Upper(new Lower(new Reverse(new Compress(new Base()))))
        ));

        StringFunifier stringFunifier = new StringFunifier(boringString, startIndexes, endIndexes, funnyOperations);




        long startTime = System.currentTimeMillis();
        System.out.println("Time before execution : " + startTime);
        System.out.println(stringFunifier.getStringFunifier());
        long endTime = System.currentTimeMillis();
        System.out.println("Time after execution  : " + endTime);
        System.out.println("Total execution time  : " + (endTime - startTime));



    }

//    public static Operation getOperationCombination(List<String> stringOperations) {
//        Operation operation = new Base();
//
//        for (var currentOperation : stringOperations) {
//            switch (currentOperation) {
//                case "REVERSE" -> {
//                    operation = new Reverse(operation);
//                }
//                case "UPPERCASE" -> {
//                    operation = new Upper(operation);
//                }
//                case "COMPRESSION" -> {
//                    operation = new Compress(operation);
//                }
//                case "SORT" -> {
//                    operation = new Sort(operation);
//                }
//                case "LOWERCASE" -> {
//                    operation = new Lower(operation);
//                }
//
//            }
//        }
//
//        return operation;
    }



//Input:
//ccchHJKkklmlmmml
//1 , 5 , 7 , 11 , 13
//3 , 5 , 10 , 12 , 14
//"REVERSE", "UPPERCASE", "SORT", "LOWERCASE", "COMPRESSION"
//getFunnyString() => c(hcc)H(J)K(kklm)(lm)(m2)l