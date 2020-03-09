package Exercicios;

public class Ex1 {
	public int fila[];
	public int tamanho;
	
	public Ex1(){
		this.fila = new int[5];
		this.tamanho = 0;
	}
	
	public boolean cheia() {
		if(tamanho == fila.length) {
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
	
	public int remover() {
		if(vazia()) {
			System.out.println("Fila vazia!");
		}
		int removido = fila[0];
		if(!vazia()) {
			for(int i = 0;i < tamanho - 1;i++) {
				fila[i] = fila[i + 1];
			}
			tamanho = tamanho - 1;
			fila[tamanho] = 0;
		}
		return removido;
	}
	
	public void adicionar(int numero) {
		if(!cheia()) {
			fila[tamanho] = numero;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Fila cheia!");
		}
	}
	
	public void status() {
		for(int i = 0;i <= 4;i++) {
			System.out.print(fila[i] + " ");
		}
	}
	
}
