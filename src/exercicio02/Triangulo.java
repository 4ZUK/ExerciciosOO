package exercicio02;
public class Triangulo {
    public int base;
    public int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double area(){
        double resultado = (this.base * this.altura)/2;
        System.out.println(resultado);
        return resultado;
    }

}