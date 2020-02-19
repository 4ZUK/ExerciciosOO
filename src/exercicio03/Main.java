package exercicio03;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Narizinho","Anastacia",12);

        livro1.titulo = "um pescador de aluguel";
    }

}

// titulo esta setado como privado na classe pai Livro o que nao da para atribuilo uma troca de nome