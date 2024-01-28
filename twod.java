package practice;
import java.util.Scanner;

public class twod {

    static void printingarray(int[][] kamalsalary,String[] hari){
       for(int i = 0; i < kamalsalary.length; i++){
            for(int j = 0; j < kamalsalary[i].length; j++){
                System.out.println("Salary for employee " + (i + 1) + " for day " + hari[j] + " is " + kamalsalary[i][j]);
            }
       }
    }


    public static void main(String[] args){
        int[][] salary = new int[3][2];
        Scanner obj = new Scanner(System.in);
        String[] days = {"Monday","Tuesday"};

        for (int i = 0; i < salary.length; i++){
            for (int j = 0; j < salary[i].length; j++){
                System.out.print("Please enter your salary for employee " + (i + 1) + " for day " + days[j] + " : "  );
                int mysalary = obj.nextInt();
                salary[i][j] = mysalary;
            }
        }
        
        obj.close();
      
        printingarray(salary,days);
        System.out.println("salary[0][1] : " + salary[0][1]);
    }
    
}
