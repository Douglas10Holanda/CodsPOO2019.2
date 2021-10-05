package TB02;

import java.util.ArrayList;
import java.util.List;
import TB02.Contato;

public class Cadastro {
	
	private List<Contato> dados = new ArrayList<Contato>();
	 
	//Metodo para Limpar a Agenda
	public void resetAgenda() {
		dados.clear();
		System.out.println("A agenda foi Limpa!");
	}

	public void adicionarContato(Contato contato) {
		dados.add(contato);
		System.out.println("O contato foi adicionado!");
	}

	//Pegar Contato pelo Telefone
	public String getContatoByTel(String telefone) {
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getTelefone().equals(telefone)) {
				System.out.println(dados.get(i).getNome());
				return dados.get(i).getNome();
			}
		}
		return ("Telefone não encontrado");
	}
	
	//Atualizar o nome do contato que possui tal telefone
	public String atualizarContato(String telefone, String nome) {
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getTelefone().equals(telefone)) {
				dados.get(i).setNome(nome);
				System.out.println("Contato atualizado!");
			}
		}
		return ("Telefone não encontrado");
	}

	public void removerContato(String telefone) {
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getTelefone().equals(telefone)) {
				dados.remove(i);
				System.out.println("O contato "+dados.get(i).getTelefone()+" foi excluido!");
			}
		}
	}

	public void getContatos() {
		for(int i = 0; i < dados.size(); i++) {
			System.out.println(dados.get(i).toString());
		}
		if(dados.size() == 0) {
			System.out.println("Agenda vazia!");
		}
	}

}
