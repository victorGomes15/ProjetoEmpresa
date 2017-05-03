package br.com.contimatic.teste;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import br.com.contimatic.empresa.Empresa;
import br.com.contimatic.empresa.ListaEmpresa;

public class TesteLista {
	
	@Test
	public void deve_adcionar_na_lista_se_o_obj_nao_ser_null(){
		ListaEmpresa l = new ListaEmpresa();
		Empresa e = new Empresa();
	}

	@Test
	public void removeList() {
		ListaEmpresa l = new ListaEmpresa();
		Empresa e = new Empresa();
		l.addEmpresa(e);
		

		assertEquals(true, l.removeList(0));
		
	}
	
	

}
