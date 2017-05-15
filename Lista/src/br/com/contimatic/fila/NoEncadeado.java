package br.com.contimatic.fila;

public class NoEncadeado {
	private Integer dado;
	private NoEncadeado next;

	public NoEncadeado(Integer dado) {
		this.dado = dado;
		this.next = null;
	}

	public Integer getDado() {
		return dado;
	}

	public void setDado(Integer dado) {
		this.dado = dado;
	}

	public NoEncadeado getNext() {
		return next;
	}

	public void setNext(NoEncadeado next) {
		this.next = next;
	}
	
	public void display(){
		System.out.println(this.dado);
	}

}
