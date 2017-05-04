package br.com.contimatic.empresa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BairroTeste {

	private Bairro bairro;

	@Before
	public void criaObjt() {
		bairro = new Bairro();
	}

	@Test
	public void nao_deve_aceitar_um_codigo_igual_0() {
		bairro.setCodigo(0);
		Assert.assertNull(null);
	}

	@Test
	public void nao_deve_aceitar_um_codigo_negativo() {
		bairro.setCodigo(-1);
		Assert.assertEquals(0, bairro.getCodigo());
	}

	@Test
	public void deve_aceitar_um_codigo_maior_que_0() {
		bairro.setCodigo(1);
		Assert.assertNotNull(bairro.getCodigo());
	}

	@Test
	public void nao_deve_aceitar_um_bairro_nulo() {
		bairro.setNomeBairro(null);
		Assert.assertNull(bairro.getNomeBairro());
	}

	@Test
	public void nao_deve_aceitar_um_bairro_vazio() {
		bairro.setNomeBairro("");
		Assert.assertNull(bairro.getNomeBairro());
	}

	@Test
	public void nao_deve_aceitar_um_bairro_menor_que_4_caracteres() {
		bairro.setNomeBairro("123");
		Assert.assertNull(bairro.getNomeBairro());
	}

	@Test
	public void deve_aceitar_um_cep_valido() {
		bairro.setCep("12345-123");
		Assert.assertEquals("12345-123", bairro.getCep());;
	}

	@Test
	public void nao_deve_aceitar_um_cep_que_contenha_letras() {
		bairro.setCep("12345-17s");
		Assert.assertNull(bairro.getCep());
	}
	
	@Test
	public void nao_deve_aceitar_um_cep_que_contenha_caracteres_Especiais() {
		bairro.setCep("12345-17@");
		Assert.assertNull(bairro.getCep());
	}
	
	@Test
	public void nao_deve_aceitar_um_cep_que_nulo() {
		bairro.setCep(null);
		Assert.assertNull(bairro.getCep());
	}
	
	@Test
	public void nao_deve_aceitar_um_cep_que_esteja_vazio() {
		bairro.setCep("12345-17@");
		Assert.assertNull(bairro.getCep());
	}
}
