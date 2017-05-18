package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class Email {

	private String enderecoEmail;

	public String getEnderecoEmail() {
		return enderecoEmail;
	}

	public void setEnderecoEmail(String enderecoEmail) {
		checkArgument(isNotEmpty(enderecoEmail));
		int contArroba = 0;
		for (int i = 0; i < enderecoEmail.length(); i++) {
			if (enderecoEmail.charAt(i) == '@') {
				contArroba++;
			}
		}
		if (contArroba == 1 && !(enderecoEmail.charAt(enderecoEmail.length() - 1) == '.')) {
			if (!(enderecoEmail.charAt(0) == '@') && !(enderecoEmail.indexOf("@") == enderecoEmail.length() - 1)) {
				this.enderecoEmail = enderecoEmail;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((enderecoEmail == null) ? 0 : enderecoEmail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (enderecoEmail == null) {
			if (other.enderecoEmail != null)
				return false;
		} else if (!enderecoEmail.equals(other.enderecoEmail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email: " + this.enderecoEmail;
	}

}