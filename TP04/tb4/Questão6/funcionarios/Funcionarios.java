/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author 55889
 */
public class Funcionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Funcionario sem estudo
        Funcionario FuncSemEstudo = new Funcionario();
        FuncSemEstudo.setNome("José");
        FuncSemEstudo.setCodigoFuncional(364731);
        FuncSemEstudo.setSalario(500);
        FuncSemEstudo.mostrar();
        
        System.out.println("\n");
        //Funcionario Com ensino basico
        Funcionario FuncBasico = new Funcionario();
        FuncBasico.setEscola("Uniao dos 9 poderes - Ensino Básico");
        FuncBasico.setSalario((int) (500*10));
        FuncBasico.mostrar();
        
        System.out.println("\n");
        //Funcionario Com ensino medio
        Funcionario FuncMedio = new Funcionario();
        FuncMedio.setEscola("Amor de Deus - Ensino Médio");
        FuncMedio.setSalario((int) (500*50));
        FuncMedio.mostrar();
        
        System.out.println("\n");
        //Funcionario Com ensino superior
        Funcionario FuncSuperior = new Funcionario();
        FuncSuperior.setUniversidade("Universidade Federal do Ceará");
        FuncSuperior.setSalario((int) (500*100));
        FuncSuperior.mostrar();
        
        
        
    }
    
}
