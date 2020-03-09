package Exercicios;

public class Ex3 {
	public int pilha[];
	public int tamanho;
	public Lista lista[];
	
	public Ex3() {
		this.pilha = new int[5];
		this.tamanho = 0;
	}
	
	public boolean cheia() {
		if(tamanho == pilha.length) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	public boolean vazia() {
		if(tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adicionar(int numero) {
		if(!cheia()) {
			pilha[tamanho] = numero;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Pilha cheia!");
		}
	}
	
	public void remover() {
		if(!vazia()) {
			pilha[tamanho - 1] = 0;
			tamanho = tamanho - 1;
		}
		else {
			System.out.println("Pilha vazia!");
		}
	}
	
	public void status() {
		for(int i = 0;i <= 4;i++) {
			System.out.print(pilha[i] + " ");
		}
	}
	
	public static void main(String args[]) {
		Ex3 pilha = new Ex3();
		
		pilha.adicionar(2);
		pilha.adicionar(2);
		pilha.adicionar(2);
		pilha.adicionar(2);
		pilha.adicionar(1);
		
		//pilha.adicionar(4);
		
		pilha.remover();
		pilha.remover();
		
		pilha.adicionar(1);
		
		
		pilha.status();
		
	}
	
}
