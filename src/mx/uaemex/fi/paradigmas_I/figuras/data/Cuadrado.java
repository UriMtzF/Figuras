package mx.uaemex.fi.paradigmas_I.figuras.data;

public class Cuadrado extends FiguraDeLadosIguales {
    public Cuadrado(double lado) {
        super(lado, 4);
    }

    public Cuadrado() {
        super(0, 4);
    }

    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }
}
