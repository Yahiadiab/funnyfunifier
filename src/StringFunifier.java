import java.util.*;

public class StringFunifier {
    public String[] operations;
    public String boringString;
    public int[] starttrialIndexes;
    public int[] endIndexes;
    public Map<String, Operations> operationsMap;



    public StringFunifier(String boringString, String[] operations, int[] starttrialIndexes, int[] endIndexes) {
        this.boringString = boringString;
        this.starttrialIndexes = starttrialIndexes;
        this.endIndexes = endIndexes;
        this.operations = operations;
        this.operationsMap = new HashMap<>();

        initilizeOperationMap();
    }

    private void initilizeOperationMap() {

        operationsMap.put("REVERSE", new Reverse());
        operationsMap.put("LOWERCASE", new Lower());
        operationsMap.put("UPPERCASE", new Upper());
        operationsMap.put("SORT", new sort());
        operationsMap.put("COMPRESSION", new compress());

    }


    public String getFunnyString() {
        StringBuilder funnyString = new StringBuilder(boringString);

        for (int i = starttrialIndexes.length - 1; i >= 0; i--) {
            int start = starttrialIndexes[i];
            int end = endIndexes[i];
            String substring = funnyString.substring(start, end + 1);
            String modifiedSubstring = applyOperation(substring, operations[i]);
            funnyString.replace(start, end + 1, "(" + modifiedSubstring + ")");
        }

        return funnyString.toString();
    }






    public String applyOperation(String substring, String operation) {
        Operations op = operationsMap.get(operation);
        if (op == null) {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        return op.trial(substring);
    }
}
