import java.util.Scanner;
public class switchweb {
    public static void main (String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Domain name");
        String domain =scan.nextLine();
        String ext=domain.substring(domain.lastIndexOf(".")+1);

        switch(ext) {
        case "com":System.out.println("comercial");
        break;
        case "org":System.out.println("organization");
        }



    }

}
