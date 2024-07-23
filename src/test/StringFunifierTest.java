//package test;
//
//import main.*;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//
//import java.util.*;
//
//import static org.junit.Assert.assertEquals;
//
//class StringFunifierTest {
//
//    @Test
//    void getFunnyString() {
//
//
//        String boringString = "ccchHJKkklmlmmml";
//
//        List<Operation> funnyOperations = new ArrayList<>(List.of(
//                new Lower(new Reverse(new Base())),
//                new Reverse(new Base()),
//                new Reverse(new Base()),
//                new Reverse(new Upper(new Lower(new Base()))),
//                new Upper(new Lower(new Reverse(new Compress(new Base()))))
//        ));
//
//        List<Integer> startIndexes = new ArrayList<>(List.of(1 , 5 , 7 , 11 , 13));
//        List<Integer> endIndexes = new ArrayList<>(List.of(3 , 5 , 10 , 12 , 14));
//
//
//
//        StringFunifier testVariable = new StringFunifier(boringString, startIndexes, endIndexes, funnyOperations);
//
//        Assertions.assertEquals("c(hcc)H(J)K(mlkk)(ML)(2M)l", testVariable.getFunnyString());
//    }
//
//}