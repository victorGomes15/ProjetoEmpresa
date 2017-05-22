package br.com.contmatic.empresa;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

public class GerenciadorTelefone {

	private Set<Telefone> listaNumeros = new HashSet<>();

	public void addTelefone(Telefone telefone) {
		Preconditions.checkArgument(verificarSeIgual(telefone), "Tipo do telefone já existente");
		listaNumeros.add(telefone);
	}

	private boolean verificarSeIgual(Telefone telefone) {
		for (Telefone tele : listaNumeros) {
			if (tele.getTipo().getDescricao().equals(telefone.getTipo().getDescricao())) {
				return true;
			}
		}
		return false;
	}

	public Set<Telefone> getListaNumeros() {
		return listaNumeros;
	}

}
