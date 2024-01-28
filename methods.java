package practice;
import java.util.Scanner;

public class methods {
    static void declare(int age){
        if (age < 18){
            System.out.print("underage");
        }
        else if(age > 18){
            System.out.print("Legal age");
        }
    }
    public static void main(String[] args){
          Scanner obj = new Scanner(System.in);
          System.out.print("Please enter your Age : ");
          int age = obj.nextInt();
          declare(age);
          obj.close();

    }
}
