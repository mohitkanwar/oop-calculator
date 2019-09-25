package com.xebia.domain.operations;

public class NoOperation implements Operation {
    private final String oldMessage;

    public NoOperation(String oldMessage) {
        this.oldMessage = oldMessage;
    }

    @Override
    public String onKeyPress(String input) {
        return this.oldMessage;
    }
}
