import java.io.*;
import java.util.*;

class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < N; i++){
            int leds = 0;
            String input = scanner.nextLine();
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == '1') leds += 2;
                else if(input.charAt(j) == '2') leds += 5;
                else if(input.charAt(j) == '3') leds += 5;
                else if(input.charAt(j) == '4') leds += 4;
                else if(input.charAt(j) == '5') leds += 5;
                else if(input.charAt(j) == '6') leds += 6;
                else if(input.charAt(j) == '7') leds += 3;
                else if(input.charAt(j) == '8') leds += 7;
                else if(input.charAt(j) == '9') leds += 6;
                else if(input.charAt(j) == '0') leds += 6;
                
            }
            System.out.println(leds + " leds");
        }
        
        scanner.close();
    }
 
}
