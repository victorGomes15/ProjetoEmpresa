package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;

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
		checkArgument(codigo > 0, "Código deve ser maior que 0");
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

		return new EqualsBuilder().append(this.codigo, other.codigo).append(this.nome, other.nome)
				.append(this.bairro, other.bairro).isEquals();
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
