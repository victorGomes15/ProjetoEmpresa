package br.com.contimatic.empresa;

public class Endereco {

	private String rua;
	private int numero;
	private int complemento;
	private Estado estado;
	private Cidade cidade;
	private Bairro bairro;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua != null) {
			if (!rua.isEmpty() && rua.length() > 4) {
				if (rua.matches("[A-Za-z0-9]")) {
					this.rua = rua;
				}
			}
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public int getComplemento() {
		return complemento;
	}

	public void setComplemento(int complemento) {
		if (complemento >= 0) {
			this.complemento = complemento;
		}
	}
}
