package br.com.contimatic.empresa;

import javax.management.RuntimeErrorException;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private String endereco;
	private String telefone;
	private String dono;
	private String email;
	private String inscricaoEstadual;

	public Empresa() {
		this.cnpj = null;
		this.razaoSocial = null;
		this.endereco = null;
		this.telefone = null;
		this.dono = null;
		this.email = null;
		this.inscricaoEstadual = null;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		if (cnpj != null) {
			if (cnpj.length() == 14) {
				this.cnpj = cnpj;
			}
		}

	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public boolean setRazaoSocial(String razaoSocial) {
		if (razaoSocial.isEmpty()) {
			this.razaoSocial = "Campo vazio, por favor adcione";
			return false;
		} else {
			this.razaoSocial = razaoSocial;
			return true;
		}

	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco != null) {
			if (!endereco.isEmpty()) {
				this.endereco = endereco;
			}
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone != null) {
			if (telefone.length() >= 8 && telefone.length() <= 9) {
				this.telefone = telefone;
			}
		}

	}

	public String getDono() {
		return dono;
	}

	public boolean setDono(String dono) {
		if (dono.isEmpty()) {
			System.out.println("Nome invalido");
			return false;
		} else {

			this.dono = dono;
			return true;
		}
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email.isEmpty()) {
			System.out.println("Email invalido");
			return false;
		} else {
			this.email = email;
			return true;
		}

	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public boolean setInscricaoEstadual(String inscricaoEstadual) {
		if (inscricaoEstadual.length() < 13 && inscricaoEstadual.length() > 13) {
			System.out.println("Inscrição invalida");
			return false;
		} else {
			this.inscricaoEstadual = inscricaoEstadual;
			return true;
		}
	}

	@Override
	public String toString() {
		return cnpj + "(" + razaoSocial + "\n" + endereco + "\n" + email + "\n" + razaoSocial + "\n" + inscricaoEstadual
				+ "\n" + telefone + "\n" + dono + ")";
	}

}
