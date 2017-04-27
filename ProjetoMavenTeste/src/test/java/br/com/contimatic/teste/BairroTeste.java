package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Bairro;

public class BairroTeste {

	private Bairro bairro;
	@Before
	public void criaObjt(){
		bairro = new Bairro();
	}
	
	@Test
	public void nao_deve_aceitar_um_codigo_igual_0(){
		bairro.setCodigo(0);
		Assert.assertNull(bairro.getCodigo());
	}
	
	@Test
	public void nao_deve_aceitar_um_codigo_negativo(){
		bairro.setCodigo(-1);
		Assert.assertEquals(0,bairro.getCodigo());
	}
	
	@Test
	public void deve_aceitar_um_codigo_maior_que_0(){
		bairro.setCodigo(0);
		Assert.assertNotNull(bairro.getCodigo());
	}
	
	@Test
	public void nao_deve_aceitar_um_bairro_nulo(){
		bairro.setNomeBairro(null);
		Assert.assertNull(bairro.getNomeBairro());
	}
	
	@Test
	public void nao_deve_aceitar_um_bairro_vazio(){
		bairro.setNomeBairro("");
		Assert.assertNull(bairro.getNomeBairro());
	}
	
	@Test
	public void nao_deve_aceitar_um_bairro_menor_que_4_caracteres(){
		bairro.setNomeBairro("123");
		Assert.assertNull(bairro.getNomeBairro());
	}
}
