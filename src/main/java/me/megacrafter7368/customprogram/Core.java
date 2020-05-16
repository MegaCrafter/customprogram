package me.megacrafter7368.customprogram;

import java.io.File;
import java.net.URISyntaxException;

public class Core {

    private VarStore varStore = new VarStore();
    private Parser parser;

    public Core() {
        try {
            parser = new Parser(new File(Core.class.getResource("/main.cpr").toURI()));
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static Core instance;

    public static void main(String[] args) {
        instance = new Core();
        instance.parser.parseThrough();
    }

    public static Core get() {
        return instance;
    }

    public VarStore varStore() {
        return varStore;
    }

    public Parser parser() {
        return parser;
    }
}