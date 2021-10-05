package Trabalho4;

public class Animal{
    private String nome;
    private int idade;
        
    public void emitir_som(boolean Animal){
        if (Animal == true){
            System.out.println("FAZENDO BARULHO");
        }else{
            System.out.println("Está calado");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void mostrar(){
        System.out.println("Nome:" +this.nome);
        System.out.println("Idade:" +this.idade);
    }    
}
