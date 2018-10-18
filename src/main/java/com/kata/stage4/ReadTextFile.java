package com.kata.stage4;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public final class ReadTextFile {
    public List<String> readFileFromResources(String fileName) {
        try {
            Path theFileIsLocatedHere = Paths.get(getClass().getClassLoader().getResource(fileName).toURI());
            List<String> allLinesOfTheFile = Files.readAllLines(theFileIsLocatedHere);
            return allLinesOfTheFile;
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
