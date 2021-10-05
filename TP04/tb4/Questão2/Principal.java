package Trabalho4;

public class Principal {
    public static void main(String[] args){
    
       Animal cachorro = new Animal();
        
       cachorro.setNome("Cachorrinho fia da puta");
       cachorro.setIdade(12);
       cachorro.emitir_som(true);
        
       cachorro.mostrar();
       
       System.out.println("\n");
       
       Animal cavalo = new Animal();
       
       cavalo.setNome("Pé de pano");
       cavalo.setIdade(23);
       cavalo.emitir_som(true);
       
       cavalo.mostrar();
       
       System.out.println("\n");
       
       Animal preguiça = new Preguiça();
       
       preguiça.setNome("Preguiçosa");
       preguiça.setIdade(30);
       preguiça.emitir_som(false);
       
       preguiça.mostrar();
        
    }
}
