package Chapter15.Task;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;

import static Chapter15.Task.PhotoFunction.photoReader;

public class TransactionJSON {
    public static void main(String[] args) {
        String location = "C:\\Users\\User\\Desktop\\StringClass\\src\\";
        Path path =Path.of(location,"Transaction.json");

        Transaction transaction = new Transaction(1,new BigDecimal(23),"refer",(LocalDate.now()));
        Transaction transaction1 = new Transaction(2,new BigDecimal(50),"refer",(LocalDate.now()));

        ArrayList<Transaction> transactions = new ArrayList<>();
        transactions.add(transaction);
        transactions.add(transaction1);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try(FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(path))){
            mapper.writeValue(fileOutputStream, transactions);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }


}
