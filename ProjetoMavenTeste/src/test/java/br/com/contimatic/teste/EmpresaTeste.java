package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contimatic.empresa.Empresa;
import br.com.contimatic.empresa.Telefone;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTeste {

	private Empresa empresa;

	@Before
	public void criarObj() {
		empresa = new Empresa();
	}

	@Test
	public void deve_aceitar_um_cnpj_com_14_caracteres() {
		empresa.setCnpj("12345678901234");
		Assert.assertNotNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_menor_14_caracteres() {
		empresa.setCnpj("1234567890123");
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_maior_14_caracteres() {
		empresa.setCnpj("123456789012345");
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_nulo() {
		empresa.setCnpj(null);
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_vazio() {
		empresa.setCnpj("");
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_cnpj_com_letras() {
		empresa.setCnpj("12345678901234l");
		Assert.assertNull(empresa.getCnpj());
	}

	@Test
	public void nao_deve_aceitar_um_endereco_nulo() {
		empresa.setEndereco(null);
		Assert.assertNull(empresa.getEndereco());
	}

//	@Test
//	public void nao_deve_ser_um_endereco_vazio() {
//		empresa.setEndereco("");
//		Assert.assertNull(empresa.getEndereco());
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void getEnderecoTesteNull() {
//		empresa.getEndereco().length();
//	}

	@Test
	public void deve_aceitar_um_Telefone_valido() {
		Telefone t = new Telefone();
		t.setDdd(11);
		t.setNumero("58254952");
		t.setTipo("Fixo");
		
		Telefone t1 = new Telefone();
		t1.setDdd(11);
		t1.setNumero("58254952");
		t1.setTipo("Fixo");
		
		Telefone tArray[]= new Telefone[2]; 
		
		empresa.setTelefone(tArray);
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
	public void nao_deve_aceitar_um_dono_com_numeros() {
		empresa.setDono("Jose5");
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
	public void deve_aceitar_uma_inscrição_com_13_caracteres() {
		empresa.setInscricaoEstadual("1234567891023");
		Assert.assertNotNull(empresa.getInscricaoEstadual());
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
	public void nao_deve_aceitar_uma_inscrição_estadual_com_letras() {
		empresa.setInscricaoEstadual("123456789102l");
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
	public void deve_aceitar_um_email_com_1_arroba() {
		empresa.setEmail("joao@gmail.com.br");
		Assert.assertNotNull(empresa.getEmail());
	}

	@Test
	public void nao_deve_aceitar_um_email_com_ponto_no_final() {
		empresa.setEmail("joao@gmail.com.br.");
		Assert.assertNull(empresa.getEmail());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_antes_do_arroba() {
		empresa.setRazaoSocial("@gmail.com.br");
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_depois_do_arroba() {
		empresa.setRazaoSocial("jose@");
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_uma_razaoSocial_nula() {
		empresa.setRazaoSocial(null);
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_uma_razaoSocial_com_caracteres_especiais() {
		empresa.setRazaoSocial("luis@");
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_um_nome_de_empresa_nulo() {
		empresa.setRazaoSocial(null);
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_um_nome_de_empresa_vazia() {
		empresa.setRazaoSocial("");
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void deve_printar_o_objeto_de_empresa() {
		empresa.toString();
	}
}
