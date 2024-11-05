package Chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example2 {
    public static void main(String[] args) {

        String directoryLocation = "C:\\Users\\User\\Desktop";
        Path filePath = Path.of(directoryLocation);

        try(DirectoryStream<Path> directoryStream=
                    Files.newDirectoryStream(filePath);){
            directoryStream.forEach(path ->displayPath(path));
        } catch (IOException e) {
        }

    }

    private static void displayPath(Path path){
        if (Files.isDirectory(path)) createDirectoryStreamFrom(path);
        else System.out.println("File: " + path);

    }

    private static void createDirectoryStreamFrom(Path path) {
        try(var ds = Files.newDirectoryStream(path)){
            ds.forEach((x)->System.out.println(x));
        }catch(IOException e){
            System.out.println("=".repeat(100));
        }
    }
}
