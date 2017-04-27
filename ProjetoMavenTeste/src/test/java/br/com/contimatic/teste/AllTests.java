package br.com.contimatic.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.contimatic.empresa.Cidade;
import br.com.contimatic.empresa.Telefone;

@RunWith(Suite.class)
@SuiteClasses({ EmpresaTeste.class, EnderecoTeste.class, TelefoneTeste.class, CidadeTeste.class })
public class AllTests {

}
