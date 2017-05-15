package br.com.contimatic.fila;

public class NoFila {

	private Integer dado;
	private NoFila next;

	public NoFila(Integer dado) {
		this.dado = dado;
		this.next = null;
	}

	public Integer getDado() {
		return dado;
	}

	public void setDado(Integer dado) {
		this.dado = dado;
	}

	public NoFila getNext() {
		return next;
	}

	public void setNext(NoFila next) {
		this.next = next;
	}

	public void display() {
		System.out.println("Dado:" + dado);
	}

}
