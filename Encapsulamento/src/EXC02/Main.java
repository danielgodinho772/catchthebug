package EXC02;

//2. Encapsulamento com Validação
//2. Modificar a classe "Pessoa" para que setIdade(int idade) só aceite valores maiores que zero.
//o Se um valor inválido for passado, exibir uma mensagem de erro.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(scanner);

        System.out.println("Nome: " + pessoa.getPessoa());
        System.out.println("Idade: " + pessoa.getIdade());

    }
}
