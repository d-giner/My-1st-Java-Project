public abstract class Figura {

    public Figura() {
    }

    public double area;
    public String nombre;

    public void setArea(double a) {
        this.area = a;
    }

    public void setNombre(String n) {
        nombre = n;
    }
    public void calcularArea(double ancho, double alto){}

    public void calcularAreaCirculo(double radio){}

    public abstract void decirArea();
}
