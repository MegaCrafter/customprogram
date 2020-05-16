package me.megacrafter7368.customprogram.exceptions;

import me.megacrafter7368.customprogram.Core;

public class UnknownExpressionException extends RuntimeException {

    public UnknownExpressionException(String expr) {
        super(String.format("Could not resolve expression '%s' at line %d", expr, Core.get().parser().getCurrentLine()));
    }
}