package main;

public class OperationDecorator implements Operation {

    protected Operation decoratedoperations;


    public OperationDecorator(Operation decoratedoperations) {

        this.decoratedoperations = decoratedoperations;
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {
        return decoratedoperations.trial(substring);
    }
}
