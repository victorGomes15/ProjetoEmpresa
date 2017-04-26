package br.com.contimatic.empresa;

import java.util.ArrayList;

public class Telefone {

	private int ddd;
	private String numero;
	private String tipo;

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int dd) {
		if (dd > 10 & dd < 100) {
			this.ddd = dd;
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero != null) {
			if (numero.length() >= 8 && numero.length() <= 9) {
				if (numero.matches("[0-9]+")) {
					this.numero = numero;
				}
			}
		}
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null) {
			if (!tipo.isEmpty()) {
				if (tipo.equalsIgnoreCase("Fixo") || tipo.equalsIgnoreCase("Celular")) {
					this.tipo = tipo;
				}
			}
		}
	}

}