import java.io.*;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    		
    	while(scanner.hasNextLine()){
    	    String input1 = scanner.nextLine();
            String[] partes = input1.split(" ");
 
            String input2 = scanner.nextLine();
            String[] tempo = input2.split(" : ");
            
            int dias1 = Integer.parseInt(partes[1]);
            int horas1 = Integer.parseInt(tempo[0]);
            int minutos1 = Integer.parseInt(tempo[1]);
            int segundos1 = Integer.parseInt(tempo[2]);
            
            
            String input3 = scanner.nextLine();
            String[] partes2 = input3.split(" ");
 
            String input4 = scanner.nextLine();
            String[] tempo2 = input4.split(" : ");
            
            int dias2 = Integer.parseInt(partes2[1]);
            int horas2 = Integer.parseInt(tempo2[0]);
            int minutos2 = Integer.parseInt(tempo2[1]);
            int segundos2 = Integer.parseInt(tempo2[2]);
            
            
            int segundosTotal = (dias2 * 86400 + horas2 * 3600 + minutos2 * 60 + segundos2) - (dias1 * 86400 + horas1 * 3600 + minutos1 * 60 + segundos1);
            int diasFinal = segundosTotal / 86400;
            int horasFinal = (segundosTotal - diasFinal * 86400) / 3600;
            int minutosFinal = (segundosTotal - diasFinal * 86400 - horasFinal * 3600) / 60;
            int segundosFinal = segundosTotal - diasFinal * 86400 - horasFinal * 3600 - minutosFinal * 60;
          
            System.out.println(diasFinal + " dia(s)");
            System.out.println(horasFinal + " hora(s)");
            System.out.println(minutosFinal + " minuto(s)");
            System.out.println(segundosFinal + " segundo(s)");
        }
        scanner.close();
    }
 
}
