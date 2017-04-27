package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Bairro;
import br.com.contimatic.empresa.Cidade;

public class CidadeTeste {

	private Cidade cidade;

	@Before
	public void criar_objeto() {
		cidade = new Cidade();
	}

	@Test
	public void nao_deve_aceitar_um_nome_nulo() {
		cidade.setNome(null);
		Assert.assertNull(cidade.getNome());
	}
	
	@Test
	public void nao_deve_aceitar_um_nome_vazio() {
		cidade.setNome("");
		Assert.assertNull(cidade.getNome());
	}
	
	@Test
	public void nao_deve_aceitar_um_nome_com_menos_de_3_caracteres() {
		cidade.setNome("It");
		Assert.assertNull(cidade.getNome());
	}
	
	@Test
	public void deve_aceitar_um_nome_com_mais_de_2_caracteres() {
		cidade.setNome("Itu");
		Assert.assertNotNull(cidade.getNome());
	}
	
	@Test
	public void deve_aceitar_um_bairro_valido() {
		Bairro bairro = new Bairro();
		bairro.setCodigo("1");
		bairro.setNomeBairro("Jardim");
		cidade.setBairro(bairro);
		Assert.assertNotNull(cidade.getBairro());
	}

	@Test
	public void nao_deve_aceitar_um_bairro_invalido() {
		Bairro bairro = new Bairro();
		bairro.setCodigo("0");
		bairro.setNomeBairro("sp");
		cidade.setBairro(bairro);
		Assert.assertNull(cidade.getBairro());
	}

}
