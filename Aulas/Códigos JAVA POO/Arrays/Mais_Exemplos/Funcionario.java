class Funcionario {
	static int cont = 0;	

	public String nome;
	private double salario;
	private int id;
        
	public double getSalario() { return this.salario; }
	public int getId() { return this.id; }
	public void setSalario(double salario) { this.salario = salario; }

	Funcionario () { 
		cont++;
		id = cont;	
	}

	Funcionario (String nome) {
		this.nome = nome;
		cont++;
		id = cont;
	}
}
