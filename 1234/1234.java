import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            char[] dancante = new char[input.length()];
            int prox = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    if (prox % 2 == 0) {
                        if (c >= 'a' && c <= 'z') dancante[i] = (char)(c - 32);
                        else dancante[i] = c;
                    } else {
                        if (c >= 'A' && c <= 'Z') dancante[i] = (char)(c + 32);
                        else dancante[i] = c;
                    }
                    prox++;
                } else {
                    dancante[i] = c;
                }
            }
            System.out.println(dancante)
        }
        sc.close();
    }
}
