public class replce {
    public static void main (String[] args) {
        String str = "A@sh%raf";
        System.out.println(str.replaceAll("[^a-z,A-Z 0-9]", ""));
    }
}
