package EXC10;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual = 0;
    }

    public void exibirDados(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Velocidade: " + getVelocidadeAtual());
    }

    public void acelerar(int incremento){
        if(velocidadeAtual + incremento > 180){
            velocidadeAtual = 180;
            System.out.println("Velocidade Máxima atingida");
        } else {
            velocidadeAtual += incremento;
            System.out.println("Acelerando....");
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void desacelerar(int decremento){
        if (velocidadeAtual - decremento < 0){
            velocidadeAtual = 0;
            System.out.println("Carro parado!");
        } else {
            velocidadeAtual -= decremento;
            System.out.println("Freando....");
            System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        }

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
