public class InversionCounter {

    public static int inversionCounter(int[] A, int N) {
        int count = 0;  

        
        for (int i = 0; i < N - 1; i++) {
            
            for (int j = i + 1; j < N; j++) {
                
                if (A[i] > A[j]) {
                    count++;  
                }
            }
        }

        return count;  
    }

    public static void main(String[] args) {
        int N = 100;  
        int[] A = new int[N];

        
        for (int i = 0; i < N; i++) {
            A[i] = (int)(Math.random() * 1000);  
        }

        
        int inversionCount = inversionCounter(A, N);

        
        System.out.println("The number of inversions is: " + inversionCount);
    }
}
