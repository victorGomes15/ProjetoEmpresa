package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Bairro {

	private Integer codigo;
	private String nomeBairro;
	private String cep;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		checkArgument(codigo > 0, "Código inserido menor ou igual a 0");
		this.codigo = codigo;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		checkArgument(isNotEmpty(nomeBairro) && nomeBairro.length() > 3, "Nome de bairro incorreto");
		this.nomeBairro = nomeBairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		checkArgument(isNotEmpty(cep) && cep.matches("^\\d{5}-\\d{3}$"), "Cep inváldo");
		this.cep = cep;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bairro other = (Bairro) obj;

		return new EqualsBuilder().append(this.codigo, other.codigo).append(this.cep, other.cep)
				.append(this.nomeBairro, other.nomeBairro).isEquals();

	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(11, 21).append(this.codigo).append(this.cep).append(this.nomeBairro).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Cod Bairro", this.codigo).append("\nBairro ", this.nomeBairro)
				.append("\nCep", this.cep).toString();
	}

}
