


class Cliente extends Pessoa{
    private double medidaBracoEsq;
    private double medidaBracoDir;
    private double medidaCoxaEsq;
    private double medidaCoxaDir;
    private double medida_cintura;
    private double peso;

    public Cliente(String nome_, String cpf_, double medidaBracoEsq_, double medidaBracoDir_, double medidaCoxaEsq_, double medidaCoxaDir_, double medida_cintura, double peso_){
        this.setNome(nome_);
        this.setCpf(cpf_);
        //this.setCodigo(codigo_++);
        this.medidaBracoEsq = medidaBracoEsq_;
        this.medidaBracoDir = medidaBracoDir_;
        this.medidaCoxaEsq = medidaCoxaEsq_;
        this.medidaCoxaDir = medidaCoxaEsq_;
        this.medida_cintura = medida_cintura;
        this.peso = peso_;

    }
    public Cliente(){

    }
    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " CPF: "+ this.getCpf() +" Código: " + this.getCodigo();
    }
    

}