package br.com.contimatic.fila;

public class Main {

	public static void main(String[] args) {

		Fila fila = new Fila();

		fila.dequeue();
		fila.enqueue(10);
		fila.enqueue(20);
		fila.enqueue(30);
		fila.display();
		fila.dequeue();
		fila.display();
	}

}
