package br.com.contmatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle;
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
		checkArgument(bairro != null, "Bairro nulo");
		checkArgument(!bairro.getNomeBairro().equals(null) && bairro.getCodigo() > 0,
				"Nome do bairro ou código invalido");
		this.bairro = bairro;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cidade)) {
			return false;
		}
		Cidade other = (Cidade) obj;

		return new EqualsBuilder().append(this.codigo, other.codigo).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.codigo).toHashCode();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, new MultilineRecursiveToStringStyle());
	}

}
