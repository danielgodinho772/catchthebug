package EXC04;

public class Funcionarios {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionarios(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: R$" + getSalario());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            System.out.println("O salário não pode ser negativo, o valor continuará o mesmo até que seja inserido um valor válido!!!");
        }else{
            this.salario = salario;
        }
    }
}
