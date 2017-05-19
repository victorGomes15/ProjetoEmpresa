package br.com.contmatic.templates;

import br.com.contmatic.empresa.Email;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class BairroTemplates implements TemplateLoader{

	@Override
	public void load() {
		Fixture.of(Email.class).addTemplate("valido", new Rule() {
			{
				add("enderecoEmail", random("victor@gmail.com", "victor@gmail.com.br", "Josevictor@gmail.com"));
			}
		});

		Fixture.of(Email.class).addTemplate("invalido", new Rule() {
			{
				add("enderecoEmail", random("@gmail.com", "victor@gmail.com.br.", "Jose@victor@gmail.com"));
			}
		});
		
	}

	
}
