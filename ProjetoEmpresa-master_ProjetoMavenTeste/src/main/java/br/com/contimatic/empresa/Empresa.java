package br.com.contimatic.empresa;

import java.util.Date;

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
		if (cnpj != null) {
			if (cnpj.length() == 14) {
				if (cnpj.matches("[0-9]+")) {
					this.cnpj = cnpj;
				}
			}
		}

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		if (razaoSocial != null) {
			if (!razaoSocial.isEmpty()) {
				if (razaoSocial.matches("[A-Za-z0-9]")) {
					this.razaoSocial = razaoSocial;
				}
			}
		}
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
		if (dono != null) {
			if (!dono.isEmpty() && dono.length() > 5) {
				if (!dono.matches("[0-9]+")) {
					this.dono = dono;
				}
			}
		}
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
		if (inscricaoEstadual != null) {
			if (inscricaoEstadual.length() == 13) {
				if (inscricaoEstadual.matches("[0-9]+")) {
					this.inscricaoEstadual = inscricaoEstadual;
				}
			}
		}
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		if (nomeEmpresa != null) {
			if (!nomeEmpresa.isEmpty()) {
				this.nomeEmpresa = nomeEmpresa;
			}
		}
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", endereco=" + endereco + ", telefone="
				+ ", email=" + email + ", inscricaoEstadual=" + inscricaoEstadual + ", nomeEmpresa=" + nomeEmpresa
				+ ", dataCriacao=" + dataCriacao + "]";
	}

}
