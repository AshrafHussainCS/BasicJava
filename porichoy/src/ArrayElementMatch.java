public class ArrayElementMatch {

    public static boolean compareAndSwap(int[] A1, int[] A2) {
        
        for (int I = 0; I < A1.length; I++) {
            int J = I;  
            
            
            while (A1[I] != A2[J]) {
                if (J >= A1.length) {  
                    return false;
                }
                J++;  
            }
            
            
            int TMP = A2[J];
            A2[J] = A2[I];
            A2[I] = TMP;
        }
        
        return true;  
    }

    public static void main(String[] args) {
        
        int N = 100;
        int[] A1 = new int[N];
        int[] A2 = new int[N];
        
        
        for (int i = 0; i < N; i++) {
            A1[i] = i + 1;  
            A2[i] = i + 1;  
        }

        
        java.util.Collections.shuffle(java.util.Arrays.asList(A2));

        
        boolean result = compareAndSwap(A1, A2);
        System.out.println("Result: " + result);

        
        System.out.println("Modified A2 array:");
        for (int i = 0; i < A2.length; i++) {
            System.out.print(A2[i] + " ");
        }
    }
}
