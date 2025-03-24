public class calculating {
    public static void main(String[] args) {
        // Loop through n = 1 to 100
        for (int n = 1; n <= 100; n++) {
            // Calculate 3n^2 + 2n + 5
            int result = 3 * n * n + 2 * n + 5;
            
            // Print the result for each n
            System.out.println("n = " + n + ", 3n^2 + 2n + 5 = " + result);
        }
    }
}
