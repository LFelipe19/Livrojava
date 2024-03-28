package Model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel == true) {
            disponivel = false;
        } else {
            System.out.println("Livro Emprestado");
        }

    }

    public void devolver() {
        if (disponivel == false) {
            disponivel = true;
        } else {
            System.out.println("Livro Devolvido");
        }
    }

    public String getLivro() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Titulo do livro: " + titulo + "\n" + "Autor: " + autor + "\n" + "disponivel: " + disponivel + "\n";
    }
}
