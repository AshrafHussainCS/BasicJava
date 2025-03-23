import java.util.Scanner;
public class factorialberkor {
    public static void main (String []args ) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = scan.nextInt();
        long fact =1;


        for(int i=1; i<=n; i++) {

            fact = fact*i;


        }

        System.out.println("Factriol of " + n +" is "+  fact);


    }
}
