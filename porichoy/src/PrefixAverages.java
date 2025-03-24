import java.util.Arrays;

public class PrefixAverages {

    // Method to calculate prefix averages using PREFIXAVERAGES2 algorithm
    public static double[] calculatePrefixAverages2(int[] X) {
        int N = X.length;  // Get the length of the array
        double[] A = new double[N];  // Array to store prefix averages
        int S = 0;  // Initialize sum
        
        // Loop to calculate prefix averages
        for (int i = 0; i < N; i++) {
            S += X[i];  // Update sum with the current element
            A[i] = (double) S / (i + 1);  // Compute average
        }
        
        return A;  // Return the array with prefix averages
    }

    public static void main(String[] args) {
        int N = 100;  // Size of the array
        int[] X = new int[N];  // Initialize array X
        
        // Fill array X with the first 100 natural numbers
        for (int i = 0; i < N; i++) {
            X[i] = i + 1;
        }

        // Calculate prefix averages using PREFIXAVERAGES2
        double[] result = calculatePrefixAverages2(X);

        // Print the result
        System.out.println("Prefix Averages:");
        System.out.println(Arrays.toString(result));
    }
}
