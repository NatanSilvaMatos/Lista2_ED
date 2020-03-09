package Exercicios;

public class Ex6 {
	public Livro pilha[];
	public int tamanho;
	
	public Ex6() {
		pilha = new Livro[5];
		tamanho = 0;
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
		if(tamanho == pilha.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adiciona(Livro elemento) {
		if(cheia()) {
			System.out.println("Pilha cheia!");
		}
		else {
			pilha[tamanho] = elemento;
			tamanho = tamanho + 1;
		}
	}
	
	public Livro remove() {
		Livro removido = null;
		if(vazia()) {
			System.out.println("Pilha vazia!");
		}
		else {
			removido = pilha[tamanho - 1];
			pilha[tamanho - 1] = null;
			tamanho = tamanho - 1;
		}
		return removido;
	}
	
	public void mostrarPilha() {
		for(int i = 0;i < tamanho;i++) {
			System.out.print(pilha[i].getTitulo() + " " + pilha[i].getQtdExemplares() + "      ");
		}
		System.out.println("\nTamanho = " + this.tamanho);
	}
	
	public static void main(String args[]) {
		Ex6 pilha = new Ex6();
		Ex5 fila = new Ex5();
		
		Livro l = new Livro();
		Livro b = new Livro();
		Livro t = new Livro();
		Livro r = new Livro(); //variavel para fazer a visualizacao do elemento removido
		Livro u = new Livro();
		Livro p = new Livro();
		Livro stricken = new Livro();
		
		l.setTitulo("Jardim");
		l.setQtdExemplares(600);
		
		t.setTitulo("Hobbit");
		t.setQtdExemplares(1400);
		
		b.setTitulo("Berserk");
		b.setQtdExemplares(700);
		
		u.setTitulo("Game of Thrones");
		u.setQtdExemplares(650);
		
		p.setTitulo("Weiss");
		p.setQtdExemplares(900);
		
		stricken.setTitulo("Linkin park");
		stricken.setQtdExemplares(3);
		
		
		fila.adiciona(l);
		
		fila.adiciona(t);
		
		fila.adiciona(b);
		
		fila.adiciona(u);

		fila.adiciona(p);
		
		
		
		
		fila.mostraFila();
		
		r = fila.remove();
		
		pilha.adiciona(r);
		
		System.out.println(" ");
		
		System.out.println("Removido = " + r.getTitulo() + "  " + r.getQtdExemplares());
		
		
		fila.mostraFila();
		
		System.out.println(" ");
		r = fila.remove();
		pilha.adiciona(r);
		System.out.println("Removido = " + r.getTitulo() + "  " + r.getQtdExemplares());
		fila.mostraFila();
		
		
		System.out.println(" ");
		r = fila.remove();
		pilha.adiciona(r);
		System.out.println("Removido = " + r.getTitulo() + "  " + r.getQtdExemplares());
		fila.mostraFila();
		
		
		System.out.println(" ");
		r = fila.remove();
		pilha.adiciona(r);
		System.out.println("Removido = " + r.getTitulo() + "  " + r.getQtdExemplares());
		fila.mostraFila();
		
		System.out.println(" ");
		r = fila.remove();
		pilha.adiciona(r);
		System.out.println("Removido = " + r.getTitulo() + "  " + r.getQtdExemplares());
		fila.mostraFila();
		
		System.out.println("\n*****Pilha******");
		pilha.mostrarPilha();
		
		
	}
	
}
