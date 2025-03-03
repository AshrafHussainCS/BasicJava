import java.util.Arrays;

public class PrefixAverages2 {

    
    public static double[] prefixAverages2(int[] X) {
        int N = X.length; 
        double[] A = new double[N];  
        int S = 0;  
        
        
        for (int i = 0; i < N; i++) {
            S += X[i];  
            A[i] = (double) S / (i + 1);  
        }
        
        return A;  
    }

    public static void main(String[] args) {
        int N = 100;  
        int[] X = new int[N];  
        
        
        for (int i = 0; i < N; i++) {
            X[i] = i + 1;
        }

        
        double[] result = prefixAverages2(X);

    
        System.out.println("Prefix Averages:");
        System.out.println(Arrays.toString(result));
    }
}
