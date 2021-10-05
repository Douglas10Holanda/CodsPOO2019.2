import java.util.ArrayList;
import java.util.Arrays;

class Principal {
	public static void main(String[] args) {
		// Arrays de tipos primitivos
		int[] idades;

		idades = new int[5];
		idades[2] = 20;
		System.out.println("A idade é: " + idades[2]);

		// Arrays de objetos

		Conta[] minhasContas;
		minhasContas = new Conta[2];

		Conta contaNova = new Conta(1010);
		contaNova.saldo = 1000.0;
		minhasContas[0] = contaNova;
			// ou
		minhasContas[1] = new Conta(2020);
		minhasContas[1].saldo = 3200.0;

		// Percorrendo arrays (NÃO pode mudar de tamanho!)
		for (int i = 0; i < minhasContas.length; i++) System.out.println(minhasContas[i].saldo);

		for (int x : idades) System.out.println(x);

		// Arrays Bidimensionais
		int[][] array1 = { { 1,2,3 }, { 4, 5, 6 } };
		int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6} };
		
		System.out.println("Valores no array1 passados na linha são");
		//outputArray( array1 ); //exibe o array 1 por linha
		
		System.out.println("Valores no array2 passados na linha são");
		//outputArray( array2 ); //exibe o array 2 por linha
		
		// Array Lists
            	ArrayList<String> bandas = new ArrayList<String> ();
            
            	bandas.add("Rush");
            	System.out.print( "Adicionando a banda Rush: " );
            	System.out.println( Arrays.toString( bandas.toArray() ) );
            
            	bandas.add("Beatles");
            	System.out.print( "Adicionando a banda Beatles: " );
            	System.out.println( Arrays.toString( bandas.toArray() ) );
            
            	bandas.add("Iron Maiden");
            	System.out.print( "Adicionando a banda Iron Maiden: " );
            	System.out.println( Arrays.toString( bandas.toArray() ) );
            
            	System.out.print( "Quem está na índice 0: " );
            	System.out.println( bandas.get(0) );
            
            	System.out.print( "Adicionando Tiririca onde estava o Rush: " );
            	bandas.add( bandas.indexOf("Rush"), "Tiririca");
            	System.out.println( Arrays.toString( bandas.toArray() ) );
            
            	System.out.print( "Número de elementos na lista: " );
            	System.out.println( bandas.size() );
            
            	System.out.print( "Removendo o Tiririca: " );
            	bandas.remove("Tiririca");
            	System.out.println( Arrays.toString( bandas.toArray() ) );
            
            	System.out.print( "Removendo tudo: " );
            	bandas.clear();
            	System.out.println( Arrays.toString( bandas.toArray() ) );
	}
}

// EXERCICIOS: Apostila Caelum
