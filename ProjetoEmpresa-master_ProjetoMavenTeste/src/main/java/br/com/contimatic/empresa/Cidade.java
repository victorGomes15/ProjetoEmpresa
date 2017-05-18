package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
		checkArgument(bairro != null,"Bairro nulo");
		checkArgument(!bairro.getNomeBairro().equals(null) && bairro.getCodigo() > 0,"Nome do bairro ou código invalido");
		this.bairro = bairro;
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
		return new HashCodeBuilder(1,3).append(this.codigo).append(this.nome).append(this.bairro).toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Cod cidade: ", this.codigo).append("Cidade: ", this.nome)
				.append("Bairro:\n ", this.bairro).toString();
	}

}
