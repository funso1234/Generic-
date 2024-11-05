package Chapter15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example5 {
    public static void main(String[] args) {
        String location = "C:\\Users\\User\\Desktop\\StringClass\\src\\Chapter15\\";
        String filename =location.concat("output.txt");
        try(FileReader fileReader = new FileReader(filename)) {
            char[] buffer = new char[1024];
            fileReader.read(buffer);
            System.out.println(buffer);
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
