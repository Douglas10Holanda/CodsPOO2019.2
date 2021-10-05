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
    
        int funcionarios[] = {4,4,2};
         
    for(int i=0;i<funcionarios.length;i++){
        System.out.println("Na empresa temos:  " + funcionarios[i] + " funcionários");
    }
    
    Funcionario FuncEnsBasico = new Funcionario();
    
        System.out.println("\n40% dos funcionários possuem Ensino Básico = 4 FUNCIONÁRIOS");
        FuncEnsBasico.setSalario(500);
        FuncEnsBasico.setValor(500 * 4);
        FuncEnsBasico.mostrar();
    
    Funcionario FuncEnsMedio = new Funcionario();
    
        System.out.println("\n40% dos funcionários possuem Ensino Médio = 4 FUNCIONÁRIOS");
        FuncEnsBasico.setSalario(500*1.5);
        FuncEnsBasico.setValor( (500*1.5)* 4);
        FuncEnsBasico.mostrar();
       
    Funcionario FuncEnsSuperior= new Funcionario();
    
        System.out.println("\n20% dos funcionários possuem Ensino Superior = 2 FUNCIONÁRIOS");
        FuncEnsBasico.setSalario(500*2.5);
        FuncEnsBasico.setValor( (500*2.5)* 2);
        FuncEnsBasico.mostrar();
        
    Funcionario empresa = new Funcionario();    
        System.out.println("\nA empresa possui no total 10 Funcionários");
        System.out.println("GASTOS COM SALÁRIO POR SETOR:");
        empresa.setSetor(2000);
        empresa.setSetor2(3000);
        empresa.setSetor3(2500);
        empresa.mostrando();
        System.out.println("\nGASTO TOTAL COM SALÁRIO:");
        empresa.setSalario(7500);
        empresa.setValor((500 * 4) + ((500*1.5)* 4) + (500*2.5)* 2);
        empresa.mostrar();
        
        
    
    
    
       
        
        
        
        
    }
    
}
