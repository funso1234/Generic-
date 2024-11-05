package Chapter15;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example8 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\User\\Desktop\\StringClass\\output.json";
        ObjectMapper mapper = new ObjectMapper();

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            Cat cat = mapper.readValue(fileInputStream, Cat.class);
            System.out.println("name: " + cat.getName() +"\n" + "age: " + cat.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
