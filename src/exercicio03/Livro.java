package exercicio03;


public class Livro {

    String titulo;
    String autor;
    int numeroDePaginas;

    public void Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = "Memorias postumas de bras cubas";
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }
}
    //    public void livroMemorias(String titulo, String autor, int numeroDePaginas) {
//        this.titulo = "Memorias postumas de bras cubas";
//        this.autor = "Machado de Assis";
//        this.numeroDePaginas = 400;
//        return titulo,autor,numeroDePaginas;
//    }
//}

//Estou com duvida se a questao pede o erro e fiquei em duvida se no construtor
//tenho que deixar padrao ou altear como coloquei ali acima, sendo que
//colocando o construtor padrao sem alteraçao eu teria que alterar no main
// para este modo abaixo

//    public Livro(String titulo, String autor, int numeroDePaginas) {
//        this.titulo = "Memorias postumas de bras cubas";
//        this.autor = "Machado de Assis";
//        this.numeroDePaginas = 400;
//    }
