import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int num = 0;
        while(num < 3){
            String input = scanner.nextLine();
            if(input.equals("caw caw")){
                num++;
                System.out.println(total);
                total = 0;
            }
            else{
                int count = 4;
                for(int i = 0; i < 3; i++){
                    if(input.charAt(i) == '*') total += count;
                    count = count / 2;
                }
            }
            
        }
        
        scanner.close();
    }
 
}
