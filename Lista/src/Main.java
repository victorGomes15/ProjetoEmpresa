
public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		lista.adicionaNoComeco(1);
		lista.adiciona(2);
		lista.adiciona(3);
		lista.adicionaNoComeco(4);
		lista.adiciona(5);
		lista.adiciona(0, 90);
		lista.removeDoComeco();
		lista.removeDoFim();
		System.out.println(lista.contem(3));
		System.out.println(lista.toString());
		
		
	}

}
