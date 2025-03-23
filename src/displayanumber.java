import java.util.*;
public class displayanumber {
    public static void main(String []args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a Number");
     int n =scan.nextInt();
     int r;
     String str ="";

     while(n>0) {
         r=n%10;
         n=n/10;
         str = str + r;

     }
     System.out.println(str);

     char c;
     for (int i=str.length()-1; i>0; i--) {
         c = str.charAt(i);
         switch (c) {
             case '0': System.out.print("Zero");
             break;
             case '1': System.out.print("one");
                 break;
             case '2': System.out.print("two");
                 break;
             case '3': System.out.print("three");
                 break;
             case '4': System.out.print("four");
                 break;
             case '5': System.out.print("five");
                 break;
             case '6': System.out.print("Six");
                 break;
             case '7': System.out.print("seven");
                 break;


         }

     }



    }
}
