package Chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        String location = "C:\\Users\\User\\Desktop\\StringClass\\src\\Chapter15\\";
        String filename = location.concat("output.txt");
        try(FileInputStream inputStream = new FileInputStream(filename)){
            byte[] data = inputStream.readAllBytes();
            System.out.println(new String(data));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
