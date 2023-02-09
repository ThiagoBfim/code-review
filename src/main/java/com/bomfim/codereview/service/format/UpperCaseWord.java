package com.bomfim.codereview.service.format;

public class UpperCaseWord implements FormatWord {

    private String currentMessage;

    @Override
    public String format(String message) {
        currentMessage = message;
        return currentMessage.toUpperCase();
    }
}
