package br.com.contimatic.empresa;

public class Bairro {

	private int codigo;
	private String nomeBairro;
	private String cep;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		if (nomeBairro != null) {
			if (nomeBairro != "") {
				if (nomeBairro.length() > 3) {
					this.nomeBairro = nomeBairro;
				}
			}
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep != null) {
			if (cep.matches("^\\d{5}-\\d{3}$")) {
				this.cep = cep;
			}
		}
	}

	@Override
	public String toString() {
		return "Cod Bairro: " + this.codigo + "\nBairro: " + this.nomeBairro + "\nCep: " + this.cep;
	}

}
