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

	public void setRazaoSocial(String razaoSocial) {
		if (razaoSocial != null) {
			if (!razaoSocial.isEmpty()) {
				this.razaoSocial = razaoSocial;
			}
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

	public void setDono(String dono) {
		if (dono != null) {
			if (!dono.isEmpty() && dono.length() > 5) {
				this.dono = dono;
			}
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			if (!email.isEmpty()) {
				int contArroba = 0;
				for (int i = 0; i < email.length(); i++) {
					if (email.charAt(i) == '@') {
						contArroba++;
					}
				}
				if (contArroba == 1 && !(email.charAt(email.length()-1)=='.')) {
					this.email = email;
				}
			}
		}
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		if (inscricaoEstadual != null) {
			if (inscricaoEstadual.length() == 13) {
				this.inscricaoEstadual = inscricaoEstadual;
			}
		}
	}

	@Override
	public String toString() {
		return cnpj + "(" + razaoSocial + "\n" + endereco + "\n" + email + "\n" + razaoSocial + "\n" + inscricaoEstadual
				+ "\n" + telefone + "\n" + dono + ")";
	}

}
