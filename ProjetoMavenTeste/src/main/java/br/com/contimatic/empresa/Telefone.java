package br.com.contimatic.empresa;

public class Telefone {

	private int ddd;
	private String numero;
	private String tipo;

	public Telefone() {
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int dd) {
		if (dd > 10 & dd < 100) {
			this.ddd = dd;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero != null) {
			if (numero.length() >= 8 && numero.length() <= 9) {
				if (numero.matches("[0-9]+")) {
					this.numero = numero;
				}
			}
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null) {
			if (!tipo.isEmpty()) {
				if (tipo.equalsIgnoreCase("fixo") || tipo.equalsIgnoreCase("celular")) {
					this.tipo = tipo;
				}
			}
		}
	}

}
