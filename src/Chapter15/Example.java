package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {
    public static void main(String[] args) {
        String location = "C:\\Users\\User\\Documents\\";
        String filename = "newfile.txt";
        Path filePath = Path.of(location, filename);


        System.out.println(Files.exists(filePath));
        try {
            System.out.println(Files.createFile(filePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}