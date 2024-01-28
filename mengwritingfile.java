package practice;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
 
 
 public class mengwritingfile {
     public static void main(String[] args) {
 
         File file = new File("EOP.txt");
         
         // Create a Scanner object through the File object, and use it as usual
         try(Scanner input = new Scanner(file)){
 
             // hasNext() and hasNextLine() would be useful  
             while(input.hasNextLine()){
                 System.out.println(input.nextLine());
             }            
             System.out.println("\nThe file has been successfully read!");
         }
         
         catch(FileNotFoundException ex) {
             System.out.println("File is not there, or could not open successfully..");
         }
     }    
 }
 