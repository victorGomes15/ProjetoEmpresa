package br.com.contimatic.lista;

public class ListaNum2 {

	private No inicio, fim;
	private int numElementos;

	public ListaNum2() {
		this.inicio = null;
		this.fim = null;
		this.numElementos = 0;
	}

	public boolean isEmpty() {
		return numElementos == 0;
	}

	public void adcionaNoInicio(Integer dado) {
		No novo = new No(dado);

		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			No aux = novo;
			aux.setNext(inicio);
			inicio = aux;
		}
		numElementos++;
	}

	public void adcionaNoFim(Integer dado) {
		No novo = new No(dado);

		if (isEmpty()) {
			adcionaNoInicio(dado);
		} else {
			fim.setNext(novo);
			fim = novo;
			numElementos++;
		}
	}

	public void adcionaEmQualquerPOsicao(Integer dado, int posicao) {
		No novo = new No(dado);
		No anterior = inicio;
		No atual = (No) inicio.getNext();

		if (posicao < 0 && posicao > numElementos) {
			System.out.println("Posicao invalida");
		} else if (posicao == 0) {
			adcionaNoInicio(dado);
		} else {
			for (int i = 0; i < posicao - 1; i++) {
				anterior = (No) anterior.getNext();
				atual = (No) atual.getNext();
			}
			novo.setNext(atual);
			anterior.setNext(novo);
			numElementos++;
		}
	}

	public No removerNoComeco() {
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return null;
		} else {
			No aux = inicio;
			inicio = (No) inicio.getNext();
			numElementos--;
			return aux;
		}
	}

	public No removerNoFim() {
		No aux = inicio;
		if (isEmpty()) {
			System.out.println("Lista vazia");
			return null;
		} else {
			for (int i = 0; i < numElementos - 2; i++) {
				aux = (No) aux.getNext();
			}
			aux.setNext(null);
			fim = aux;
			numElementos--;
			return aux;
		}
	}

	public No removerEmQulaquerPosicao(int posicao) {
		if (isEmpty() || posicao < numElementos && posicao > numElementos) {
			System.out.println("Lista vazia ou posição invalida");
			return null;
		} else if (posicao == 1) {
			removerNoComeco();
		} else if (posicao == numElementos) {
			removerNoFim();
		} else {
			No anterior = inicio;
			No atual = (No) inicio.getNext();
			for (int i = 0; i < posicao - 2; i++) {
				anterior = (No) anterior.getNext();
				atual = (No) atual.getNext();
			}

			anterior.setNext(atual.getNext());
			atual.setNext(null);
			numElementos--;
			return atual;
		}
		return null;
	}

	public String toString() {

		// Verificando se a Lista está vazia
		if (this.numElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No atual = inicio;

		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.numElementos - 1; i++) {
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
