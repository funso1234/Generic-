package Chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Example3 {
    public static void main(String[] args) {
        String location = "C:\\Users\\User\\Desktop\\StringClass\\src\\Chapter15\\";
        String filename = location.concat("output.txt");
        String text = "Hello Sammie";
        try(FileOutputStream outputStream = new FileOutputStream(filename, true)){
            outputStream.write(text.getBytes());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
