import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int N = scanner.nextInt();
        int[] array = new int[N];
        boolean venceu = true;
        
        for(int i = 0; i < N; i++){
            array[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < N - 1; i++){
            if(array[i] > array[i + 1]){
                if((array[i] - array[i + 1]) > P) venceu = false;
            }else{
                if((array[i + 1] - array[i]) > P) venceu = false;
            }
        }
        if(venceu == true) System.out.println("YOU WIN");
        else System.out.println("GAME OVER");
        
        scanner.close();
    }
 
}
