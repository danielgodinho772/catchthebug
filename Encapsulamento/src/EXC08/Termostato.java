package EXC08;

public class Termostato {
    private int temperaturaAtual;
    private int temperaturaDesejada;

    public Termostato(int temperaturaAtual, int temperaturaDesejada) {
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada;
    }

    public void exibirTemperatura(){
        System.out.println("A temperatura atual é de: " + getTemperaturaAtual() + "°C");
        System.out.println("A temperatura desejada é de: " + getTemperaturaDesejada() + "°C");
    }

    public int getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(int temperaturaAtual) {
        if(temperaturaAtual > 30 || temperaturaAtual < 15){
            System.out.println("Limite de temperatura atingido!!!");
        }else {
            this.temperaturaAtual = temperaturaAtual;
        }
    }

    public int getTemperaturaDesejada() {
        return temperaturaDesejada;
    }

    public void setTemperaturaDesejada(int temperaturaDesejada) {
        if (temperaturaDesejada > 30 || temperaturaDesejada < 15){
            System.out.println("Limite de temperatura atingido!!!");
        } else {
            this.temperaturaDesejada = temperaturaDesejada;
        }
    }
}
