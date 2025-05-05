package EX_01_decrement_operator;

public class Task_004
{
    public static void main(String[] args) {

        int num1 =Integer.parseInt(args[0]);
        int num2 =Integer.parseInt(args[1]);

        int result = (num1>num2)?num1:num2;
        System.out.println("this num is greeater:" +result);
    }
}
