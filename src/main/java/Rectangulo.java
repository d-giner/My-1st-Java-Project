public class Rectangulo extends Figura{

    public Rectangulo(){
        super();
        setNombre("Rectángulo");
    }

    public void calcularArea(double l1, double l2 ){
        setArea(l1*l2);
    }

    public void decirArea() {
        System.out.println("El area del " + nombre + " es: " + area);
    }
}
