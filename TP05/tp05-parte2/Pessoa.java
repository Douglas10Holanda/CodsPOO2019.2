


class Pessoa{
    public Endereco endereco = new Endereco();
    private String nome;
    private String cpf;
    private int codigo;
    private int senha = 1234;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    protected boolean autentica(int senha_){
        if(this.senha == senha_)
            return true;
        return false;
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Cpf: " + this.cpf + " Codigo: " + this.codigo;
    }
}