public class SumAlgorithm {

    public static void main(String[] args) {
        int N = 100;  
        int I = 1;  
        int SUM = 0;  

        
        while (I <= N) {
            I = I + 1;  
            SUM = SUM + I;  
        }

        
        System.out.println("The value of SUM is: " + SUM);
    }
}
