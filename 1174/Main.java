import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double[] A = new double[100];
        for(int i = 0; i < 100; i++){
            A[i] = scanner.nextDouble();
             if(A[i] <= 10) System.out.println("A[" + i + "] = " + A[i]);
        }
        
        scanner.close();
    }
 
}
