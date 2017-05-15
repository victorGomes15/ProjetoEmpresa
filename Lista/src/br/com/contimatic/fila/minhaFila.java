package br.com.contimatic.fila;

public class minhaFila {

	private NoEncadeado inicio, fim;
	private int ele;

	public boolean isEmpty() {
		return ele == 0;
	}

	public void enqueue(int dado) {
		NoEncadeado novo = new NoEncadeado(dado);

		if (isEmpty()) {
			inicio = (novo);
			fim = novo;
		} else {
			fim.setNext(novo);
			fim = novo;
		}
		ele++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Lista Vazia");
			return -1;
		} else {
			int aux = inicio.getDado();
			inicio = inicio.getNext();
			ele--;
			return aux;
		}
		
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
