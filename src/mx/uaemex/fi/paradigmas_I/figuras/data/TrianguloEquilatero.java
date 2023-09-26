package mx.uaemex.fi.paradigmas_I.figuras.data;

public class TrianguloEquilatero extends FiguraDeLadosIguales {
    public TrianguloEquilatero(double lado) {
        super(lado, 3);
    }

    public TrianguloEquilatero() {
        super(0, 3);
    }

    @Override
    public double area() {
        return (Math.cos(Math.toRadians(30)) * Math.pow(this.lado, 2)) / 2;
    }
}
