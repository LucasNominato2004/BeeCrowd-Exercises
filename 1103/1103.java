import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int H1, M1, H2, M2, numMinutos = 0;
        do { 
            H1 = scanner.nextInt();
            M1 = scanner.nextInt();
            H2 = scanner.nextInt();
            M2 = scanner.nextInt();

            if (H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0) break;

            if (H1 == H2 && M2 >= M1) 
                numMinutos = M2 - M1;
            else if (H1 < H2) 
                numMinutos = (H2 - H1) * 60 + M2 - M1;
            else 
            	numMinutos = (24 - H1 + H2) * 60 + (M2 - M1);

            System.out.println(numMinutos);
        } while (!(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0));
        
        scanner.close();
    }
}
