package br.com.contimatic.empresa;

public class Estado {

	private int cod;
	private String uf;
	private Cidade cidade;

	
	public Estado() {
//		this.cidade = new Cidade();
	}

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
		if (cidade !=null) {
			if (cidade.getCodigo() != 0 && cidade.getBairro() != null && cidade.getNome() != null) {
				this.cidade = cidade;
			}
		}
	}
	
	@Override
	public int hashCode() {
		return this.cod;
	}
	
	@Override
	public String toString() {
		return "Cod Estado: "+this.cod+"\nUf: "+this.uf+"\n"+this.cidade;
	}

}
