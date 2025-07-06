package EXC07;

public class Livro{
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void emprestar(){
        disponivel = false;
    }

    public void devolver(){
        disponivel = true;
    }

    public void getDisponivel(){
        System.out.println("Livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        if (disponivel == true){
            System.out.println("Disponibilidade: O livro está disponível!!!");
        } else{
            System.out.println("Disponibilidade: O livro está indisponível!!!");
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
