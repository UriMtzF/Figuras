/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri
 */

package mx.uaemex.fi.paradigmas_I.figuras.data;

public abstract class FiguraDeLadosIguales extends Figura {
    protected double lado;
    protected int numeroLados;

    public FiguraDeLadosIguales(double lado, int numeroLados) {
        this.lado = lado;
        this.numeroLados = numeroLados;
    }

    @Override
    public double perimetro() {
        return this.numeroLados * this.lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
