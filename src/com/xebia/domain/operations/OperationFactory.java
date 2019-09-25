package com.xebia.domain.operations;

public class OperationFactory {
    public Operation getOperation(String operationLabel, String oldMessage) {
        switch (operationLabel) {
            case "+":
                return new AddNumbersOperation(oldMessage);
            case "-":
                return new SubtractNumbersOperation(oldMessage);
            case "sin":
                return new SinOperation();
            default:
                    return new NoOperation(oldMessage);
        }

    }
}
