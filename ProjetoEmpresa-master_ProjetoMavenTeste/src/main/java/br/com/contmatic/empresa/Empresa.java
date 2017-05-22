package br.com.contmatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.util.Date;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.joda.time.DateTime;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private Set<Endereco> endereco;
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
		checkArgument(isNotEmpty(cnpj) && cnpj.matches("\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}"), "CNPJ incorreto");
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		checkArgument(isNotEmpty(razaoSocial) && razaoSocial.matches("[A-Za-z0-9]"),
				"Razão social invalida, não pode ser nula ou vazia");
		this.razaoSocial = razaoSocial;
	}

	public Set<Endereco> getEndereco() {
		return endereco;
	}

	// public void setEndereco(Set<Endereco> endereco) {
	// if (endereco != null) {
	// if (endereco.getNumero() != 0 && endereco.getRua() != null &&
	// endereco.getEstado() != null) {
	// this.endereco = endereco;
	// }
	// }
	// }

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
		checkArgument(isNotEmpty(dono) && dono.matches("^[A-Za-z]{4,50}"),
				"Nome não pode ser nulo, vazio ou conter números");
		this.dono = dono;
	}

	public DateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(DateTime dataCriacao) {
		DateTime dataAtual = DateTime.now();
		checkArgument(dataCriacao.isAfterNow() || dataCriacao.equals(dataAtual),
				"Data não tem que ser a partir do horário de agora ");
		this.dataCriacao = dataCriacao;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		checkArgument(isNotEmpty(inscricaoEstadual) && inscricaoEstadual.matches("[0-9]{13}"),
				"Inscrição estadual invalida");
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
		return new HashCodeBuilder().append(this.cnpj).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Empresa)) {
			return false;
		}
		Empresa other = (Empresa) obj;
		return new EqualsBuilder().append(this.cnpj, other.cnpj).isEquals();

	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
