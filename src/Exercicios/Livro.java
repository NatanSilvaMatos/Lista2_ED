package Exercicios;

public class Livro {
	String Titulo;
	int QtdExemplares;
	
	public Livro() {
		Titulo = null;
		QtdExemplares = 0;
	}
	
	public void setTitulo(String nome) {
		this.Titulo = nome;
	}
	
	public String getTitulo() {
		return this.Titulo;
	}
	
	public void setQtdExemplares(int quantidade) {
		this.QtdExemplares = quantidade;
	}
	
	public int getQtdExemplares() {
		return this.QtdExemplares;
	}
	
	
	
}
