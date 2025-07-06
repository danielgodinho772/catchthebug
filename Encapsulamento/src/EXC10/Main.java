package EXC10;

//10. Protegendo a Velocidade de um Carro
//10. Criar uma classe "Carro" com os atributos privados marca, modelo e velocidadeAtual.
//o Criar um metodo acelerar(int incremento), que aumenta a velocidade, mas não pode
//ultrapassar 180 km/h.
//o Criar um m

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "Jetta", 0);
        carro.exibirDados();
        System.out.println("----------------------------");
        carro.acelerar(190);
        carro.exibirDados();
        System.out.println("----------------------------");
        carro.desacelerar(190);
        carro.exibirDados();

    }
}
