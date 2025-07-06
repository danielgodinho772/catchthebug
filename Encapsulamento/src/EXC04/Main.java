package EXC04;

//4. Protegendo o Salário de um Funcionário
//4. Criar uma classe "Funcionario" com os atributos privados nome, cargo e salario.
//o Criar métodos getSalario() e setSalario(double salario).
//o Impedir que setSalario(double salario) aceite valores negativos.

public class Main {
    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios("Daniel", "Almoxarife", 5000);
        funcionario1.exibirDados();
        System.out.println("-------------------------------------------------------");
        funcionario1.setSalario(-5000);
        funcionario1.exibirDados();

    }
}
