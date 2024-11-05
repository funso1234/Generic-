package Chapter15.Task;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class PhotoFunction {

    public static void photoReader() throws IOException {
        String filename = "C:\\Users\\User\\Desktop\\StringClass\\src\\Chapter15\\Task\\Photo.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileInputStream fileInputStream = new FileInputStream(filename)) {
            List<Photo> photoList = objectMapper.readValue(fileInputStream, new TypeReference<List<Photo>>() {
            });
            for (Photo photo : photoList) {
                if(photo.getId() %2 == 0){
                    System.out.println(photo);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        photoReader();
    }
}
