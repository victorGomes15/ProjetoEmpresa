package br.com.contmatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Endereco {

	private String rua;
	private Integer numero;
	private Integer complemento;
	private Estado estado;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		checkArgument(isNotEmpty(rua) && rua.length() >= 4);
		checkArgument(rua.matches("[a-zA-Z\\s_\\d]+"));
		this.rua = rua;
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
		return ToStringBuilder.reflectionToString(this, new MultilineRecursiveToStringStyle());

	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.rua).append(this.numero).append(this.estado).append(this.complemento)
				.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Endereco)) {
			return false;
		}
		Endereco other = (Endereco) obj;

		return new EqualsBuilder().append(this.rua, other.rua).append(this.numero, other.numero)
				.append(this.complemento, this.complemento).append(this.estado, other.estado).isEquals();
	}

}
