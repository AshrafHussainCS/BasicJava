
import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner (System.in);

        System.out.println("Enter first number: ");
        num1 =input.nextInt();

        System.out.println("Enter second number: ");
        num2 = input.nextInt();

        System.out.println(" Enter operation(+,-,/,*): ");
        operation = input.next();

        if (operation.equals ("+"))
        {
            System.out.println("Answer is" + (num1+num2));
        }
        if (operation.equals ("-"))
        {
            System.out.println("Answer is " + (num1-num2));
        }
        if (operation.equals ("/"))
        {
            System.out.println("Answer is "+ (num1/num2));
        }
        if (operation.equals ("*"))
        {
            System.out.println("Answer is " + (num1*num2));
        }
        

    }
}
