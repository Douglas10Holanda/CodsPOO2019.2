import java.util.ArrayList;


class Endereco{
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario_CAIXA> funC = new ArrayList<>();
    private ArrayList<Gerente> gerente = new ArrayList<>();
    private ArrayList<Fun_Instrutor> funI = new ArrayList<>();
    private ArrayList<Fun_Limpeza> funL = new ArrayList<>();

    public void adicionarCliente(String nomeCliente, String cpfCliente, double bracoEsq, double bracoDir, double pernaEsq, double pernaDir, double cintura, double peso){
        clientes.add(new Cliente(nomeCliente, cpfCliente, bracoEsq, bracoDir, pernaEsq, pernaDir, cintura, peso));
  
    }
    public void adicionarGerente(String nomeGerente, String cpfGerente, int codigoGerente){
        gerente.add(new Gerente(nomeGerente, cpfGerente, codigoGerente));
    }
    public void adicionarCaixa(String nomeCaixa, String cpfCaixa, int codigoCaixa){
        funC.add(new Funcionario_CAIXA(nomeCaixa, cpfCaixa, codigoCaixa));

    }
    public void adicionarInstrutor(String nomeInstrutor, String cpfInstrutor, int codigoInstrutor){
        funI.add(new Fun_Instrutor(nomeInstrutor, cpfInstrutor, codigoInstrutor));

    }
    public void adicionarLimpeza(String nomeLimpeza, String cpfLimpeza, int codigoLimpeza){
        funL.add(new Fun_Limpeza(nomeLimpeza, cpfLimpeza, codigoLimpeza));
    }
    public boolean mostrarCliente(){
        for(Cliente i: clientes)
            System.out.println(i);

        if(!clientes.isEmpty())
            return true;
        return false;
    }
    public boolean mostrarGerente(){
        for(Gerente i: gerente)
            System.out.println(i);
        
        if(!gerente.isEmpty())
            return true;
        return false;
    }
    public boolean mostrarCaixa(){
        for(Funcionario_CAIXA funcc: funC)
            System.out.println(funcc);
        if(!funC.isEmpty())
            return true;
        return false;
    }
    public boolean mostrarInstrutor(){
        for(Fun_Instrutor i: funI)
            System.out.println(i);
        if(!funI.isEmpty())
            return true;
        return false;
    }
    public boolean mostrarLimpeza(){
        for(Fun_Limpeza j: funL)
            System.out.println(j);
        if(!funL.isEmpty())
            return true;
        return false;
    }
   
}