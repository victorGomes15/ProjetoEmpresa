package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

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
		if (cidade != null) {
			checkArgument(!(cidade.getCodigo().equals(0)) && !cidade.getBairro().equals(null)
					&& !cidade.getNome().equals(null));
			this.cidade = cidade;
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
		Estado other = (Estado) obj;
		if (cod != other.cod)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		return result;
	}

	@Override
	public String toString() {
		return "Cod Estado: " + this.cod + "\nUf: " + this.uf + "\n" + this.cidade;
	}

}
