import java.lang.*;
import java.util.Scanner;
public class area {
    public static void main(String []args)
    {
        double base,height,area;

        System.out.println("Enter base: ");


        System.out.println("Enter height: ");

        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();
        height = sc.nextDouble();
        area = base*height/2;
        System.out.println("Area of triangle is: " + area);
    }

}
