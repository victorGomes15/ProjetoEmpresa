package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class Cidade {

	private Integer codigo;
	private String nome;
	private Bairro bairro;

	public Cidade() {
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		checkArgument(isNotEmpty(nome) && nome.length() > 2, "Nome da cidade invalido");
		this.nome = nome;
	}

	public Bairro getBairro() {
		return this.bairro;
	}

	public void setBairro(Bairro bairro) {
		if (bairro != null && bairro.getNomeBairro() != null && bairro.getCodigo() > 0) {
			this.bairro = bairro;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
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
		return "Cod cidade: " + this.codigo + "\nCidade: " + this.nome + "\n" + this.bairro;
	}

}
