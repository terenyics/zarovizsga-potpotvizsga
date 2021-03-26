package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {

    public int encode(String path, char needle) throws IllegalArgumentException {
        if (new String("01x").indexOf(needle) == -1)
            throw new IllegalArgumentException("Needle not allowed!");

        int count = 0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray())
                    if (c == needle) count++;
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return count;
    }
}
