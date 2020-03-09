package Exercicios;


public class Ex5 {
	public Livro dados[];
	public int tamanho;
	
	public Ex5() {
		dados = new Livro[5];
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
		if(tamanho == dados.length) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void adiciona (Livro elemento) {
		if(!cheia()) {
			dados[tamanho] = elemento;
			tamanho = tamanho + 1;
		}
		else {
			System.out.println("Fila cheia!");
		}	
	}
	
	public Livro remove () {
		Livro removido = null;
		if(vazia()) {
			System.out.println("Fila vazia!");
		}
		else {
			removido = dados[0];
			
			for(int i = 0;i < tamanho - 1;i++) {
				dados[i] = dados[i + 1];
			}
			
			tamanho = tamanho - 1;
			dados[tamanho] = null;
		}
		return removido;
	}
	
	public void mostraFila() {
		if(!vazia()) {
			for(int i = 0;i < tamanho;i++) {
				System.out.print(dados[i].getTitulo() + " " +  dados[i].getQtdExemplares() + "      ");
			}
			System.out.println("\nTamanho = " + this.tamanho);
		}
		else {
			System.out.println("Fila vazia!");
		}
	}
	
	
	public static void main(String args[]) {
		Ex5 f = new Ex5();
		Livro l = new Livro();
		Livro a = new Livro();
		Livro b = new Livro();
		
		Livro c = new Livro();
		
		l.setTitulo("Hobbit");
		l.setQtdExemplares(30);
		
		a.setTitulo("Korn");
		a.setQtdExemplares(20);
		
		b.setTitulo("Let Me Go");
		b.setQtdExemplares(45);
		
		f.adiciona(l);
		
		f.adiciona(a);
		
		f.adiciona(b);
		
		c = f.remove();
		
		
		
		System.out.println(c.getTitulo() + " " +  c.getQtdExemplares());
		
		
		f.mostraFila();
		
		
	}
	
}
