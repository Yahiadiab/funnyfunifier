package test;

import main.StringFunifier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class StringFunifierTest {

    @Test
   void getFunnyString() {


        String boringString = "ccchHJKkklmlmmml";
        String[] operations = {"REVERSE", "UPPERCASE", "LOWERCASE", "SORT", "COMPRESSION", "REVERSE"};
        int[] starttrialIndexes = {0, 2, 5, 7, 10, 12};
        int[] endIndexes = {2, 3, 5, 9, 11, 13};
        StringFunifier testvariable = new StringFunifier( boringString, operations, starttrialIndexes, endIndexes);

        Assertions.assertEquals("c(cch)H(J)K(kklm)(lm)(mm)l", testvariable.getFunnyString());
  }

}