package Chapter15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example1 {
    public static void main(String[] args) {
        String locator = "C:\\Users\\User\\Desktop";
        Path fileLocation = Path.of(locator,"sammy.txt");

        try {
            Files.createFile(fileLocation);
            System.out.println(Files.size(fileLocation));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
