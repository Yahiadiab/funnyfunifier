package main;

public class Reverse extends OperationDecorator {

    public Reverse(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {

        substring = super.trial(substring);
        return new StringBuilder(substring.reverse());
    }

}


