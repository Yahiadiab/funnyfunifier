package main;

import java.util.Arrays;

public class Sort extends OperationDecorator {

    public Sort(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring);) {
        substring = super.trial(substring);
        char[] chars = substring.toCharArray();
        Arrays.sort(chars);
        return new substring(chars);
    }
}
