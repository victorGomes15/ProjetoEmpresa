package br.com.contimatic.lista;

public class Main {

	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.adicionaNoComeco(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adicionaNoComeco(4);
		lista.adiciona(5);
		lista.adiciona(0, 90);
		lista.removeDoComeco();
		lista.removeDoFim();
		System.out.println(lista.contem(3));
		System.out.println(lista.toString());

		System.out.println("LIsta Circular");

		ListaCircular listaCircular = new ListaCircular();

		listaCircular.adiciona(10);
		listaCircular.adiciona(20);
		listaCircular.adiciona(4);
		System.out.println(listaCircular);

		System.out.println("Lista Ordenada");

		ListaOrdenada lOrdenada = new ListaOrdenada();

		lOrdenada.inserir(10);
		lOrdenada.inserir(4);
		lOrdenada.inserir(3);
		lOrdenada.inserir(60);
		System.out.println(lOrdenada);

	}

}
