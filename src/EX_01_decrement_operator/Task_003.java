package EX_01_decrement_operator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name,age,salaryp");
        String Name = sc.next();
        int Age =sc.nextInt();
        String Salery=sc.next();
        System.out.println("name is : "+Name+ "Age is : "+Age+ "salary is : "+Salery);

    }
}
