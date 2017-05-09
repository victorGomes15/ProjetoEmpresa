package br.com.contimatic.empresa;

public class Endereco {

	private String rua;
	private Integer numero;
	private Integer complemento;
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

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public Integer getComplemento() {
		return complemento;
	}

	public void setComplemento(Integer complemento) {
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
	public String toString() {
		return "\nRua: " + this.rua + "\nNúmero: " + this.numero + "\nComplemento: " + this.complemento + this.estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rua == null) ? 0 : rua.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (rua == null) {
			if (other.rua != null)
				return false;
		} else if (!rua.equals(other.rua))
			return false;
		return true;
	}

}
