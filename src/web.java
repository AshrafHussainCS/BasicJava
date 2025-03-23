import java.util.Scanner;

public class web {
    public static void main (String []args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Url: ");
        String url = scan.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("Hyper text transfer protocol");
        else if (protocol.equals("ftp"))
            System.out.println("file transfer protocol");
        String ext=url.substring(url.lastIndexOf(".")+1);

        if(ext.equals("com"))
            System.out.println("comercial");
        else if (ext.equals("org"))
            System.out.println("Organaization");




    }
}
