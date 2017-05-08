package br.com.contimatic.empresa;

public class Endereco {

	private String rua;
	private int numero;
	private int complemento;
	private Estado estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua != null) {
			if (!(rua.isEmpty()) && rua.length() >= 4) {
				if (rua.matches("[a-zA-Z\\s_\\d]+")) {
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

	
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return this.rua.charAt(0);
	}
	
	@Override
	public String toString() {
		return "\nRua: " + this.rua + "\nNúmero: " + this.numero + "\nComplemento: " + this.complemento+this.estado;
	}

}
