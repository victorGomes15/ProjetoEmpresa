package br.com.contimatic.empresa;

public class Bairro {

	private String codigo;
	private String nomeBairro;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.matches("[1-9]+")) {
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

}
