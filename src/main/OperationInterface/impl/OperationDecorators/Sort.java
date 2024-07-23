package main.OperationInterface.impl.OperationDecorators;

import main.OperationInterface.Operation;
import main.OperationInterface.impl.OperationDecorator;

import java.util.Arrays;

public class Sort extends OperationDecorator {

    public Sort(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {
        substring = super.trial(substring);
        char[] chars = substring.toString().toCharArray();
        Arrays.sort(chars);
        return new StringBuilder();
    }
}
