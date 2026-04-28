package banco;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--------------- BEM VINDO AO BANCO ------------------\n");
        System.out.println("1) PARA CRIAR UMA NOVA CONTA");
        System.out.println("2) PARA SACAR");
        System.out.println("3) PARA DEPOSITAR");
        System.out.println("4) PARA VERIFICAR SEU SALDO");


        Conta conta = null;

        int opcao = input.nextInt();
        input.nextLine();
        switch (opcao){
            case 1:
                System.out.println("Digite o seu nome:\n");
                String nome = input.nextLine();

                System.out.println("Digite seu CPF:\n");
                String cpf = input.nextLine();

                System.out.println("Digite o tipo de conta que deseja CC (para conta corrente) CP(para conta poupança");
                String tipodeConta = input.nextLine();
                Cliente cliente = new Cliente(nome, cpf);
                conta = new Conta(cliente, tipodeConta);


                break;
            case 2:

                if(conta !=null){
                    System.out.println("Qual valor deseja sacar?");
                    float saque = input.nextFloat();
                    conta.sacar(saque);
                }else{
                    System.out.println("Nenhuma conta criada ainda!");
                }
                break;
            case 3:
                if (conta != null){
                    System.out.println("Qual valor deseja depositar?");
                    float deposito = input.nextFloat();
                    conta.depositar(deposito);
                }else{
                    System.out.println("Sem conta ");
                }
                break;

                case 4:
                    if(conta != null){
                        System.out.println(conta.getSaldoConta());
                    }
                    else{
                        System.out.println("Sem conta ");
                    }
                    break;

        }


    }
}
