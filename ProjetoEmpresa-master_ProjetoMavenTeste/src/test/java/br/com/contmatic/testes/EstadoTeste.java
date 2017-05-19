package br.com.contmatic.testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.empresa.Bairro;
import br.com.contmatic.empresa.Cidade;
import br.com.contmatic.empresa.Estado;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class EstadoTeste {

	private Estado estado;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("Começo dos testes da classe " + EstadoTeste.class.getSimpleName() + "\n");
		FixtureFactoryLoader.loadTemplates("br.com.contmatic.templates");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("Fim dos testes da classe " + EstadoTeste.class.getSimpleName() + "\n");
	}

	@Before
	public void criar_objeto() {
		estado = Fixture.from(Estado.class).gimme("estValido");
		System.out.println("Começo do teste ");
	}

	@After
	public void finalizacao_Teste() {
		System.out.println(estado);
		System.out.println("Fim de teste");
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_um_codigo_igual_a_0() {
		estado.setCod(0);
		Assert.assertEquals(null, estado.getCod());
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uma_uf_nula() {
		estado.setUf(null);
		Assert.assertNull(estado.getUf());
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uma_uf_vazia() {
		estado.setUf("");
		Assert.assertNull(estado.getUf());
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uma_uf_com_mais_de_2_caracteres() {
		estado.setUf("paraiba");
		Assert.assertNull(estado.getUf());
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uma_uf_com_menos_de_2_caracteres() {
		estado.setUf("u");
		Assert.assertNull(estado.getUf());
	}

	@Test
	public void deve_aceitar_uma_uf_com_2_caracteres() {
		estado.setUf("df");
		Assert.assertNotNull(estado.getUf());
	}

	@Test
	public void printObj() {
		System.out.println(estado);
	}

	@Test(expected = IllegalArgumentException.class)
	public void nao_deve_aceitar_uma_cidade_invalida() {
		Cidade cidade = new Cidade();
		cidade.setCodigo(-1);
		cidade.setNome(null);
		Bairro bairro = new Bairro();
		bairro.setCodigo(1);
		bairro.setNomeBairro("");
		cidade.setBairro(bairro);
		estado.setCidade(cidade);
		Assert.assertNull(estado.getCidade());
	}

	@Test
	public void deve_aceitar_uma_cidade_valida() {
		Cidade cidade = new Cidade();
		cidade.setCodigo(1);
		cidade.setNome("sao Paulo");
		Bairro bairro = new Bairro();
		bairro.setCodigo(1);
		bairro.setNomeBairro("Jardim Ibirapuera");
		cidade.setBairro(bairro);
		estado.setCidade(cidade);

		Assert.assertNotNull(estado.getCidade());
	}

}
