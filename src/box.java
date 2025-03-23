import java.util.Scanner;

public class box {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;

        System.out.println("Enter lenght breadth height");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalArea = 2*(length*breadth+length*height+breadth*height);
        volume = length*breadth;

        System.out.println(" Here is the total area: "+ totalArea);
        System.out.println("The volume is: " + volume);




    }
}
