package br.com.contimatic.pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		pilha.push(10);
		pilha.push(8);
		pilha.push(40);

		pilha.mostra();
		pilha.pop();
		pilha.mostra();
	}
}
