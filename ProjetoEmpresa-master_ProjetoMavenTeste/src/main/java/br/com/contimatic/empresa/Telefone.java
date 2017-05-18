package br.com.contimatic.empresa;

import static br.com.contimatic.empresa.TelefoneType.CELULAR;
import static br.com.contimatic.empresa.TelefoneType.FIXO;
import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class Telefone {

	private Integer ddd;
	private String numero;
	private TelefoneType tipo;

	public Telefone() {
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer dd) {
		checkArgument(dd > 10 && dd < 100, "DDD valor incorreto");
		this.ddd = dd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		checkArgument(isNotEmpty(numero), "Número nulo ou vazio");
		checkArgument(numero.length() == CELULAR.getTamanho() || numero.length() == FIXO.getTamanho(),
				"Número digitos inválido");
		checkArgument(numero.matches("[0-9]+"), "Campo só deve conter números");
		this.numero = numero;
	}

	public TelefoneType getTipo() {
		return tipo;
	}

	public void setTipo(TelefoneType tipo) {
		checkArgument(tipo.equals(CELULAR.getDescricao()) || tipo.equals(FIXO.getDescricao()), "Tipo incorreto");
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (ddd == null) {
			if (other.ddd != null)
				return false;
		} else if (!ddd.equals(other.ddd))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ddd == null) ? 0 : ddd.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Ddd: " + this.ddd + "\nNumero: " + this.numero + "\nTipo: " + this.tipo;
	}
}
