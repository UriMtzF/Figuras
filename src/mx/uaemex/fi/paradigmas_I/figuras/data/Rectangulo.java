package mx.uaemex.fi.paradigmas_I.figuras.data;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return (this.base * 2) + (this.altura * 2);
    }

    @Override
    public double area() {
        return this.base * this.altura;
    }
}
