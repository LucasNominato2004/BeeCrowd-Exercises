import java.util.*;
import java.io.*;


class No{
	public String elemento;
	public No esq, dir;
	
	No(String elemento){
		this.elemento = elemento;
		this.esq = null;
		this.dir = null;
	}
}
class Arvore{
	No raiz;
	int coletados;
	
	public Arvore(){
		raiz = null;
		coletados = 0;
	}
	public void inserir(String elemento){
		raiz = inserir(elemento, raiz);
	}
	private No inserir(String elemento, No i){
		if(i == null){
			i = new No(elemento);
			coletados++;
		}else if(elemento.compareTo(i.elemento) < 0){
			i.esq = inserir(elemento, i.esq);
		}else if(elemento.compareTo(i.elemento) > 0){
			i.dir = inserir(elemento, i.dir);
		}
		return i;
	}
}


class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Arvore arvore = new Arvore();
		
		int N = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < N; i++){
			String pomekon = scanner.nextLine();
			arvore.inserir(pomekon);
		}
		
		int total = 151 - arvore.coletados;
		System.out.println("Falta(m) " + total + " pomekon(s).");
		
		
		scanner.close();
	}
}
