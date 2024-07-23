package main.OperationInterface.impl.OperationDecorators;

import main.OperationInterface.Operation;
import main.OperationInterface.impl.OperationDecorator;

public class Lower extends OperationDecorator {


    public Lower(Operation decoratedoperations) {
        super(decoratedoperations);
    }

    @Override
    public StringBuilder trial(StringBuilder substring) {
        substring = super.trial(substring);
        return new StringBuilder(substring.toString().toLowerCase());
    }
}
