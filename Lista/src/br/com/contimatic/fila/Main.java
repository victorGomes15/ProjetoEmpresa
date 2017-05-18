package br.com.contimatic.fila;

public class Main {

	public static void main(String[] args) {

		Fila fila = new Fila();
//
//		fila.dequeue();
//		fila.enqueue(10);
//		fila.enqueue(20);
//		fila.enqueue(30);
//		fila.display();
//		fila.dequeue();
//		fila.display();
		
		System.out.println("Minha Fila");
		
		minhaFila fila2 = new minhaFila();
		fila2.enqueue(1);
		fila2.enqueue(10);
		fila2.enqueue(100);
		fila2.enqueue(1000);
		fila2.display();
		fila2.dequeue();
		fila2.dequeue();
		fila2.display();
		
	}

}
