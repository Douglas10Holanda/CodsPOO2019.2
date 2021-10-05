class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;

	private int senha;				// Atributo privado só pode ser acessado por objetos desta classe!

	public Conta(int senha_in) {			// Construtor
		this.senha = senha_in;
	}

	public void checarSenha(int senha_in) {
		if(senha_in == senha) System.out.println("Senha correta!");
		else System.out.println("Senha INCORRETA!");;
	}

	public void setSenha(int senha_in) {
		this.senha = senha_in;
	}	
}
