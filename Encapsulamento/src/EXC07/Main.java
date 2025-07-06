package EXC07;

//7. Criando um Sistema de Biblioteca
//7. Criar uma classe "Livro" com os atributos titulo, autor e disponivel (booleano, privado).
//o Criar um metodo emprestar(), que define disponivel = false.
//o Criar um metodo devolver(), que define disponivel = true.
//o Criar um metodo getDisponivel(), que informa se o livro está disponível ou não.

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Livro1", "Autor");
        livro1.devolver();
        livro1.getDisponivel();
    }
}
