package main.OperationInterface.impl;

import main.OperationInterface.Operation;

public class Base implements Operation {
    @Override
    public StringBuilder trial(StringBuilder substring) {
        return substring;
    }
}
