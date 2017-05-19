package br.com.contmatic.templates;

import br.com.caelum.stella.type.Estado;
import br.com.contmatic.empresa.Cidade;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EstadoTemplates implements TemplateLoader {

	@Override
	public void load() {

		Fixture.of(Estado.class).addTemplate("estValido", new Rule() {
			{
				add("codigo", random(Integer.class, range(1, 100)));
				add("uf", random("Sp", "Rj", "Mg"));
				add("cidade", one(Cidade.class, "cidadeValida"));
			}
		});

	}

}
