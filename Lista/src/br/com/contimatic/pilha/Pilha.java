package br.com.contimatic.pilha;

public class Pilha {

	NoPIlha topo;
	private int size;

	public Pilha() {
		this.topo = null;
	}

	public void push(Integer dado) {
		NoPIlha novo = new NoPIlha(dado);
		novo.setNext(topo);
		topo = novo;
		size++;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public Integer pop() {
		if (!isEmpty()) {
			NoPIlha aux = topo;
			topo = topo.getNext();
			return aux.getDado();
		}
		return -1;
	}

	public void mostra() {
		if (isEmpty()) {
			System.out.println("Pilha vazia.");
		} else {
			NoPIlha atual = topo; // inicia do topo
			while (atual != null) { // até do final
				atual.displayNo(); // exibe a informação don
				atual = atual.getNext(); // move para o proximo nó
			}
			System.out.println();
		}

	}
}
