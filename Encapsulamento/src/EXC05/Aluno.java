package EXC05;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public void exibirDados(){
        System.out.println("Aluno: " + getNome());
        System.out.println("Nota1: " + getNota1());
        System.out.println("Nota2: " + getNota2());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0 || nota1 > 10){
            System.out.println("Nota inválida!!! Apenas notas de 1 a 10 podem ser inseridas!!!");
        } else{
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 < 0 || 10 > nota2){
            System.out.println("Nota inválida!!! Apenas notas de 1 a 10 podem ser inseridas!!!");
        }else{
            this.nota2 = nota2;
        }
    }
}
