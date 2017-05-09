package br.com.contimatic.empresa;

public class Cidade {

	private Integer codigo;
	private String nome;
	private Bairro bairro;

	public Cidade() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			if (nome != "") {
				if (nome.length() > 2) {
					this.nome = nome;
				}
			}
		}
	}

	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		if (bairro != null && bairro.getNomeBairro() != null && bairro.getCodigo() > 0) {
			this.bairro = bairro;
		}
	}
	
	@Override
	public int hashCode() {
		return this.codigo;
	}
	
	@Override
	public String toString() {
		return "Cod cidade: "+this.codigo+"\nCidade: "+this.nome+"\n"+this.bairro;
	}

}
