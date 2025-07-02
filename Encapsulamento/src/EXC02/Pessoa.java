package EXC02;

import java.util.Scanner;

public class Pessoa {
    private String pessoa;
    private int idade;

    public Pessoa(Scanner scanner) {
        System.out.println("Informe um nome: ");
        this.pessoa = scanner.nextLine();

        System.out.println("Informe uma idade: ");
        int idadeInfo = scanner.nextInt();
        scanner.nextLine();
        setIdade(idadeInfo);
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
       if (idade > 0 ){
          this.idade = idade;
       } else {
           System.out.println("A idade deve ser maior ou igual a zero!!!");
       }
    }
}
