package br.com.contmatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Estado {

	private Integer cod;
	private String uf;
	private Cidade cidade;

	public Estado() {
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		checkArgument(cod > 0, "Código tem que ser maior que 0");
		this.cod = cod;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		checkArgument(isNotEmpty(uf) && uf.length() == 2);
		this.uf = uf;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		checkArgument(cidade != null, "Cidade nula");
		checkArgument(
				!cidade.getCodigo().equals(0) && !cidade.getBairro().equals(null) && !cidade.getNome().equals(null),
				"Cidade invalida");
		this.cidade = cidade;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;

		return new EqualsBuilder().append(this.cod, other.cod).append(this.uf, other.uf)
				.append(this.cidade, other.cidade).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(1, 3).append(this.uf).append(this.cod).append(this.cidade).hashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Cod Estado: ", this.cod).append("\nUF: ", this.uf)
				.append("\nCidade: \n", this.cidade).toString();
	}

}
