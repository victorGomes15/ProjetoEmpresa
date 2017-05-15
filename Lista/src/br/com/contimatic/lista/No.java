package br.com.contimatic.lista;

public  class No  {

	private Object dado;
	private No next;

	public No(int dado) {
		this.dado = dado;
		this.next = null;
	}

	public void setDado(Object dado) {
		this.dado =dado;
	}

	public Object getNext() {
		return (No)this.next;
	}

	public void setNext(Object next) {
		this.next=(No) next;
	}

	public Object getDado() {
		return this.dado;
	}

}
