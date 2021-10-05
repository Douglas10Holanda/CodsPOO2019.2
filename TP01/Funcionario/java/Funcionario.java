package Funcionario.java;

public class Funcionario{
	private String nome;
	private String departamento;
	double salario;
	Data dataEntrada;
	private String RG;

public void Esta_empresa(boolean sim, boolean nao) {
	if (sim==true) {
		System.out.println("Está na empresa");
	}if (nao==false) {
		System.out.println("Não está na empresa");
	}
	
}
	
void bonifica(double aumento) {
    salario += aumento;
}

void demite() {
	System.out.println("Não está mais na empresa");
}

public String getNome() {
	return this.nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
	
public String getDepartamento() {
	return this.departamento;
}

public void setDepartamento(String departamento) {
	this.departamento = departamento;
}

public double getSalario() {
	return this.salario;
}
	
public void setSalario(double salario) {
	this.salario = salario;
}

public String getRG() {
	return this.RG;
}

public void setRG(String RG) {
	this.RG = RG;
}

public void mostra(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Departamento: " + this.departamento);
    System.out.println("Salario:R$ " + this.salario);
    System.out.println("Rg: " + this.RG);
    
    System.out.println("Data de Entrada: " + this.dataEntrada.dia + this.dataEntrada.mes + this.dataEntrada.ano);
    System.out.println("Dia: " + this.dataEntrada.dia);
    System.out.println("Mês: " + this.dataEntrada.mes);
    System.out.println("Ano: " + this.dataEntrada.ano);
}
}