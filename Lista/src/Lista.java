
public class Lista {

	private No inicio;
	private No fim;
	private int totalDeElementos = 0;

	public void adiciona(int elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			No nova = new No(elemento);
			this.fim.setNext(nova);
			this.fim = nova;
			this.totalDeElementos++;
		}
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private No pegaNo(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}

		No atual = inicio;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getNext();
		}
		return atual;
	}

	public void adiciona(int posicao, int elemento) {
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			No anterior = this.pegaNo(posicao - 1);
			No nova = new No(elemento);
			No aux = anterior.getNext();
			nova.setNext(aux);
			anterior.setNext(nova);
			this.totalDeElementos++;
		}

	}

	public void remove(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
		    throw new IllegalArgumentException("Posição não existe");
		  }
		  if (posicao == 0) {
		    this.removeDoComeco();
		  } else if (posicao == this.totalDeElementos - 1) {
		    this.removeDoFim();
		  } else {
		    No anterior = this.pegaNo(posicao - 1);
		    No atual = anterior.getNext();
		    No Next = atual.getNext();
		    
		    anterior.setNext(Next);		    
		    this.totalDeElementos--;
		  }
	}

	public int tamanho() {
		return 0;
	}

	public boolean contem(int elemento) {
		No aux = inicio;
		
		while(aux !=null){
			if(aux.getDado()==elemento){
				return true;
			}
			aux=aux.getNext();
		}
		
		return false;
	}

	public void adicionaNoComeco(int elemento) {
		No nova = new No(elemento);
		No aux = nova;
		if (this.totalDeElementos == 0) {
			// caso especial da lista vazia
			this.inicio = aux;
			this.fim = this.inicio;
			this.inicio.setNext(fim);
		} else {
			aux.setNext(inicio);
			this.inicio = nova;
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoOcupada(0)) {
		    throw new IllegalArgumentException("Posição não existe");
		  }

		  this.inicio = this.inicio.getNext();
		  this.totalDeElementos--;
		  
		  if (this.totalDeElementos == 0) {
		    this.fim = null;
		  }
	}

	public void removeDoFim() {
		if(this.totalDeElementos<0){
			throw new IllegalArgumentException("Lista Vazia");
		}
		No anterior = this.pegaNo(this.totalDeElementos-1);
		anterior.setNext(null);
		fim = anterior;
		totalDeElementos--;
	}

	public boolean listaVazia() {
		return this.tamanho() == 0;
	}

	public String toString() {

		// Verificando se a Lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No atual = inicio;

		// Percorrendo até o penúltimo elemento.
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getDado());
			builder.append(", ");
			atual = atual.getNext();
		}

		// último elemento
		builder.append(atual.getDado());
		builder.append("]");

		return builder.toString();
	}
}
