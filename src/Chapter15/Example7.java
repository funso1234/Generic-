package Chapter15;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class Example7 {
    public static void main(String[] args) {
        Cat ologbo = new Cat("ologbo",10);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(INDENT_OUTPUT);
        try (FileWriter fileWriter = new FileWriter("output.json")){
            objectMapper.writeValue(fileWriter, ologbo);
        } catch (IOException e) {
            System.out.println("Error serializing to json" + e.getMessage());
        }
    }
}
