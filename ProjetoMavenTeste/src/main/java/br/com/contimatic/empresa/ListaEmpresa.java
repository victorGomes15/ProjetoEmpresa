package br.com.contimatic.empresa;

import java.util.ArrayList;

public class ListaEmpresa {

	public ArrayList<Empresa> list = new ArrayList<Empresa>();

	public void addEmpresa(Empresa e) {
		if (e != null) {
			list.add(e);
		}
	}

	public boolean removeList(int index) {

		for (int i = 0; i < list.size(); i++) {
			
			if (index == i) {
				list.remove(i);
				return true;
			}
		}
		System.out.println("Indice inexistente");
		return false;
	}

	public String printList() {
		String saida = "";
		for (int i = 0; i < list.size(); i++) {
			saida += " Cnpj: " + list.get(i).getCnpj() + "\n Razão Social: " + list.get(i).getRazaoSocial()
					+ "\tInscrição: " + list.get(i).getInscricaoEstadual() + "\n Endereço: " + list.get(i).getEndereco()
					+ "\n Email:" + list.get(i).getEmail() + "\n Dono: " + list.get(i).getDono() + "\t Telefone: "
					+ list.get(i).getTelefone();
		}
		return saida;

	}
	
	
	@Override
	public String toString() {
	
		return super.toString();
	}

}
