import java.util.ArrayList;

public class Casa {
	int cor;
        ArrayList<Porta> portas = new ArrayList<>();

	public void Pintar(int cor_i) {
		cor = cor_i;
	}

	public void adicionaPorta(Porta p) {
		portas.add(p);
	}

	public int totalDePortas() {
		return portas.size();
	}

	public int quantasPortasEstaoAbertas() {
		int contador = 0;
		
		for(int i=0;i<portas.size();i++) {
			if(portas.get(i).aberta==true) contador++;
		}
		return contador;	
	}
}






