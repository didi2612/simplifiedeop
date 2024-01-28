package practice;
import java.util.Scanner;

public class oned {
   static void agecheck(int[] legal){
     for(int i = 0; i < legal.length; i++){
        if ( legal[i] < 18) {
            System.out.print("The age " + legal[i] + " is underage ! \n");
        }
        else if( legal[i] > 18){
            System.out.print("The age " + legal[i] + " is legal ! \n");
        }

     }
   }
   public static void main(String[] args){
    int[] age = new int [5];
    Scanner obj = new Scanner(System.in);
      for(int i = 0; i < age.length; i++){
        System.out.print("Please enter your age : ");
        int umur = obj.nextInt();
        age[i] = umur;
        System.out.print(umur); 
        System.out.print("\n"); 
        
      }
     
    obj.close();

    agecheck(age);

   } 
    
}
