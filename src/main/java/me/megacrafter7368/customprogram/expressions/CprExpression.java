package me.megacrafter7368.customprogram.expressions;

import java.util.HashMap;

public abstract class CprExpression {

    // TODO: Add known size to hashmap for startup optimization
    public static HashMap<String, CprExpression> exprMap = new HashMap<>();

    public CprExpression(String identifier) {
        exprMap.put(identifier, this);
    }

    public abstract void interpret(String[] args);
}