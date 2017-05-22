package br.com.contmatic.templates;

import br.com.contmatic.empresa.Email;
import br.com.contmatic.empresa.Estado;
import br.com.contmatic.empresa.Telefone;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EmpresaTemplates implements TemplateLoader {

	@Override
	public void load() {
		Fixture.of(Estado.class).addTemplate("empresaValida", new Rule() {
			{
				add("cnpj", regex("\\d{2}.\\d{3}.\\d{3}/\\d{4}-\\d{2}"));
				add("dataCriacao", random("SP", "RJ", "MG"));
				add("dono", regex("^[A-Za-z]{4,50}"));
				add("email", one(Email.class, "emailValido"));
				add("endereco", one(Estado.class, "estadoValido"));
				add("inscricaoEstadual", regex("[0-9]{13}"));
				add("nomeEmpresa", random("Car System", "cidadeValida", "Super casinha"));
				add("razaoSocial", regex("[A-Za-z0-9]"));
				add("telefone", one(Telefone.class, "telefoneValido"));
			}
		});

	}

}
