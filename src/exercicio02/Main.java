package exercicio02;

public class Main {

    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(12, 42);
        Triangulo t2 = new Triangulo(25, 88);
        Triangulo t3 = new Triangulo(8, 3);
        t1.area();
        t2.area();
        t3.area();

        System.out.println("A area do triangulo t1 é : " + t1.area());
        System.out.println("A area do triangulo t2 é : " + t2.area());
        System.out.println("A area d otriangulo t3 é : " + t3.area());

    }
}

// neste exercicio tive dificuldade em aonde iria chamar o metodo no sout no main,
// e confusao de int com double acabei de enrolando um pouco porem eu
// fui testando muitos metodos ate conseguir sozinho
