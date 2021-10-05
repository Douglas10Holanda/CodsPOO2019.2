class Empresa {
	int cnpj;
	Funcionario[] funcionarios;

	Empresa() { }
	Empresa(int n) {
		funcionarios = new Funcionario[n];
	}
}
