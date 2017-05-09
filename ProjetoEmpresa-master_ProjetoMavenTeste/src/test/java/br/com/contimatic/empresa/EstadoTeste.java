package br.com.contimatic.empresa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contimatic.empresa.Bairro;
import br.com.contimatic.empresa.Cidade;
import br.com.contimatic.empresa.Estado;

public class EstadoTeste {

	private Estado estado = new Estado();
	
	@BeforeClass
    public static void setUpClass() {
		System.out.println("Começo dos testes da classe "+EstadoTeste.class.getSimpleName()+"\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("Fim dos testes da classe "+EstadoTeste.class.getSimpleName()+"\n");
    }

	@Before
	public void criar_objeto() {
		estado = new Estado();
		System.out.println("Começo do teste ");
	}
	
	@After
	public void finalizacao_Teste() {
		System.out.println("Fim de teste");;
	}
	

	@Test
	public void nao_deve_aceitar_um_codigo_igual_a_0() {
		estado.setCod(0);
		Assert.assertEquals(0, estado.getCod());
	}

	@Test
	public void nao_deve_aceitar_uma_uf_nula() {
		estado.setUf(null);
		Assert.assertNull(estado.getUf());
	}

	@Test
	public void nao_deve_aceitar_uma_uf_vazia() {
		estado.setUf("");
		Assert.assertNull(estado.getUf());
	}

	@Test
	public void nao_deve_aceitar_uma_uf_com_mais_de_2_caracteres() {
		estado.setUf("paraiba");
		Assert.assertNull(estado.getUf());
	}

	@Test
	public void nao_deve_aceitar_uma_uf_com_menos_de_2_caracteres() {
		estado.setUf("u");
		Assert.assertNull(estado.getUf());
	}

	@Test
	public void nao_deve_aceitar_uma_uf_com_2_caracteres() {
		estado.setUf("df");
		Assert.assertNotNull(estado.getUf());
	}

	@Test
	public void nao_deve_aceitar_uma_cidade_invalida() {
		Cidade c = new Cidade();
		c.setCodigo(-1);
		c.setNome(null);
		Bairro bairro = new Bairro();
		bairro.setCodigo(1);
		bairro.setNomeBairro("Jardim Ibirapuera");
		c.setBairro(bairro);
		estado.setCidade(c);
		Assert.assertNull(estado.getCidade());
	}

	@Test
	public void deve_aceitar_uma_cidade_valida() {
		Cidade c = new Cidade();
		c.setCodigo(1);
		c.setNome("sao Paulo");
		Bairro bairro = new Bairro();
		bairro.setCodigo(1);
		bairro.setNomeBairro("Jardim Ibirapuera");
		c.setBairro(bairro);
		estado.setCidade(c);

		Assert.assertNotNull(estado.getCidade());
	}

}
