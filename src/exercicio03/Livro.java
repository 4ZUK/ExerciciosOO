package exercicio03;

public class Livro {

    public String autor;
    public String titulo;
    public int numPagina;

    public Livro(String autor, String titulo, int numPagina) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPagina = numPagina;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
}





