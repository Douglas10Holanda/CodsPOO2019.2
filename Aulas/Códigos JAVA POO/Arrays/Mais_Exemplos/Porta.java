import java.util.ArrayList;

public class Porta {
	int cor;
        boolean aberta = false;

	public void Pintar(int cor_i) {
		cor = cor_i;
	}

	public void Abrir() {
		aberta = true;
	}
	
	public void Fechar() {
		aberta = false;
	}
}






