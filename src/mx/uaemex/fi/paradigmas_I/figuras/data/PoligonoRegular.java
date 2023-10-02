/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri
 */

package mx.uaemex.fi.paradigmas_I.figuras.data;

public class PoligonoRegular extends FiguraDeLadosIguales {
    private double apotema;

    public PoligonoRegular(double lado, double apotema, int numeroLados) {
        super(lado, numeroLados);
        this.apotema = apotema;
    }

    @Override
    public double area() {
        return this.perimetro() * this.apotema / 2;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
}
