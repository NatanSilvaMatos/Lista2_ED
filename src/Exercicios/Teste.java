package Exercicios;

public class Teste {
	public static void main(String args[]) {
	Ex1 pilha = new Ex1();
	Lista lista = new Lista();
	
	lista.adicionarInicio(2);
	
	//lista.adicionarInicio(4);

	
	lista.adicionaPosicao(5, 1);
	
	lista.adicionaPosicao(6, 1);
	
	lista.adicionarInicio(7);
	
	lista.adicionarInicio(8);
	
	pilha.adicionar(3);
	
	pilha.adicionar(lista.removerInicio());
	
	lista.status();
	
	pilha.status();
	
}

}
