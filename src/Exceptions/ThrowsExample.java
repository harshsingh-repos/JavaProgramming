package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsExample {
 //IOException is a checked exception
   public static void writeFile() throws IOException{
       FileWriter writer = new FileWriter("src/Utility/inputOne.txt");
   }
    public static void readFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src/Exceptions/input.txt"));
        String line = br.readLine();
        System.out.println("Line: " + line);
        br.close();
    }

    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("File Read Error: " + e.getMessage());
        }
    }
}
