import java.util.ArrayList;

class Fun_Instrutor extends Pessoa{
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    public Fun_Instrutor(String nome, String cpf, int codigo){
        this.setNome(nome);
        this.setCpf(cpf);
        this.setCodigo(codigo);

    }
    public Fun_Instrutor(){
           
    }
}