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
		Assert.assertNotNull(empresa.getCnpj());
		;
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_menor_14_caracteres() {
		empresa.setCnpj("1234567890123");
		Assert.assertNull(empresa.getCnpj());
		;
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_maior_14_caracteres() {
		empresa.setCnpj("123456789012345");
		Assert.assertNull(empresa.getCnpj());
		;
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_nulo() {
		empresa.setCnpj(null);
		Assert.assertNull(empresa.getCnpj());
		;
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_vazio() {
		empresa.setCnpj("");
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_endereco_nulo() {
		empresa.setEndereco(null);
		Assert.assertNull(empresa.getEndereco());
	}

	@Test
	public void nao_deve_ser_um_endereco_vazio() {
		empresa.setEndereco("");
		Assert.assertNull(empresa.getEndereco());
	}

	@Test(expected = NullPointerException.class)
	public void getEnderecoTesteNull() {
		empresa.getEndereco().length();
	}

	@Test
	public void nao_deve_aceitar_um_telefone_nulo() {
		empresa.setTelefone(null);
		Assert.assertNull(empresa.getTelefone());
	}

	@Test
	public void telefone_deve_nao_conte_menos_de_8_caracteres() {
		empresa.setTelefone("1234567");
		Assert.assertNull(empresa.getTelefone());
	}

	@Test
	public void telefone_nao_deve_conter_mais_de_9_caracteres() {
		empresa.setTelefone("1234567890");
		Assert.assertNull(empresa.getTelefone());
	}

	@Test
	public void nao_deve_aceitar_um_telefone_vazio() {
		empresa.setTelefone("");
		Assert.assertNull(empresa.getTelefone());
	}

	@Test
	public void nao_deve_aceitar_um_dono_nulo() {
		empresa.setDono(null);
		Assert.assertNull(empresa.getDono());
	}

	@Test
	public void nao_deve_aceitar_um_dono_vazio() {
		empresa.setDono("");
		Assert.assertNull(empresa.getDono());
	}
	
	@Test
	public void nao_deve_aceitar_um_dono_com_menos_de_5_caracteres() {
		empresa.setDono("Jose");
		Assert.assertNull(empresa.getDono());
	}

	@Test
	public void nao_deve_aceitar_uma_inscrição_estadual_nula() {
		empresa.setInscricaoEstadual(null);
		Assert.assertNull(empresa.getInscricaoEstadual());
	}

	@Test
	public void nao_deve_aceitar_uma_inscrição_estadual_vazia() {
		empresa.setInscricaoEstadual("");
		Assert.assertNull(empresa.getInscricaoEstadual());
	}

	@Test
	public void nao_deve_aceitar_uma_inscrição_maior_que_13_caracteres() {
		empresa.setInscricaoEstadual("12345678910234");
		Assert.assertNull(empresa.getInscricaoEstadual());
	}

	@Test
	public void nao_deve_aceitar_uma_inscrição_estadual_menor_que_13_caracteres() {
		empresa.setInscricaoEstadual("123456789012");
		Assert.assertNull(empresa.getInscricaoEstadual());
	}

	@Test
	public void nao_deve_aceitar_um_email_nulo() {
		empresa.setEmail(null);
		Assert.assertNull(empresa.getEmail());
	}
	
	@Test
	public void nao_deve_aceitar_um_email_vazio() {
		empresa.setEmail("");
		Assert.assertNull(empresa.getEmail());
	}
	
	@Test
	public void nao_deve_aceitar_um_email_com_mais_de_1_arroba() {
		empresa.setEmail("joao@gmail@.com.br");
		Assert.assertNull(empresa.getEmail());
	}
	
	@Test
	public void nao_deve_aceitar_um_email_com_ponto_no_final() {
		empresa.setEmail("joao@gmail.com.br.");
		Assert.assertNull(empresa.getEmail());
	}

	@Test
	public void nao_deve_aceitar_uma_razaoSocial_nula() {
        empresa.setRazaoSocial(null);
		Assert.assertNull(empresa.getRazaoSocial());
	}
	
	@Test
	public void nao_deve_aceitar_uma_razaoSocial_vazia() {
        empresa.setRazaoSocial("");
		Assert.assertNull(empresa.getRazaoSocial());
	}

}
