import java.util.Scanner;


class Planos{
    Pagamento pag = new Pagamento();
    Scanner in = new Scanner(System.in);

    public boolean Plano1(){
        int verifica = 0;
        System.out.println("Como deseja fazer o pagamento? 1-Boleto 2-Cartão de Crédito: ");
        verifica = in.nextInt();
        if(verifica == 1)
            pag.boleto(true);
        
        if(verifica == 2)
            pag.credito(true);
        return false;

    }
    public boolean Plano2(){
        int verifica = 0;
        System.out.println("Como deseja fazer o pagamento? 1-Boleto 2-Cartão de Crédito: ");
        verifica = in.nextInt();
        if(verifica == 1)
            pag.boleto(true);
        return false;

    }
    public boolean Plano3(){
        return false;
    }
}