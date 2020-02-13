package exercicio01;

public class Pessoa {
    public String nome;
    public int idade;
    public String sobrenome;

    public Pessoa(String nome, int idade, String sobrenome) {
        this.nome = nome;
        this.idade = idade;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void falarNome() {
        System.out.println("Meu nome é: " + this.nome);
    }

    public void falarSobrenome() {
        System.out.println("Meu Sobrenome é: " + this.sobrenome);

    }

    public void falarIdade() {
        System.out.println("Minha idade é :" + this.idade);
    }

}
