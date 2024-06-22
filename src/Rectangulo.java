public class Rectangulo implements FiguraGeometrica {
    private String nombre;
    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return longitud * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String getNombre() {
        return nombre; // Aquí debes retornar el nombre del rectángulo
    }

    @Override
    public String toString() {
        return "Rectangulo [nombre=" + nombre + ", longitud=" + longitud + ", ancho=" + ancho + "]";
    }
}