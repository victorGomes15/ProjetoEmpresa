package br.com.contimatic.empresa;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Empresa e = new Empresa();
		ListaEmpresa l = new ListaEmpresa();

		Scanner ent = new Scanner(System.in);
		boolean estdCnpj = false;
		while (!estdCnpj) {
			System.out.println("Digite um cnpj");
			estdCnpj = e.setCnpj(ent.next());
		}

		e.setDono("José da silva");
		e.setEmail("abcde@gmail.com");
		e.setEndereco("Rua Carlos José, Num: 400");
		e.setInscricaoEstadual("123987456");
		e.setTelefone("58254952");
		e.setRazaoSocial("Empresa x");
		l.addEmpresa(e);
		System.out.println(l.printList());
		l.removeList(0);

	}

}
