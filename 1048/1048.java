import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        double reajuste = 0;
        if(salario >= 0 && salario <= 400) reajuste = 0.15;
        else if(salario >= 400.01 && salario <= 800) reajuste = 0.12;
        else if(salario >= 800.01 && salario <= 1200) reajuste = 0.10;
        else if(salario >= 1200.01 && salario <= 2000) reajuste = 0.7;
        else if(salario >= 2000) reajuste = 0.04;
        
        double reajustePercentual = 100 * reajuste;
        double reajusteGanho = salario * reajuste;
        salario = salario + reajusteGanho;
        System.out.printf("Novo salario: %.2f\n", salario);
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f %%\n", reajustePercentual);
    }
}
