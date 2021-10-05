/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author 55889
 */
public class Empresa {
    double total;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int funcionarios[] = {1,2,7};
         
    for(int i=0;i<funcionarios.length;i++){
        System.out.println("Na empresa temos:  " + funcionarios[i] + " funcionário");
    }
    
    Funcionario gerente = new Funcionario();
    
        System.out.println("\n10% dos funcionários são GERENTES = 1 GERENTE");
        gerente.setNome("Douglas");
        gerente.setSalario(500);
        gerente.setValor(500);
        gerente.mostrar();
    
    Funcionario supervisor = new Funcionario();
    
        System.out.println("\n20% dos funcionários são SUPERVISORES = 2 SUPERVISORES");
        supervisor.setNome("Saul e Thales");
        supervisor.setSalario(500*1.5);
        supervisor.setValor( (500*1.5)* 2);
        supervisor.mostrar();
       
    Funcionario vendedor= new Funcionario();
    
        System.out.println("\n70% dos funcionários são VENDEDORES = 7 VENDEDORES");
        vendedor.setNome("Jose,joao,jaqueline,Sabrina,Samanta,Sofia e Vanessa");
        vendedor.setSalario(500*2.5);
        vendedor.setValor( (500*2.5)* 7);
        vendedor.mostrar();
        
    Funcionario empresa = new Funcionario();    
        System.out.println("\nA empresa possui no total 10 Funcionários");
        System.out.println("GASTOS COM SALÁRIO POR SETOR:");
        empresa.setSetor(500);
        empresa.setSetor2((int) ((500*1.5)* 2));
        empresa.setSetor3((int) ((500*2.5)* 7));
        empresa.mostrando();
        System.out.println("\nGASTO TOTAL COM SALÁRIO:");
        empresa.setSalario(10750);
        empresa.setValor(500 + ((500*1.5)* 2) + (500*2.5)* 7);
        empresa.setNome("\nDouglas\nSaul\nThales\nJose\njoao\njaqueline\nSabrina\nSamanta\nSofia\nVanessa");
        empresa.mostrar();
        
        
    
    
    
       
        
        
        
        
    }
    
}
