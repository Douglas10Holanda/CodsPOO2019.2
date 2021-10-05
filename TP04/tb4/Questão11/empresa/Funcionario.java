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
public class Funcionario {
    String nome;
    protected double salario;
    protected double valor;
    protected int setor;
    protected int setor2;
    protected int setor3;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSetor() {
        return setor;
    }

    public void setSetor(int setor) {
        this.setor = setor;
    }

    public int getSetor2() {
        return setor2;
    }

    public void setSetor2(int setor2) {
        this.setor2 = setor2;
    }

    public int getSetor3() {
        return setor3;
    }

    public void setSetor3(int setor3) {
        this.setor3 = setor3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void mostrar(){
    System.out.println("Salário: " + this.salario);
    System.out.println("O valor total do Salário é: " + this.valor);
    System.out.println("nome do funcionario: " + this.nome);
    }

     public void mostrando(){
    System.out.println("Salário por setor Básico: " + this.setor);
    System.out.println("Salário por setor Médio: " + this.setor2);
    System.out.println("Salário por setor Superior: " + this.setor3);
    
    }
  
}
