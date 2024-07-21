//package test;
//
//import main.Operation;
//import main.StringFunifier;
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
//        List<Operation> funnyOperations = Arrays.asList("REVERSE", "UPPERCASE", "LOWERCASE", "SORT", "COMPRESSION", "REVERSE");
//        int[] starttrialIndexes = {0, 2, 5, 7, 10, 12};
//        int[] endIndexes = {2, 3, 5, 9, 11, 13};
//
//
//        StringFunifier testvariable = new StringFunifier(boringString, starttrialIndexes, endIndexes, funnyOpeartions);
//
//        Assertions.assertEquals("c(cch)H(J)K(kklm)(lm)(mm)l", testvariable.getFunnyString());
//    }
//
//}