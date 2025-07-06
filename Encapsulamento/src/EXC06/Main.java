package EXC06;

//6. Criando uma Classe "Produto" com Preço Protegido
//6. Criar uma classe "Produto" com os atributos nome e preco, ambos privados.
//o Criar getters e setters, garantindo que preco não pode ser negativo.

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", -5000);
        produto.exibirDados();
        System.out.println("----------------------------------");
        produto.setPreco(5000);
        produto.exibirDados();
        System.out.println("-----------------------------------");
        produto.setPreco(-5500);
        produto.exibirDados();
    }
}
