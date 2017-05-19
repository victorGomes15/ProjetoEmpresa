package br.com.contmatic.testes;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;

import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contmatic.empresa.Empresa;
import br.com.contmatic.empresa.Telefone;
import br.com.contmatic.empresa.TelefoneType;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTeste {

	private Empresa empresa;

	@BeforeClass
    public static void setUpClass() {
		System.out.println("Começo dos testes da classe "+EmpresaTeste.class.getSimpleName()+"\n");
	}
    
    @AfterClass
    public static void tearDownClass() {
    	System.out.println("Fim dos testes da classe"+EmpresaTeste.class.getSimpleName()+"\n");
    }
	
	@Before
	public void criarObj() {
		empresa = new Empresa();
		System.out.println("Começo do teste");
	}
	
	@After
	public void finalizacao_Teste() {
		System.out.println("Fim de teste");;
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
	
	@Test(timeout=100)
	public void deve_aceitar_telefone_valido() {
		Telefone tel = new Telefone();
		tel.setDdd(11);
		tel.setNumero("58254952");
		String tipo="Fixo";
		TelefoneType.valueOf(tipo);
		tel.setTipo(TelefoneType.valueOf(tipo));
		
		Set<Telefone > listTelefone = new HashSet<>();
		listTelefone.add(tel);
		empresa.setTelefone(listTelefone);
		Assert.assertNotNull(empresa.getTelefone());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_antes_do_arroba() {
		empresa.setRazaoSocial("@gmail.com.br");
		Assert.assertNull(empresa.getRazaoSocial());
	}

	@Test
	public void nao_deve_aceitar_um_email_que_esteja_vazio_depois_do_arroba() {
		empresa.setRazaoSocial("jose @");
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
	public void deve_aceitar_uma_data_de_criaçao() throws ParseException {
		org.joda.time.format.DateTimeFormatter formatter= DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss");
		String data ="13/05/2017";
		empresa.setDataCriacao(formatter.parseDateTime(data));
		Assert.assertNotNull(empresa.getDataCriacao());
	}
	
	@Test
	public void nao_deve_aceitar_uma_data_de_criaçao_invalida() {
		Assert.assertNull(empresa.getDataCriacao());
	}
	
	@Ignore
	@Test
	public void deve_printar_o_objeto_de_empresa() {
		System.out.println(empresa.toString());
	}
}
