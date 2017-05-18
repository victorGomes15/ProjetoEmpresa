package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

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
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Cod Bairro: " + this.codigo + "\nBairro: " + this.nomeBairro + "\nCep: " + this.cep;
	}

}
