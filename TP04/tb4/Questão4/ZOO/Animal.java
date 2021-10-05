package ZOO;

public class Animal {
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void emitirSom(){
        System.out.println("Fazendo Barulho");
    }
    
    public void correr(){
        System.out.println("Correndo");
    }
}
