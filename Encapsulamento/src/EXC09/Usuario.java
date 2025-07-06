package EXC09;

public class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Senha: " + getSenha());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha.length() < 8){
            System.out.println("A senha deve conter no mínimo 8 caracteres!!!");
        }else {
            System.out.println("Senha alterada com sucesso!!!");
            this.senha = senha;
        }
    }
}
