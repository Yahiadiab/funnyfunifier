package main;
import java.util.List;

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

    public String getStringFunifier() {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;



        for (int i = 0; i < startIndexes.size(); i++) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);


            result.append(boringString, lastEnd, start);


            StringBuilder funnyString = new StringBuilder(boringString.substring(start, end + 1));

            funnyOperations.get(i).trial(funnyString);

            result.append('(').append(funnyString).append(')');


            lastEnd = end + 1;
        }


        result.append(boringString.substring(lastEnd));

        return result.toString();
    }




    public  String getFunnyString() {

        StringBuilder funnyString = new StringBuilder(boringString);

        for (int i = startIndexes.size() - 1; i >= 0; i--) {
            int start = startIndexes.get(i);
            int end = endIndexes.get(i);
            StringBuilder substring = new StringBuilder(funnyString.substring(start, end + 1));
            StringBuilder modifiedSubstring = funnyOperations.get(i).trial(substring);
            funnyString = new StringBuilder(funnyString.substring(0, start) + "(" + modifiedSubstring + ")" + funnyString.substring(end + 1));
        }

        return funnyString.toString();
    }
}
