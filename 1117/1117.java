import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int notasValidas = 0;
        double media = 0;
        do{
            double nota = scanner.nextDouble();
            if(nota < 0 || nota > 10){
                System.out.println("nota invalida");
            }else{
                notasValidas++;
                media += nota;
            }
        }while(notasValidas != 2);
        media = media / 2;
        System.out.printf("media = %.2f\n", media);
        scanner.close();
    }
 
}
