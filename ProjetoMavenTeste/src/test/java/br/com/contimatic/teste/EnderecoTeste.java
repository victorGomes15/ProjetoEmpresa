package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Endereco;

public class EnderecoTeste {

	private Endereco endereco;

	@Before
	public void criar_endereco() {
		endereco = new Endereco();
	}

	@Test
	public void nao_deve_aceitar_uma_rua_nula() {
		endereco.setRua(null);
		Assert.assertNull(endereco.getRua());
	}

	@Test
	public void nao_deve_aceitar_uma_rua_vazia() {
		endereco.setRua("");
		Assert.assertNull(endereco.getRua());
	}

	@Test
	public void nao_deve_aceitar_uma_rua_com_menos_de_4_caracteres() {
		endereco.setRua("cas ");
		Assert.assertNull(endereco.getRua());
	}

	@Test
	public void deve_aceitar_uma_rua_com_mais_de_3_caracteres() {
		endereco.setRua("João VI");
		Assert.assertNotNull(endereco.getRua());
	}

	@Test
	public void nao_deve_aceitar_uma_rua_com_caracteres_especiais() {
		endereco.setRua("J@nathan #");
		Assert.assertNull(endereco.getRua());
	}

	@Test
	public void deve_aceitar_um_numero_maior_que_0() {
		endereco.setNumero(1);
		Assert.assertNotNull(endereco.getNumero());
	}

	@Test
	public void nao_deve_aceitar_um_numero_menor_ou_igual_a_0() {
		endereco.setNumero(0);
		Assert.assertEquals(0, endereco.getNumero());
	}
	
	@Test
	public void deve_aceitar_um_complemento_maior_igual_a_0() {
		endereco.setComplemento(0);
		Assert.assertEquals(0, endereco.getNumero());
	}
	
	@Test
	public void nao_deve_aceitar_um_complemento_menor_que_0() {
		endereco.setComplemento(-1);
		Assert.assertEquals(0, endereco.getNumero());
	}

	
}
