package br.com.contimatic.pilha;

public class Pilha {

	NoPIlha inicio, fim;
	private int size;

	public Pilha() {
		this.inicio = null;
		this.fim = null;
		this.size = 0;
	}

	public void push(Integer dado) {
		NoPIlha novo = new NoPIlha(dado);

		if (isEmpty()) {
			inicio = novo;
			fim = inicio;
		} else {
			fim.setNext(novo);
			fim = novo;
		}
	}

	public boolean isEmpty() {
		return (size == 0) ? true : false;
	}

	public Integer pop() {
		if (!isEmpty()) {
			NoPIlha aux = fim;
			fim = fim.getNext();
			return aux.getDado();
		}
		return -1;
	}

	public void mostra() {
		if (isEmpty()) {
			System.out.println("Pilha vazia.");
		} else {
			NoPIlha atual = fim; // inicia do topo
			while (atual != null) { // até do final
				atual.displayNo(); // exibe a informação don
				atual = atual.getNext(); // move para o proximo nó
			}
			System.out.println();
		}

	}
}
