import java.util.Scanner;

public class Main implements GestorFiguras{
    public static void main(String[] args) {

        Figura T = new Triangulo();
        Figura C = new Circulo();
        Figura R = new Rectangulo();
        Figura U = new Cuadrado();

        Figura[] vectorFiguras = new Figura[10];
        vectorFiguras[0] = T;
        vectorFiguras[1] = C;
        vectorFiguras[2] = R;
        vectorFiguras[3] = U;

        Scanner teclado = new Scanner(System.in);

        double a, b;

        //Triángulo//
        System.out.println("Introduce la base del triángulo");
        a = Double.valueOf(teclado.nextLine());
        System.out.println("Introduce la altura del triángulo");
        b = Double.valueOf(teclado.nextLine());

        T.calcularArea(a, b);

        T.decirArea();

        //Rectángulo//
        System.out.println("Introduce la base del rectángulo");
        a = Double.valueOf(teclado.nextLine());
        System.out.println("Introduce la altura del rectángulo");
        b = Double.valueOf(teclado.nextLine());

        R.calcularArea(a, b);

        R.decirArea();

        //Circulo//
        System.out.println("Introduce el radio del círculo");
        a = Double.valueOf(teclado.nextLine());

        C.calcularAreaCirculo(a);

        C.decirArea();

        //Cuadrado//
        System.out.println("Introduce el lado del cuadrado");
        a = Double.valueOf(teclado.nextLine());
        b = a;

        U.calcularArea(a,b);

        U.decirArea();
    }
}
