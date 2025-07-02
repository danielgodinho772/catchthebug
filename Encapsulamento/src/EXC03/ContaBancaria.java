package EXC03;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;
    double valor;

    public ContaBancaria(Scanner scanner) {
        System.out.println("Informe o titular da conta: ");
        this.titular = scanner.nextLine();

        System.out.println("Informe o saldo inicial: R$");
        this.saldo = scanner.nextDouble();

        System.out.println("Informe o número da conta: ");
        this.numeroConta = scanner.nextInt();

        scanner.nextLine();
    }

    public void depositarValor (Scanner scanner){
        if(saldo > 0){
            System.out.println("Qual valor você deseja depositar?: ");
            valor = scanner.nextDouble();
            saldo += valor;
            System.out.println("Valor depositado com sucesso!!!");
        } else {
            System.out.println("Número inválido, digite um número maior que zero!!!");
        }
    }

    public void sacarValor(Scanner scanner){
        if(saldo > 0 && valor <= saldo){
            System.out.println("Qual valor você deseja sacar?: ");
            valor = scanner.nextDouble();
            saldo -= valor;
            System.out.println("Valor sacado com sucesso!!!");
        } else {
            System.out.println("Saque inválido! Verifique o valor e o saldo disponível");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}
