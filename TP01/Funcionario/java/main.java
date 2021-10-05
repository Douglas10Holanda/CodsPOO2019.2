package Funcionario.java;

public class main{
	public static void main(String[] args) {
		Funcionario dh = new Funcionario();
                Data dt = new Data();
		dh.setNome("Douglas Holanda");
		dh.setDepartamento("Financeiro");
		dh.setSalario(150);
                dh.bonifica(100);
                dh.setRG("026.907.195-02");
                dt.dia = 30;
                dt.mes = 12;
                dt.ano = 2019;
		dh.dataEntrada = dt;
             
		dh.mostra();
	}
	
}