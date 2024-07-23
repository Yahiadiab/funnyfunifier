package main.OperationInterface.impl.OperationDecorators;

import main.OperationInterface.Operation;
import main.OperationInterface.impl.OperationDecorator;

public class Compress extends OperationDecorator {

    public Compress(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }
        return compressed;
    }
}
