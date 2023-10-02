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
    private JSpinner anchoSpinner;
    private JSpinner largoSpinner;

    public PanelRectanguloData() {
        this.setLayout(new GridLayout(2, 2));

        JLabel ancho = new JLabel("Ancho:");
        JLabel largo = new JLabel("Largo:");

        anchoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));
        largoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));

        this.add(ancho);
        this.add(anchoSpinner);
        this.add(largo);
        this.add(largoSpinner);
    }

    @Override
    public void setData() {
    }
}