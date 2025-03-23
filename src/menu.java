import java.util.Scanner;
public class menu {
    public static void main(String []args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("Add");
        System.out.println("Mul");
        System.out.println("Divide");

        System.out.println("Enter two numbers: ");
        int x = scan.nextInt();
        int y= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter option in word: ");
        String option = scan.nextLine();


        switch (option) {
            case "Add":
                System.out.println("Sum is: "+(x+y));
                break;
            case "sub":
                System.out.println("Differnce is "+(x-y));
                break;
            default: System.out.println("Invalid option");
                break;

        }


    }
}
