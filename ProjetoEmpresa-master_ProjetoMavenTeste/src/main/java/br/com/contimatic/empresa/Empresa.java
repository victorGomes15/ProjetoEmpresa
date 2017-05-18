package br.com.contimatic.empresa;

import java.util.Date;
import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;
import org.joda.time.DateTime;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	private Telefone telefone[];
	private int tamanhoListaTelefone;
	private String dono;
	private Email email;
	private String inscricaoEstadual;
	private String nomeEmpresa;
	private DateTime dataCriacao;

	public Empresa() {
		this.telefone = new Telefone[5];

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

	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		if (tamanhoListaTelefone < this.telefone.length) {
			if (telefone.getDdd() > 0 && telefone.getNumero() != null && telefone.getTipo() != null) {
				this.telefone[tamanhoListaTelefone] = telefone;
				this.tamanhoListaTelefone++;
			}
		}
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
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", endereco=" + endereco + ", telefone="
				+ ", email=" + email + ", inscricaoEstadual=" + inscricaoEstadual + ", nomeEmpresa=" + nomeEmpresa
				+ ", dataCriacao=" + dataCriacao + "]";
	}

}
