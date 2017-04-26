package br.com.contimatic.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.contimatic.empresa.Telefone;

public class TelefoneTeste {

	private Telefone telefone;

	@Before
	public void criar_objeto_telefone() {
		telefone = new Telefone();
	}

	@Test
	public void nao_deve_aceitar_ddd_menor_que_11() {
		telefone.setDdd(10);
		Assert.assertEquals(0, telefone.getDdd());
	}

	@Test
	public void nao_deve_aceitar_ddd_maior_que_99() {
		telefone.setDdd(100);
		Assert.assertEquals(0, telefone.getDdd());
	}

	@Test
	public void deve_aceitar_ddd_entre_11_e_99() {
		telefone.setDdd(20);
		Assert.assertEquals(20, telefone.getDdd());
	}

	@Test
	public void deve_aceitar_8_ou_9_caracteres_no_numero() {
		telefone.setNumero("12345678");
		Assert.assertNotNull(telefone.getNumero());
	}

	@Test
	public void nao_deve_conter_menos_de_8_caracteres_no_numero() {
		telefone.setNumero("1234567");
		Assert.assertNull(telefone.getNumero());
	}

	@Test
	public void nao_deve_conter_mais_de_9_caracteres_no_numero() {
		telefone.setNumero("1234567890");
		Assert.assertNull(telefone.getNumero());
	}

	@Test
	public void nao_deve_aceitar_um_Numero_vazio() {
		telefone.setNumero("");
		Assert.assertNull(telefone.getNumero());
	}

	@Test
	public void nao_deve_aceitar_um_Numero_com_letras() {
		telefone.setNumero("5825495l");
		Assert.assertNull(telefone.getNumero());
	}

	@Test
	public void nao_deve_aceitar_um_Tipo_vazio() {
		telefone.setTipo("");
		Assert.assertNull(telefone.getTipo());
	}

	@Test
	public void nao_deve_aceitar_um_Tipo_nulo() {
		telefone.setTipo(null);
		Assert.assertNull(telefone.getTipo());
	}

	@Test
	public void nao_deve_aceitar_um_Tipo_com_numero() {
		telefone.setTipo("Celular1");
		Assert.assertNull(telefone.getTipo());
	}

	@Test
	public void nao_deve_aceitar_um_Tipo_diferente_de_celular_ou_fixo() {
		telefone.setTipo("comercio");
		Assert.assertNull(telefone.getTipo());
	}

	@Test
	public void deve_aceitar_um_Tipo_que_seja_igual_celular_ou_fixo() {
		telefone.setTipo("fixo");
		Assert.assertNotNull(telefone.getTipo());
	}

}
