package EXC01;

//1. Criando Getters e Setters Simples
//1. Criar uma classe "Pessoa" com os atributos private nome e private idade.
//o Criar métodos getNome() e setNome(String nome).
//o Criar métodos getIdade() e setIdade(int idade).
//o No main, criar um objeto, definir os valores e exibir com os getters.

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Daniel", 20);
        System.out.println("Nome: " + p1.getPessoa());
        System.out.println("Idade: " + p1.getIdade());
    }
}
