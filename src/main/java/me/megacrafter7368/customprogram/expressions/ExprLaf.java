package me.megacrafter7368.customprogram.expressions;

import me.megacrafter7368.customprogram.exceptions.IllegalArgumentLengthException;
import me.megacrafter7368.customprogram.exceptions.UnknownArgumentException;

import javax.swing.*;

public class ExprLaf extends CprExpression {

    public ExprLaf() {
        super("laf");
    }

    @Override
    public void interpret(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentLengthException(args[0], 1);
        }

        try {
            if (args[1].equalsIgnoreCase("native")) {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } else if (args[1].equalsIgnoreCase("classic")) {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } else {
                throw new UnknownArgumentException(args[0], args[1]);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}