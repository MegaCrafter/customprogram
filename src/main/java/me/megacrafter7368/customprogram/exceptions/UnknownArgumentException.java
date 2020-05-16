package me.megacrafter7368.customprogram.exceptions;

import me.megacrafter7368.customprogram.Core;

public class UnknownArgumentException extends RuntimeException {

    public UnknownArgumentException(String expr, String arg) {
        super(String.format("Could not resolve argument '%s' for expression '%s' at line %d", expr, arg, Core.get().parser().getCurrentLine()));
    }
}