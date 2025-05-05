package EX_condition_statements;

public class Task_01
{
    public static void main(String[] args) {
        int side1=Integer.parseInt(args[0]);
        int side2=Integer.parseInt(args[1]);
        int side3=Integer.parseInt(args[2]);

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("This is equilateral traingle");
        }
        else if(side1 == side2 || side1 == side3 && side2 != side3)
        {
            System.out.println("this is isosceles traingle");
        }
        else
        {
            System.out.println("this is scalene traingle");
        }
    }
}
