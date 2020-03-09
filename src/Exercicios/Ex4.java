package Exercicios;

public class Ex4 {
	public Livro dados[];
	public int tamanho;
	
	public Ex4() {
		dados = new Livro[5];
		tamanho = 0;
	}
	
	public boolean cheia() {
		if(tamanho == dados.length) {
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
	
	public void adicionar(Livro livro) {
		if(!cheia()) {
			dados[tamanho] = livro;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Lista cheia!");
		}
	}
	
	
	public Livro remover() {
		Livro removido = null;
		if(vazia()) {
			System.out.println("Lista vazia!");
		}
		else {
			removido = dados[tamanho - 1];
			dados[tamanho - 1] = null;
			tamanho = tamanho - 1;
		}
		return removido;
	}
	
	public void mostrarPilha() {
		for(int i = 0;i <= tamanho - 1;i++) {
			System.out.println(dados[i].getTitulo() + " " +  dados[i].getQtdExemplares());
		}
		System.out.println("\nTamanho = " + this.tamanho);
	}
	
	
	
	
	
	
	
	public static void main(String args[]) {
		Ex4 livro = new Ex4();
		Livro l = new Livro();
		
		Livro f = new Livro();
		
		Livro c = new Livro();
		
		f.setTitulo("Bla");
		f.setQtdExemplares(30);
		
		l.setTitulo("Natan");
		l.setQtdExemplares(20);
		
		livro.adicionar(l);
		
		livro.adicionar(f);
		
		c = livro.remover();
		
		System.out.println(c.getTitulo() + " " +  c.getQtdExemplares());
		
		livro.mostrarPilha();
	
		
	}
	
}