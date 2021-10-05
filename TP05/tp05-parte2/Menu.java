import java.util.Scanner;


class Menu{
    private Pessoa pessoa = new Pessoa();
    private Cliente cliente = new Cliente();
    private Endereco end = new Endereco();
    private Gerente gerente = new Gerente();
    private Funcionario_CAIXA funC = new Funcionario_CAIXA();
    private Fun_Instrutor funI = new Fun_Instrutor();
    Scanner input = new Scanner(System.in);

    //Menu de interação com o usuário
    public boolean menuEscolha(){
        //menu 1
        int cadastrado = 0;
        System.out.println("Deseja cadastrar:\n1-Novo Cliente 2-Novo Funcionário\n3-Mostrar registros dos clientes e funcionários");
        cadastrado = input.nextInt();
        //Cadatro de novos clientes
        while(cadastrado == 1){
            System.out.println("Digite o nome do novo cliente ");
            String nome_cliente = input.next();
            System.out.println("Digite o cpf do novo cliente ");
            String cpf_cliente = input.next();
            System.out.println("Cadastre a medida do braco esquerdo de "+ nome_cliente);
            double bracoMedidaEsq = input.nextInt();
            System.out.println("Cadastre a medida do braco direito de "+ nome_cliente);
            double bracoMedidaDir = input.nextInt();
            System.out.println("Cadastre a medida da coxa esquerda de "+ nome_cliente);
            double coxaMedidaEsq = input.nextInt();
            System.out.println("Cadastre a medida da coxa direita de "+ nome_cliente);
            double coxaMedidaDir = input.nextInt();
            System.out.println("Cadastre a medida da cintura de "+ nome_cliente);
            double cinturaMedida = input.nextInt();
            System.out.println("Cadastre o peso de "+ nome_cliente);
            double peso = input.nextInt();
                       
            int codigo_cliente = cliente.getCodigo();
            end.adicionarCliente(nome_cliente, cpf_cliente, bracoMedidaEsq, bracoMedidaDir, coxaMedidaEsq, coxaMedidaDir, cinturaMedida, peso);
            System.out.println("Cadastro realizado com sucesso!!!");
            System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais clientes.");
            int mais_cadastros = input.nextInt();
            if(mais_cadastros == 1)
                menuEscolha();
            else 
                cadastrado = 1;
        }
        //cadastro de novos funcionários
        while(cadastrado == 2){
            System.out.println("Cadastrar novo:\n1-Gerente   2-Caixa\n3-Instrutor    4-Limpeza");
            int novo_funcionario = input.nextInt();
            if(novo_funcionario == 1){
                System.out.println("Digite o nome do novo Gerente ");
                String nome_gerente = input.next();
                System.out.println("Digite o cpf do novo Gerente ");
                String cpf_gerente = input.next();
                int codigo_gerente = gerente.getCodigo();
                end.adicionarGerente(nome_gerente, cpf_gerente, codigo_gerente);
                System.out.println("Cadastro realizado com sucesso!!!");
                System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais gerentes.");
                int mais_cadastros = input.nextInt();
                if(mais_cadastros == 1)
                    menuEscolha();
                else 
                    novo_funcionario = 1;

            }else if(novo_funcionario == 2){
                System.out.println("Digite o nome do novo caixa ");
                String nome_caixa = input.next();
                System.out.println("Digite o cpf do novo caixa ");
                String cpf_caixa = input.next();
                int codigo_caixa = funC.getCodigo();
                end.adicionarCaixa(nome_caixa, cpf_caixa, codigo_caixa);
                System.out.println("Cadastro realizado com sucesso!!!");
                System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais Caixas.");
                int mais_cadastros = input.nextInt();
                if(mais_cadastros == 1)
                    menuEscolha();
                else 
                    novo_funcionario = 2;
            }else if(novo_funcionario == 3){
                System.out.println("Digite o nome do novo Instrutor ");
                String nome_instrutor = input.next();
                System.out.println("Digite o cpf do novo Instrutor ");
                String cpf_instrutor = input.next();
                int codigo_instrutor = funI.getCodigo() + 1;
                end.adicionarCaixa(nome_instrutor, cpf_instrutor, codigo_instrutor);
                System.out.println("Cadastro realizado com sucesso!!!");
                System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais instrutores.");
                int mais_cadastros = input.nextInt();
                if(mais_cadastros == 1)
                    menuEscolha();
                else 
                    novo_funcionario = 3;

            }else if(novo_funcionario == 4){
                System.out.println("Digite o nome do novo zelador ");
                String nome_zelador= input.next();
                System.out.println("Digite o cpf do novo zelador ");
                String cpf_zelador = input.next();
                int codigo_zelador = funI.getCodigo() + 1;
                end.adicionarLimpeza(nome_zelador, cpf_zelador, codigo_zelador);
                System.out.println("Cadastro realizado com sucesso!!!");
                System.out.println("Digite 1-Voltar ao menu  2-Cadastrar mais zeladores.");
                int mais_cadastros = input.nextInt();
                if(mais_cadastros == 1)
                    menuEscolha();
                else 
                    novo_funcionario = 4;

            }
        }
        //Mostrar todos os clientes e funcionarios, requer senha de acesso - 1234
        while(cadastrado == 3){
            System.out.println("Digite a senha de acesso");
            int senha_acesso = input.nextInt();
            if(pessoa.autentica(senha_acesso)){
                System.out.println("Acesso autorizado");
                System.out.println("Acessar informações: 1-Clientes     2-Funcionários ");
                int acesso = input.nextInt();
                if(acesso == 1){
                    end.mostrarCliente();
                    System.out.println("1-Voltar ao menu");
                    int voltar = input.nextInt();
                    if(voltar == 1)
                        menuEscolha();
                }else{
                    System.out.println("1-Gerentes  2-Caixas\n3-Instrutores  4-Limpeza");
                    int acesso_func = input.nextInt();
                    if(acesso_func == 1){
                        if(end.mostrarGerente())
                            end.mostrarGerente();
                        else 
                            System.out.println("Lista VAZIA!!!");
                            menuEscolha();
                    
                    }else if(acesso_func == 2){
                        if(end.mostrarCaixa())
                            end.mostrarCaixa();
                        else
                            System.out.println("Lista VAZIA!!!");
                            menuEscolha();
                        
                    }else if(acesso_func == 3){
                        if(end.mostrarInstrutor())
                            end.mostrarInstrutor();
                        else 
                            System.out.println("Lista VAZIA!!!");
                            menuEscolha();

                    }else if(acesso_func == 4){
                        end.mostrarLimpeza();
                        menuEscolha();
                    }
                }
            }else{
                System.out.println("ACESSO NEGADO!!!");
                menuEscolha();
            }
        }
        return false;
    }


}