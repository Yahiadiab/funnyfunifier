package main;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the boring string:");
        String boringString = scanner.nextLine();

        System.out.println("Enter the number of ranges:");
        int numRanges = scanner.nextInt();

        System.out.println("Enter the start indexes:");
        scanner.nextLine();

        String input = scanner.nextLine();

        String[] stringStartIndexes = input.split(" , ");

        List<Integer> startIndexes = new ArrayList<>(stringStartIndexes.length);


        for (int i = 0; i < stringStartIndexes.length; i++) {

            startIndexes.add(Integer.parseInt(stringStartIndexes[i]));

        }

        System.out.println(startIndexes);

        System.out.println("Enter the end indexes:");

        String endInput = scanner.nextLine();

        String[] stringEndIndexes = endInput.split(" , ");

        List<Integer> endIndexes = new ArrayList<>(stringStartIndexes.length);


        for (int i = 0; i < stringEndIndexes.length; i++) {

            endIndexes.add(Integer.parseInt(stringEndIndexes[i]));

        }

        System.out.println(endIndexes);

        List<Operation> funnyOperations = new ArrayList<>(List.of(
                new Lower(new Reverse(new Base())),
                new Reverse(new Base()),
                new Reverse(new Base()),
                new Reverse(new Upper(new Lower(new Base()))),
                new Upper(new Lower(new Reverse(new Base())))
        ));

        StringFunifier stringFunifier = new StringFunifier(boringString, startIndexes, endIndexes, funnyOperations);


        System.out.println(stringFunifier.funnyOperations);

        String funnyString = stringFunifier.getFunnyString();

        System.out.println("Funny String:");
        System.out.println(funnyString);

    }

    public static Operation getOperationCombination(List<String> stringOperations) {
        Operation operation = new Base();

        for (var currentOperation : stringOperations) {
            switch (currentOperation) {
                case "REVERSE" -> {
                    operation = new Reverse(operation);
                }
                case "UPPERCASE" -> {
                    operation = new Upper(operation);
                }
                case "COMPRESSION" -> {
                    operation = new Compress(operation);
                }
                case "SORT" -> {
                    operation = new Sort(operation);
                }
                case "LOWERCASE" -> {
                    operation = new Lower(operation);
                }

            }
        }

        return operation;
    }
}


//Input:
//ccchHJKkklmlmmml
//1 , 5 , 7 , 11 , 13
//3 , 5 , 10 , 12 , 14
//"REVERSE", "UPPERCASE", "SORT", "LOWERCASE", "COMPRESSION"
//getFunnyString() => c(hcc)H(J)K(kklm)(lm)(m2)l