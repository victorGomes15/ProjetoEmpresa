package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class Bairro.
 */
public class Bairro {

	/** The codigo. */
	private Integer codigo;
	
	/** The nome bairro. */
	private String nomeBairro;
	
	/** The cep. */
	private String cep;

	/**
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(int codigo) {
		checkArgument(codigo > 0, "Código inserido menor ou igual a 0");
		this.codigo = codigo;
	}

	/**
	 * Gets the nome bairro.
	 *
	 * @return the nome bairro
	 */
	public String getNomeBairro() {
		return nomeBairro;
	}

	/**
	 * Sets the nome bairro.
	 *
	 * @param nomeBairro the new nome bairro
	 */
	public void setNomeBairro(String nomeBairro) {
		checkArgument(isNotEmpty(nomeBairro) && nomeBairro.length() > 3, "Nome de bairro incorreto");
		this.nomeBairro = nomeBairro;
	}

	/**
	 * Gets the cep.
	 *
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * Sets the cep.
	 *
	 * @param cep the new cep
	 */
	public void setCep(String cep) {
		checkArgument(isNotEmpty(cep) && cep.matches("^\\d{5}-\\d{3}$"), "Cep inváldo");
		this.cep = cep;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder(1, 3).append(this.codigo).append(this.cep).append(this.nomeBairro).toHashCode();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Cod Bairro", this.codigo).append("\nBairro ", this.nomeBairro)
				.append("\nCep", this.cep).toString();
	}

}
