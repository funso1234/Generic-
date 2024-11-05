package Chapter15.Task.Task2;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TransactionJSON {
       private static String filename = "C:\\Users\\User\\Desktop\\StringClass\\src\\Chapter15\\Task\\Task2\\Folder\\Photo.json";
       private static ObjectMapper mapper = new ObjectMapper();

       public static void main(String[] args){
           transJson(filename);
       }

       public static Object transJson(String filename){
           File partName = new File(filename);
           int totalSum = 0;
           try(FileInputStream read = new FileInputStream(partName)){
               Transaction[] transactionClasses = mapper.readValue(read, Transaction[].class);
               for (Transaction transactionClass1 : transactionClasses){
                   totalSum += transactionClass1.getAmount();
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
           return totalSum;
       }
}