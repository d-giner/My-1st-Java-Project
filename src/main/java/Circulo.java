public class Circulo extends Figura{

    public Circulo(){
        super();
        setNombre("Círculo");
    }

    private double pi = 3.14;

    public void calcularAreaCirculo(double r){
        setArea(pi*(r*r));
        //return area;
    }

    public void decirArea() {
        System.out.println("El area del" + nombre + "es: " + area);
    }
}
