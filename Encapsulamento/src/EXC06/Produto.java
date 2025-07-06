package EXC06;

public class Produto {
    private String nome;
    private double preco;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDados(){
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preço do produto: R$" + getPreco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        if (preco < 0){
            System.out.println("ERRO: O preço do produto não pode ser negativo, digite outro valor!!!");
        }else {
            return preco;
        }
        return 0;
    }

    public double setPreco(double preco) {
        if (preco < 0){
            System.out.println("ERRO: O preço do produto não pode ser negativo, digite outro valor!!!");
        }else {
            this.preco = preco;
        }
        return 0;
    }
}
