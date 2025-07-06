package EXC05;

//5. Validando Notas de um Aluno
//5. Criar uma classe "Aluno" com os atributos nome, nota1 e nota2, todos privados.
//o Criar métodos getNota1() e setNota1(double nota).
//o Criar métodos getNota2() e setNota2(double nota).
//o O metodo setNotaX() deve garantir que as notas sejam de 0 a 10.

public class Main {
    public static void main(String[] args) {
        Aluno estudante = new Aluno("Daniel", 5.0, 8.0);
        estudante.exibirDados();
        System.out.println("-------------------------------------------------");
        estudante.setNota1(-1);
        estudante.exibirDados();
    }
}
