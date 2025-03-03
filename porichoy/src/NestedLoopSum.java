public class NestedLoopSum {

    public static void main(String[] args) {
        int N = 100;  
        int I = 1;  
        int SUM = 0;  

        
        while (I <= N) {
            int J = 1;  

            
            while (J <= N) {
                SUM = SUM + I;  
                J = J + 1;  
            }

            I = I + 1;  
        }

        
        System.out.println("The value of SUM is: " + SUM);
    }
}
