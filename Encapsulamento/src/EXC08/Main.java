package EXC08;

//8. Controlando um Termostato
//8. Criar uma classe "Termostato" com os atributos temperaturaAtual e temperaturaDesejada, ambos
//privados.
//o Criar getters e setters, gara

public class Main {
    public static void main(String[] args) {
        Termostato temperatura = new Termostato(20, 30);
        temperatura.exibirTemperatura();
        System.out.println("---------------------------------");
        temperatura.setTemperaturaDesejada(35);
        temperatura.exibirTemperatura();
    }
}
