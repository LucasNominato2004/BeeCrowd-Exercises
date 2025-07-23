import java.io.IOException;
import java.util.*;

public class Main {
    public static int[] array = new int[3];
    public static void bubblesort(){
        int N = 3;
        for(int i = 0; i < N - 1; i++){
            for(int j = N - 1; j > i; j--){
                if(array[j] < array[j - 1]) swap(j, j - 1);
            }
        }
    }
    
    public static void swap(int i, int j){
        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();
        int[] arrayB = new int[3];
        arrayB[0] = array[0];
        arrayB[1] = array[1];
        arrayB[2] = array[2];
        
        bubblesort();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        
        scanner.close();
    }
}
