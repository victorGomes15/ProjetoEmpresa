package br.com.contimatic.teste;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contimatic.empresa.Empresa;
import jdk.nashorn.internal.ir.annotations.Ignore;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Teste {

	@Test(timeout = 10)
	public void setCnpj() {
		Empresa empresa = new Empresa();
		boolean cnpj = empresa.setCnpj("12");
		Assert.assertEquals(false, cnpj);
		
	}

	@Test
	public void setEndereco() {
		Empresa empresa = new Empresa();
		boolean endereco = empresa.setEndereco("Rua x, num 90");
		Assert.assertEquals(true, endereco);
		

	}

	@Test
	public void setTelefone() {
		Empresa empresa = new Empresa();
		boolean tel = empresa.setTelefone("58254952");
		Assert.assertEquals(true, tel);
		

	}

	@Test
	public void setDono() {
		Empresa empresa = new Empresa();
		boolean dono = empresa.setDono("José da Silva");
		Assert.assertEquals(true, dono);
		

	}

	@Test
	public void setInscricao() {
		Empresa empresa = new Empresa();
		boolean inscricaoj = empresa.setInscricaoEstadual("12345678901234");
		assertTrue(inscricaoj);

	}

	@Ignore
	@Test
	public void setEmail() {
		Empresa empresa = new Empresa();
		boolean email = empresa.setEmail("empresax@empresa.com");
		assertTrue(email);

	}

	@Test
	public void setRazaoSocial() {
		Empresa empresa = new Empresa();
		boolean razao = empresa.setRazaoSocial("Emprasa 123");
		assertTrue(razao);

	}

}
