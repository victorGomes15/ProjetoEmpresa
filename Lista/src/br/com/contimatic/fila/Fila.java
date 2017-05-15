package br.com.contimatic.fila;

public class Fila {

	NoEncadeado inicio, fim;
	private int size;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public void enqueue(Integer dado) {
		NoEncadeado novo = new NoEncadeado(dado);

		if (isEmpty()) {
			inicio = novo;
			fim = inicio;
		} else {
			fim.setNext(novo);
			fim = novo;
		}
		size++;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public NoEncadeado dequeue() {
		if (isEmpty()) {
			System.out.println("Fila Vazia");
		} else {
			NoEncadeado aux = inicio;
			inicio = inicio.getNext();
			size--;
			return aux;
		}
		return null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.print("Fila vazia.");
		} else {
			NoEncadeado atual = inicio; // do inicio
			while (atual != null) { // até o final
				// exibe a informação do nó
				atual.display();;
				// move para o proximo nó
				atual = atual.getNext();
			}
			System.out.println();
		}
	}
}
