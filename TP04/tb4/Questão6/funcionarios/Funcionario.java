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
public class Funcionario {
    protected String nome;
    protected String universidade;
    protected String escola;
    protected int codigoFuncional;
    protected int salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void salario(int salario){
        salario = 500;
    }
    
    public void mostrar(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Universidade: " + this.universidade);
    System.out.println("Escola: " + this.escola);
    System.out.println("Código Funcional: " + this.codigoFuncional);
    System.out.println("Salário: " + this.salario);
    }
}
