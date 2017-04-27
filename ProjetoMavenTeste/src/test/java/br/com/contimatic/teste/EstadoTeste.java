package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Bairro;
import br.com.contimatic.empresa.Cidade;
import br.com.contimatic.empresa.Estado;

public class EstadoTeste {

	private Estado estado= new Estado();
	@Before
	public void criar_objeto(){
		estado = new Estado();
	}
	
	@Test
	public void nao_deve_aceitar_um_codigo_vazio(){
		estado.setCod(0);
		Assert.assertNull(estado.getCod());
	}
	
	@Test
	public void nao_deve_aceitar_um_codigo_igual_a_0(){
		estado.setCod(0);
		Assert.assertNull(estado.getCod());
	}
	
	
	@Test
	public void nao_deve_aceitar_uma_uf_nula(){
		estado.setUf(null);
		Assert.assertNull(estado.getUf());
	}
	
	@Test
	public void nao_deve_aceitar_uma_uf_vazia(){
		estado.setUf("");
		Assert.assertNull(estado.getUf());
	}
	
	@Test
	public void nao_deve_aceitar_uma_uf_com_mais_de_2_caracteres(){
		estado.setUf("paraiba");
		Assert.assertNull(estado.getUf());
	}
	
	@Test
	public void nao_deve_aceitar_uma_uf_com_menos_de_2_caracteres(){
		estado.setUf("u");
		Assert.assertNull(estado.getUf());
	}
	
	@Test
	public void nao_deve_aceitar_uma_uf_com_2_caracteres(){
		estado.setUf("df");
		Assert.assertNotNull(estado.getUf());
	}
	
	@Test
	public void nao_deve_aceitar_uma_cidade_invalida(){
		Cidade c = new Cidade();
		c.setCodigo(1);
		c.setNome("asm");
		c.setBairro(null);
		estado.setCidade(c);
		Assert.assertNull(estado.getCidade());
	}
	
	@Test
	public void deve_aceitar_uma_cidade_valida(){
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
