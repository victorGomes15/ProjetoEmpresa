package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Email;

public class EmailTeste {

	private Email email;

	@Before
	public void cria_objt() {
		email = new Email();
	}

	@Test
	public void nao_deve_aceitar_um_endereco_de_email_nulo() {
		email.setEnderecoEmail(null);
		Assert.assertNull(email.getEnderecoEmail());
	}

	@Test
	public void nao_deve_aceitar_um_endereco_de_email_vazio() {
		email.setEnderecoEmail("");
		Assert.assertNull(email.getEnderecoEmail());
	}

	@Test
	public void nao_deve_aceitar_um_endereco_de_email_com_mais_de_1_arroba() {
		email.setEnderecoEmail("joao@gmail@.com.br");
		Assert.assertNull(email.getEnderecoEmail());
	}

	@Test
	public void deve_aceitar_um_email_com_1_arroba() {
		email.setEnderecoEmail("joao@gmail.com.br");
		Assert.assertNotNull(email.getEnderecoEmail());
	}

	@Test
	public void nao_deve_aceitar_um_email_com_ponto_no_final() {
		email.setEnderecoEmail("joao@gmail.com.br.");
		Assert.assertNull(email.getEnderecoEmail());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_antes_do_arroba() {
		email.setEnderecoEmail("@gmail.com.br");
		Assert.assertNull(email.getEnderecoEmail());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_depois_do_arroba() {
		email.setEnderecoEmail("jose@");
		Assert.assertNull(email.getEnderecoEmail());
	}

}
