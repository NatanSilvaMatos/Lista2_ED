package Exercicios;

public class Lista {
	public int [] lista;
	int tamanho;
	public Ex1 fila[];
	
	public Lista(){ //Construtor
		lista = new int[5];
		tamanho = 0;
		fila = new Ex1[5];
	}
	
	public boolean vazia() {
		if(tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean cheia() {
		if(tamanho == lista.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adicionarInicio(int numero) {
		if(!cheia()) {
			if(lista[0] == 0) {
				lista[0] = numero;
				tamanho = tamanho + 1;
			}
			else {
				for(int i = tamanho;i > 0;i--) {
					lista[i] = lista[i - 1];
				}
				lista[0] = numero;
				tamanho = tamanho + 1;
			}
		}
		else {
			System.out.println("Lista cheia!");
		}
	}
	
	public void adicionarFinal(int numero) {
		if(lista[tamanho] == 0) {
			lista[tamanho] = numero;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Lista cheia!");
		}
	}
	
	public void adicionaPosicao(int numero, int posicao) {
		if(posicao > lista.length) {
			System.out.println("Posição inválida");
		}
		if(!cheia()) {
			for(int i = tamanho - 1;i >= posicao;i--) {
				lista[i + 1] = lista[i];
			}
			lista[posicao] = numero;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Lista cheia!");
		}
	}
	
	public int removerInicio() {
		int removido = 0;
		if(vazia()) {
			System.out.println("Lista vazia!");
		}
		else {
			removido = lista[0];
			for(int i = 0;i < tamanho - 1 ;i++) {
				lista[i] = lista[i + 1];
			}
			tamanho = tamanho - 1;
			lista[tamanho] = 0;
		}
		return removido;
		
	}
	
	public int removerFinal() {
		int removido = 0;
		if(vazia()) {
			System.out.println("Lista vazia!");
		}
		else {
			removido = lista[tamanho - 1];
			lista[tamanho - 1] = 0;
			tamanho = tamanho - 1;
		}
		return removido;
	}
	
	public int removerPosicao(int posicao) {
		if(posicao > lista.length) {
			System.out.println("Posição inválida");
		}
		int removido = 0;
		if(vazia()) {
			System.out.println("Lista vazia!");
		}
		else {
			removido = lista[posicao];
			for(int i = posicao;i < tamanho - 1;i++) {
				lista[i] = lista[i + 1];
			}
			tamanho = tamanho - 1;
			lista[tamanho] = 0;
		}
		return removido;
	}
	
	public void status() {
		for(int i = 0;i <= 4;i++) {
			System.out.print(lista[i] + " ");
		}
		System.out.println("\nTamanho = " + this.tamanho);
	}
	
}

