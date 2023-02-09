package com.bomfim.codereview.service.format;

public class DoubleSpaceWord implements FormatWord {

    private String currentMessage;

    @Override
    public String format(String message) {
        currentMessage = message;
        return currentMessage.replace(" ", "  ");
    }
}
