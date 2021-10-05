package ZOO;

public class Zoologico {

    private static String Leão;
    public static void main(String[] args){        
        
    String jaulas[] = {"Leão","Tigre","Onça","Hiena","Crocodilo","Girafa","Gorila","Avestruz","Cobra","Lobo"};
         
    for(int i=0;i<jaulas.length;i++){
        System.out.println("Na Jaula " + i + " temos:  " + jaulas[i]);
    }
    //novos objetos
    Animal leao = new Animal();
    Animal onça = new Animal();
    Animal tigre = new Animal();
    Animal gorila = new Animal();
    Animal avestruz = new Animal();
    Animal cobra = new Animal();
    Animal lobo = new Animal();
    Animal hiena = new Animal();
    Animal girafa = new Animal();
    Animal crocodilo = new Animal();
    
    System.out.println("\n");
    //emitindo sons
    leao.emitirSom();
    onça.emitirSom();
    tigre.emitirSom();
    gorila.emitirSom();
    avestruz.emitirSom();
    cobra.emitirSom();
    lobo.emitirSom();
    hiena.emitirSom();
    girafa.emitirSom();
    crocodilo.emitirSom();
    
    System.out.println("\n");
    //animais correndo
    leao.correr();
    onça.correr();
    tigre.correr();
    gorila.correr();
    avestruz.correr();
    cobra.correr();
    lobo.correr();
    hiena.correr();
    girafa.correr();
    crocodilo.correr();
    
    
    
    }
}
