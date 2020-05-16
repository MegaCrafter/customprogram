package me.megacrafter7368.customprogram;

import me.megacrafter7368.customprogram.exceptions.UnknownExpressionException;
import me.megacrafter7368.customprogram.expressions.CprExpression;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class Parser {

    private List<String> lines;
    private int currentLine = 0;

    public Parser(File file) {
        try {
            this.lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseThrough() {
        for (String line : lines) {
            currentLine++;
            line = line.trim().replaceAll("\\s+", "\\s");

            if (line.isEmpty() || line.startsWith("#")) continue;

            String[] args = line.split("\\s");
            CprExpression expr = CprExpression.exprMap.get(args[0]);
            if (expr == null) {
                throw new UnknownExpressionException(args[0]);
            }

            expr.interpret(args);
        }
    }

    public int getCurrentLine() {
        return this.currentLine;
    }
}