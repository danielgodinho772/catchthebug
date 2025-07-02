package EXC03;

//3. Criando uma Classe com Saldo Protegido
//3. Criar uma classe "ContaBancaria" com os atributos titular, saldo e numeroConta, todos privados.
//o Criar um metodo depositar(double valor), que só aceita valores positivos.
//o Criar um metodo sacar(double valor), que só permite saques se houver saldo suficiente.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(scanner);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Conta: " + conta.getNumeroConta());

        int opcao = 0;

        do {
            System.out.println("------------------------------");
            System.out.println("1. Depositar valor.");
            System.out.println("2. Sacar valor.");
            System.out.println("3. Sair.");
            System.out.println("------------------------------");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    conta.depositarValor(scanner);
                    break;

                case 2:
                    conta.sacarValor(scanner);
                    break;

                case 3:
                    System.out.println("Saindo....");
                    break;

                default:
                    System.out.println("Opção inválida!!!");
            }

        }while (opcao != 3);
    }
}
