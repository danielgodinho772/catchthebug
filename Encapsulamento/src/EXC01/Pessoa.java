package EXC01;

public class Pessoa {
    private String pessoa;
    private int idade;

    public Pessoa(String pessoa, int idade) {
        this.pessoa = pessoa;
        this.idade = idade;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
