/*1- Classe: Casa Atributos: cor, totalDePortas, portas[] Métodos: void pinta(String s), int quantasPortasEstaoAbertas(), void adicionaPorta(Porta p), int totalDePortas().

Crie um programa que instancia uma Casa. Use os métodos para pinta-la, criar três portas e coloca-las na casa através do método adicionaPorta(), abra e feche-as como desejar no método main para teste. Utilize o método quantasPortasEstaoAbertas() para imprimir o número de portas
abertas e o método totalDePortas() para imprimir o total de portas em sua casa.*/

public class Main {
	static public void main(String args[]) {
		Casa nova_casa = new Casa();

		nova_casa.adicionaPorta(new Porta());
		nova_casa.adicionaPorta(new Porta());
		nova_casa.adicionaPorta(new Porta());

		System.out.println("Quantidade de portas: "+nova_casa.totalDePortas());
	}
}






