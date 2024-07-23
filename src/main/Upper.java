package main;

public class Upper extends OperationDecorator {

    public Upper(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {
        substring = super.trial(substring);
        return new StringBuilder(substring.toString().toUpperCase());
    }
}
