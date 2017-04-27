package br.com.contimatic.empresa;

public class Bairro {

	private int codigo;
	private String nomeBairro;

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

}
