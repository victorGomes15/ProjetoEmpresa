package br.com.contimatic.empresa;

public class Telefone {

	private Integer ddd;
	private String numero;
	private String tipo;

	public Telefone() {
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer dd) {
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
	
	@Override
	public int hashCode() {
		return this.ddd;
	}

	@Override
	public String toString() {
		return "Ddd: "+this.ddd+"\nNumero: "+this.numero+"\nTipo: "+this.tipo;
	}
}
