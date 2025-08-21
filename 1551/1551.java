//Frase Completa - 1551
import java.io.*;
import java.util.*;

public class Main {
    
    public static int verificaCompletude(int[] abecedario){
        int completude = 0;
        int quantidade = 0;
        for(int i = 0; i < 26; i++){
            if(abecedario[i] >= 1) quantidade++;
        }
        if(quantidade == 26) completude = 2;
        else if(quantidade >= 13) completude = 1;
        else completude = 0;
        
        return completude;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < N; i++){
            String frase = scanner.nextLine().trim();
            int[] abecedario = new int[26];
            for(int j = 0; j < frase.length(); j++){
                abecedario[(int)(frase.charAt(j) - 97)]++;
            }
            if(verificaCompletude(abecedario) == 2) System.out.println("frase completa");
            else if(verificaCompletude(abecedario) == 1) System.out.println("frase quase completa");
            else System.out.println("frase mal elaborada");
        }
        
        scanner.close();
    }
 
}1551
