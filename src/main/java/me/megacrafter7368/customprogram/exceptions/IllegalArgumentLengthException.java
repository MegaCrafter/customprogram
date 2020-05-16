package me.megacrafter7368.customprogram.exceptions;

import me.megacrafter7368.customprogram.Core;

public class IllegalArgumentLengthException extends RuntimeException {

    public IllegalArgumentLengthException(String expr, int minLen, int maxLen) {
        super(String.format("Argument length of '%s' must be %d <= length <= %d at line %d", expr, minLen, maxLen, Core.get().parser().getCurrentLine()));
    }

    public IllegalArgumentLengthException(String expr, int len) {
        super(String.format("Argument length of '%s' must be %d at line %d", expr, len, Core.get().parser().getCurrentLine()));
    }

}