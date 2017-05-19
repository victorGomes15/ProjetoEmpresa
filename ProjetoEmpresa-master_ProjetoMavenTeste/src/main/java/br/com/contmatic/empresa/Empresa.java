package br.com.contmatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.DateTime;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	private Set<Telefone> telefone;
	private String dono;
	private Email email;
	private String inscricaoEstadual;
	private String nomeEmpresa;
	private DateTime dataCriacao;

	public Empresa() {

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		checkArgument(isNotEmpty(cnpj) && cnpj.length() == 14, "Cnpj invalido");
		checkArgument(cnpj.matches("[0-9]+"), "Cnpj deve conter somente números");
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		checkArgument(isNotEmpty(razaoSocial) && razaoSocial.matches("[A-Za-z0-9]"));
		this.razaoSocial = razaoSocial;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco != null) {
			if (endereco.getNumero() != 0 && endereco.getRua() != null && endereco.getEstado() != null) {
				this.endereco = endereco;
			}
		}
	}



	// public void setTelefone(Telefone telefone) {
	// if (telefone.getDdd() > 0 && telefone.getNumero() != null &&
	// telefone.getTipo() != null) {
	// this.telefone[tamanhoListaTelefone] = telefone;
	// this.tamanhoListaTelefone++;
	// }
	// }

	public Set<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(Set<Telefone> telefone) {
		this.telefone = telefone;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		checkArgument(isNotEmpty(dono) && dono.length() > 5, "Nome inválido");
		checkArgument(!dono.matches("[0-9]+"), "Nome não pode conter números");
		this.dono = dono;
	}

	public DateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(DateTime dataCriacao) {
		Date dataAtual = new Date(System.currentTimeMillis());
		if (dataCriacao.isAfterNow() || dataCriacao.equals(dataAtual)) {
			this.dataCriacao = dataCriacao;
		}
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		checkArgument(isNotEmpty(inscricaoEstadual) && inscricaoEstadual.length() == 13, "Inscrição social invalida");
		checkArgument(inscricaoEstadual.matches("[0-9]+"), "Inscrição só deve conter números");
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		checkArgument(isNotEmpty(nomeEmpresa), "Nome não pode ser nulo ou vazio");
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(1, 3).append(this.cnpj).append(this.dono).append(this.email)
				.append(this.inscricaoEstadual).append(this.nomeEmpresa).append(this.endereco).append(this.dataCriacao)
				.append(this.razaoSocial).append(this.telefone).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;

		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (dono == null) {
			if (other.dono != null)
				return false;
		} else if (!dono.equals(other.dono))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (inscricaoEstadual == null) {
			if (other.inscricaoEstadual != null)
				return false;
		} else if (!inscricaoEstadual.equals(other.inscricaoEstadual))
			return false;
		if (nomeEmpresa == null) {
			if (other.nomeEmpresa != null)
				return false;
		} else if (!nomeEmpresa.equals(other.nomeEmpresa))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("CNPJ: ", this.cnpj).append("Razão Social: ", this.razaoSocial)
				.append("\nEndereco: ", this.endereco).append("\nTelefone: ", this.telefone)
				.append("\nEmail: ", this.email).append("\nInscrição Estadual: ", this.inscricaoEstadual)
				.append("Nome Empresa: ", this.nomeEmpresa).append("\nData criação: ", this.dataCriacao).toString();
	}

}
