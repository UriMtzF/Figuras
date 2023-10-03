/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri

La clase fue hecha por:
Márquez López María Fernanda
 */

package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.Rectangulo;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelRectanguloData extends PanelDeFigura {
    private JSpinner baseSpinner;
    private JSpinner altura;

    public PanelRectanguloData() {
        this.setLayout(new GridLayout(2, 2));

        JLabel ancho = new JLabel("Base:");
        JLabel largo = new JLabel("Largo:");

        baseSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));
        altura = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));

        this.add(ancho);
        this.add(baseSpinner);
        this.add(largo);
        this.add(altura);
    }

    @Override
    public void setData() {
        double base = (double) this.baseSpinner.getValue();
        double altura = (double) this.altura.getValue();

        this.f = new Rectangulo(base,altura);
    }
}