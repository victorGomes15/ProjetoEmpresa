package br.com.contimatic.empresa;

import java.util.StringTokenizer;

public class Email {

	private String enderecoEmail;

	public String getEnderecoEmail() {
		return enderecoEmail;
	}

	public void setEnderecoEmail(String enderecoEmail) {
		if (enderecoEmail != null) {
			if (!enderecoEmail.isEmpty()) {
				StringTokenizer token = new StringTokenizer(enderecoEmail, "@");
				int contArroba = 0;
				for (int i = 0; i < enderecoEmail.length(); i++) {
					if (enderecoEmail.charAt(i) == '@') {
						contArroba++;
					}
				}
				if (contArroba == 1 && !(enderecoEmail.charAt(enderecoEmail.length() - 1) == '.')) {
					if (!(token.equals(null)) && token.nextToken().length()>0) {
						this.enderecoEmail=enderecoEmail;
					}
				}
			}
		}
  }

}
