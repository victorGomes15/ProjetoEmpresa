package br.com.contimatic.empresa;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

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
		checkArgument(contArroba == 1 && !(enderecoEmail.charAt(enderecoEmail.length() - 1) == '.'), "Email incorreto");
		checkArgument(!(enderecoEmail.charAt(0) == '@') && !(enderecoEmail.indexOf("@") == enderecoEmail.length() - 1),
				"Email não pode começar ou terminar com @");
		this.enderecoEmail = enderecoEmail;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(1, 3).append(this.enderecoEmail).toHashCode();
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

		return new EqualsBuilder().append(this.enderecoEmail, other.enderecoEmail).isEquals();

	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("Email:", this.enderecoEmail).toString();
	}

}