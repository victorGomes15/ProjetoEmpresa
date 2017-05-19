package br.com.contmatic.testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.empresa.Endereco;

public class EnderecoTeste {

	private Endereco endereco;
	
	@BeforeClass
    public static void setUpClass() {
		System.out.println("Começo dos testes da classe "+EnderecoTeste.class.getSimpleName()+"\n");
    }
    
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("Fim dos testes da classe "+EnderecoTeste.class.getSimpleName()+"\n");
    }

	@Before
	public void criar_endereco() {
		endereco = new Endereco();
		System.out.println("Começo do teste "+EnderecoTeste.class);
	}

	@After
	public void finalizacao_Teste() {
		System.out.println("Fim de teste");;
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
		endereco.setRua("cas");
		Assert.assertNull(endereco.getRua());
	}

	@Test
	public void deve_aceitar_uma_rua_com_mais_de_4_caracteres() {
		endereco.setRua("joao 12");
		Assert.assertEquals("joao 12",endereco.getRua());
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
	public void nao_deve_aceitar_um_numero_igual_a_0() {
		endereco.setNumero(0);
		Assert.assertNull( endereco.getNumero());
	}
	
	@Test
	public void deve_aceitar_um_complemento_maior_igual_a_0() {
		endereco.setComplemento(0);
		Assert.assertNull(endereco.getNumero());
	}
	
	@Test
	public void nao_deve_aceitar_um_complemento_menor_que_0() {
		endereco.setComplemento(-1);
		Assert.assertNull(endereco.getNumero());
	}

	
}
