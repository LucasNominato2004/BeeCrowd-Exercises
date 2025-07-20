import java.io.IOException;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int QT = scanner.nextInt();
        for(int i = 0; i < QT; i++){
            String jogador1 = scanner.next();
            String escolha1 = scanner.next();
            String jogador2 = scanner.next();
            String escolha2 = scanner.next();
            
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            String vencedor;
            if((N + M) % 2 == 0){
                if(escolha1.equals("PAR")) vencedor = jogador1;
                else vencedor = jogador2;
            }else{
                if(escolha1.equals("IMPAR")) vencedor = jogador1;
                else vencedor = jogador2;
            }
            
            System.out.println(vencedor);
        }
        scanner.close();
    }
 
}
