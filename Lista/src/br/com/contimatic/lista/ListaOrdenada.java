package br.com.contimatic.lista;

public class ListaOrdenada {
	private No inicio;
	private int size;

	public void inserir(int elem) { // insere na lista em ordem crescente
		No novoNo = new No(elem);

		// pesquisar a posição do elemento
		No atual = inicio, previo = null;
		
		while (atual != null && elem > (Integer)atual.getDado()) {//looping pra descobrir onde o elemento vai ser maior que o dado ja cadastrado
			previo = atual;
			atual = (No) atual.getNext();
		}
		if (previo == null) { // insere no inicio da lista
			novoNo.setNext(inicio);
			inicio = novoNo;
		} else { // insere à frente de um elemento
			novoNo.setNext(atual);
			previo.setNext(novoNo);
		}

		size++;
	}

	public void remover(int elem) { // elimina o primeiro item da lista

		if (inicio == null) { // teste de lista vazia
			System.out.println("Lista Vazia!");
			return;
		}
		// pesquisar a posição do elemento
		No del = inicio, previo = null;
		while (del != null && elem != (Integer)del.getDado()) {
			previo = del;
			del = (No) del.getNext();
		}
		// se o elemento existir removê-lo
		if (del == inicio) // a lista só tem um elemento
			inicio = (No) inicio.getNext();
		else if (del != null)
			previo.setNext(del.getNext()); // remove numa posição intermediária
	}

	
	public String toString() {

		// Verificando se a Lista está vazia
		if (this.size == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No atual = inicio;

		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.size - 1; i++) {
			builder.append(atual.getDado());
			builder.append(", ");
			atual = (No) atual.getNext();
		}

		// último elemento
		builder.append(atual.getDado());
		builder.append("]");

		return builder.toString();
	}

}
