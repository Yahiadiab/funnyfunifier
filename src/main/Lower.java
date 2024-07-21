package main;

public class Lower extends OperationDecorator{


    public Lower(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {
        substring = super.trial(substring);
        return new StringBuilder(substring.toString().toLowerCase());
    }
}
