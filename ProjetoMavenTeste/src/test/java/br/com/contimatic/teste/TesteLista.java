package br.com.contimatic.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.contimatic.empresa.Empresa;
import br.com.contimatic.empresa.ListaEmpresa;

public class TesteLista {
	
	@Test
	public void adcList(){
		ListaEmpresa l = new ListaEmpresa();
		Empresa e = new Empresa();
		
		assertEquals(true, l.addEmpresa(e));
		
	}

	@Test
	public void removeList() {
		ListaEmpresa l = new ListaEmpresa();
		Empresa e = new Empresa();
		l.addEmpresa(e);
		

		assertEquals(true, l.removeList(0));
		
	}

}
