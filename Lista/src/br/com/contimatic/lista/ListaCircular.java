package br.com.contimatic.lista;

public class ListaCircular {
	private No inicio, fim;
	private int totalDeElementos;

	public ListaCircular() {
		this.inicio = null;
		this.fim = null;
		this.totalDeElementos = 0;
	}

	public void adiciona(int elemento) {
		if (isEmpty()) {
			this.adicionaNoComeco(elemento);
		} else {
			No nova = new No(elemento);
			this.fim.setNext(nova);
			this.fim = nova;
			this.fim.setNext(inicio);
			this.totalDeElementos++;
		}
	}

	public void adicionaNoComeco(int elemento) {
		No nova = new No(elemento);
		No aux = nova;
		if (isEmpty()) {
			// caso especial da lista vazia
			this.inicio = aux;
			this.fim = this.inicio;
			this.fim.setNext(inicio);
			this.inicio.setNext(fim);
		} else {
			aux.setNext(inicio);
			this.inicio = nova;
		}
		this.totalDeElementos++;
	}

	public boolean isEmpty() {
		return totalDeElementos == 0 ? true : false;
	}

	public String toString() {

		// Verificando se a Lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No atual = inicio;

		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getDado());
			builder.append(", ");
			atual = atual.getNext();
		}

		// último elemento
		builder.append(atual.getDado());
		builder.append("]");

		return builder.toString();
	}

}
