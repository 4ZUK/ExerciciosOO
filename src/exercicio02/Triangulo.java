package exercicio02;

public class Triangulo {
    public double base;
    public double altura;
    public double area;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double area() {
       this.altura=altura;
       this.base=base;
       return (base*altura) / 2;
    }



}
