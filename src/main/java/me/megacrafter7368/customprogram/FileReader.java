package me.megacrafter7368.customprogram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    private List<String> lines;
    public FileReader(File file) {
        try {
            this.lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    

}