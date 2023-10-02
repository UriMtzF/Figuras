package mx.uaemex.fi.paradigmas_I.figuras.data;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double perimetro() {
        return Math.PI * this.radio * 2;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
