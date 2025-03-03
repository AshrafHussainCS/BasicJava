import java.math.BigInteger;

public class FunctionCalculator {
    public static void main(String[] args) {
        int N = 1000;

        // log N (base 2)
        double logN = Math.log(N) / Math.log(2);

        // N
        int N_value = N;

        // N^2
        long N_squared = (long) N * N;

        // N^3
        long N_cubed = (long) N * N * N;

        // 2^N using BigInteger for large numbers
        BigInteger twoPowerN = BigInteger.valueOf(2).pow(N);

        // Display results
        System.out.println("log N (base 2) when N = " + N + ": " + logN);
        System.out.println("N when N = " + N + ": " + N_value);
        System.out.println("N^2 when N = " + N + ": " + N_squared);
        System.out.println("N^3 when N = " + N + ": " + N_cubed);
        System.out.println("2^N when N = " + N + ": " + twoPowerN);
    }
    
}
