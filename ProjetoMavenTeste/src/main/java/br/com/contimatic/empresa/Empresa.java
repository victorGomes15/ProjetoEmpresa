package br.com.contimatic.empresa;

import java.util.StringTokenizer;

public class Empresa {

	private String cnpj;
	private String razaoSocial;
	private Endereco endereco;
	private Telefone telefone[];
	private String dono;
	private String email;
	private String inscricaoEstadual;
	private String nomeEmpresa;

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
////		if (endereco != null) {
//			if (!endereco.isEmpty()) {
//				this.endereco = endereco;
//			}
//		}
	}



	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null) {
			if (!email.isEmpty()) {
				StringTokenizer token = new StringTokenizer(email, "@");
				int contArroba = 0;
				for (int i = 0; i < email.length(); i++) {
					if (email.charAt(i) == '@') {
						contArroba++;
					}
				}
				if (contArroba == 1 && !(email.charAt(email.length() - 1) == '.')) {
					if (!token.equals("") && !token.nextToken().equals("")) {
						this.email = email;
					}
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
		return cnpj + "(" + razaoSocial + "\n" + "\n" + nomeEmpresa + endereco + "\n" + email + "\n" + razaoSocial
				+ "\n" + inscricaoEstadual + "\n" + telefone + "\n" + dono + ")";
	}

}
