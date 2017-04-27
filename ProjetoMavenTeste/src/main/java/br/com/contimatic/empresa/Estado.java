package br.com.contimatic.empresa;

public class Estado {

	private int cod;
	private String uf;
	private Cidade cidade;

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf != null) {
			if (uf != "") {
				if (uf.length() == 2) {
					this.uf = uf;
				}
			}
		}
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	

}
