package br.com.contimatic.empresa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contimatic.empresa.Bairro;
import br.com.contimatic.empresa.Cidade;

public class CidadeTeste {

	private Cidade cidade;
	@BeforeClass
    public static void setUpClass() {
    
		System.out.println("Começo dos testes da classe "+CidadeTeste.class.getSimpleName()+"\n");
	}
    
    @AfterClass
    public static void tearDownClass() {
    
    	System.out.println("Fim dos testes da classe "+CidadeTeste.class.getSimpleName()+"\n");
    }

	@Before
	public void criar_objeto() {
		cidade = new Cidade();
		System.out.println("Começo do teste");
	}
	
	@After
	public void finalizacao_Teste() {
		System.out.println("Fim de teste");;
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
		bairro.setCodigo(1);
		bairro.setNomeBairro("Jardim");
		bairro.setCep("05857-380");
		cidade.setBairro(bairro);
		Assert.assertNotNull(cidade.getBairro());
	}

	@Test
	public void nao_deve_aceitar_um_bairro_invalido() {
		Bairro bairro = new Bairro();
		bairro.setCodigo(0);
		bairro.setNomeBairro("sp");
		cidade.setBairro(bairro);
		Assert.assertNull(cidade.getBairro());
	}

}
