public class date {
    public static void main (String[]args) {
        String str = "39/12/2024";
        System.out.println(str.matches("(0[1-9]|[12][0-9]|3[01])/[01][0-9]/[0-9]{4}"));
    }
}
