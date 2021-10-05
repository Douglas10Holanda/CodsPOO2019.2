import java.util.ArrayList;
import java.util.Arrays;

class Principal {
	public static void main(String[] args) {		
		Empresa e = new Empresa(10);

		for(int i=0;i<3;i++) {
			Funcionario f = new Funcionario();
			e.funcionarios[i] = f;
		}
		
            	System.out.println(e.funcionarios[2].getId());
	}
}

