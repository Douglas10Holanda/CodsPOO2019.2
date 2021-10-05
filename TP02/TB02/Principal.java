package TB02;

import TB02.Cadastro;

public class Principal {

	public static void main(String[] args) {
		
		Contato cont1 = new Contato("85977777777", "Goku"); 
		Contato cont2 = new Contato("88999999999", "Douglas"); 
		Contato cont3 = new Contato("88988888888", "Iury");
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.adicionarContato(cont1);
		cadastro.adicionarContato(cont2);
		cadastro.adicionarContato(cont3);
		
		cadastro.getContatos();
		
		cadastro.atualizarContato("85977777777", "Kakaroto");
		cadastro.atualizarContato("88999999999", "Eu sou o Dougras");
		cadastro.atualizarContato("87988888888", "Iury Gay");
		
		cadastro.getContatoByTel("88997448130");
		cadastro.getContatoByTel("8899999999");
		cadastro.getContatoByTel("88994496036");
		
		cadastro.getContatos();
		
		cadastro.removerContato("88999999999");
		
		cadastro.getContatos();
		
		cadastro.resetAgenda();
		
		cadastro.getContatos();
		
		
	}

}
