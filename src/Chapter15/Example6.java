package Chapter15;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example6 {
    public static void main(String[] args) {
        Cat ologbo = new Cat("ologbo",10);
        ObjectMapper objectMapper = new ObjectMapper();

        try{
            String json = objectMapper.writeValueAsString(ologbo);
            System.out.println(json);
        }catch (JsonProcessingException e){
            System.out.println("error serializing to json with msg: " + e.getMessage());
        }
    }

}
