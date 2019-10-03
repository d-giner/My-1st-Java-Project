public class Triangulo extends Figura {

    double base, altura;


    public Triangulo() {
        super();
        setNombre("Triángulo");
    }

    public void calcularArea(double base, double altura) {
        this.altura = altura;
        this.base = base;
        setArea((this.base*this.altura) / 2);
    }

    public void decirArea() {
        System.out.println("El area del " + nombre + " es: " + area);
    }
}
