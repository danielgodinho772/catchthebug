package EXC09;

//9. Criando um Controle de Acesso
//9. Criar uma classe "Usuario" com os atributos nome e senha, ambos privados.
//o Criar um metodo setSenha(String senha), garantindo que a senha tenha pelo menos 8
//caracteres.

public class Main {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Daniel", "senha1234");
        user1.exibirDados();
        System.out.println("--------------------------------------------");
        user1.setSenha("12345");
        user1.exibirDados();
    }
}
