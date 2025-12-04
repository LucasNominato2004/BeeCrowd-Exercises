import java.io.IOException;
import java.util.*;

class No{
    String elemento;
    No esq, dir;
    No(String elemento){
        this.elemento = elemento;
        this.esq = null;
        this.dir = null;
    }
}
class Arvore{
    No raiz;
    
    public Arvore(){
        raiz = null;
        
    }
    
    public void inserir(String elemento){
        raiz = inserir(raiz, elemento);
    }
    public No inserir(No i, String elemento){
        if(i == null){
            i = new No(elemento);
        } 
        else if(elemento.compareTo(i.elemento) < 0){
            i.esq = inserir(i.esq, elemento);
        }else if(elemento.compareTo(i.elemento) > 0){
            i.dir = inserir(i.dir, elemento);
        }
        return i;
    }
    
    public void caminharCentral(){
        caminharCentral(raiz);
    }
    public void caminharCentral(No i){
        if(i != null){
            caminharCentral(i.esq);
            System.out.println(i.elemento);
            caminharCentral(i.dir);
        }
    }
    
}
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Arvore arvore = new Arvore();
        
        while(scanner.hasNext()){
            String frase = scanner.nextLine();
            String frase2 = "";
            for(int i = 0; i < frase.length(); i++){
                if(frase.charAt(i) < 65 || (frase.charAt(i) > 90 && frase.charAt(i) < 97) || frase.charAt(i) > 122){
                    frase2 += " ";
                }else if(frase.charAt(i) >= 65 && frase.charAt(i) <= 90){
                    frase2 += (char)(frase.charAt(i) + 32);
                }else frase2 += frase.charAt(i);
            }
            String palavra[] = frase2.split(" ");
            for(int i = 0; i < palavra.length; i++){
                if(!palavra[i].equals("")){
                    arvore.inserir(palavra[i]);
                }
            }
        }
        arvore.caminharCentral();
        scanner.close();
    }
 
}
