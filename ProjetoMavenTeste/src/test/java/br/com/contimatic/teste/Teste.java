package br.com.contimatic.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contimatic.empresa.Empresa;
import jdk.nashorn.internal.ir.annotations.Ignore;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Teste {

	private Empresa empresa;

	@Before
	public void criarObj() {
		 empresa = new Empresa();
	}

	@Test
	public void deve_aceitar_um_cnpj_com_14_caracteres() {
		empresa.setCnpj("123456789012345");
		Assert.assertNotNull(empresa.getCnpj());;
	}
	
	@Test
	public void nao_deve_aceitar_um_cnpj_menor_14_caracteres() {
		empresa.setCnpj("1234567890123");
		Assert.assertNull(empresa.getCnpj());;
	}
	
	@Test
	public void nao_deve_aceitar_um_cnpj_maior_14_caracteres() {
		empresa.setCnpj("123456789012345");
		Assert.assertNull(empresa.getCnpj());;
	}
	
	@Test
	public void nao_deve_aceitar_um_cnpj_nulo() {
		empresa.setCnpj(null);
		Assert.assertNull(empresa.getCnpj());;
	}
	@Test
	public void nao_deve_aceitar_um_cnpj_vazio() {
		empresa.setCnpj("");
		Assert.assertNull(empresa.getCnpj());
	}
	


	@Test
	public void setEndereco() {
		boolean endereco = empresa.setEndereco("Rua Olimpio Santos");
		Assert.assertEquals(true, endereco);
	}

	@Test(expected = NullPointerException.class)
	public void getEnderecoTesteNull() {
		empresa.getEndereco().length();
	}

	@Test
	public void setTelefone() {
		boolean tel = empresa.setTelefone("58254952");
		Assert.assertEquals(true, tel);
	}

	@Test
	public void setDono() {

		boolean dono = empresa.setDono("José da Silva");
		Assert.assertEquals(true, dono);

	}

	@Test
	public void setInscricao() {

		boolean inscricaoj = empresa.setInscricaoEstadual("12345678901234");
		assertTrue(inscricaoj);

	}

	@Ignore
	@Test
	public void setEmail() {

		boolean email = empresa.setEmail("empresax@empresa.com");
		assertEquals(true, email);
	}

	@Test
	public void setRazaoSocial() {

		boolean razao = empresa.setRazaoSocial("Emprasa 123");
		assertTrue(razao);

	}

}
