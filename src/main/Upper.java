package main;

public class Upper extends OperationDecorator {

    public Upper(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public String trial(String str) {
        str = super.trial(str);
        return str.toUpperCase();
    }
}
