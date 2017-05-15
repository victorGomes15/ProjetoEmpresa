package br.com.contimatic.pilha;

public class NoPIlha {

	private Integer dado;
	private NoPIlha next;

	public NoPIlha(Integer dado) {
		this.dado = dado;
		this.next = null;
	}

	@Override
	public String toString() {
		return "NoPIlha [dado=" + dado + ", next=" + next + "]";
	}

	public NoPIlha getNext() {
		return next;
	}

	public void setNext(NoPIlha next) {
		this.next = next;
	}

	public Integer getDado() {
		return dado;
	}

	public void setDado(Integer dado) {
		this.dado = dado;
	}

	public void displayNo() {
		System.out.println(dado);
	}

}
