public class ArrayMax {
    public static int arrayMax(int[] A, int N) {
        int currentMax = A[0];  
        
    
        for (int i = 1; i < N; i++) {
            if (A[i] > currentMax) {  
                currentMax = A[i];    
            }
        }
        
        return currentMax;  
    }

    public static void main(String[] args) {
        int N = 100;
        int[] A = {56, 34, 23, 89, 12, 67, 45, 90, 78, 54, 32, 99, 88, 77, 65, 43, 21, 76, 55, 31,
                   66, 44, 22, 87, 11, 68, 46, 91, 79, 57, 35, 24, 100, 89, 78, 56, 33, 22, 90, 67, 55, 
                   32, 66, 45, 23, 88, 12, 69, 47, 92, 80, 58, 36, 25, 101, 90, 79, 57, 34, 23, 91, 68, 
                   56, 33, 67, 46, 24, 89, 13, 70, 48, 93, 81, 59, 37, 26, 102, 91, 80, 58, 35, 24, 92, 
                   69, 57, 34, 68, 47, 25, 90, 14, 71, 49, 94, 82, 60, 38, 27, 103, 92, 81, 59, 36, 25, 93, 
                   70, 58, 35};
        
        int result = arrayMax(A, N);  
        System.out.println("Maximum value: " + result);  
    }
}
