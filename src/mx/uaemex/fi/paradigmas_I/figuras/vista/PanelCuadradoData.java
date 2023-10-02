/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri

La clase fue hecha por:
Márquez López María Fernanda
 */

package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.Cuadrado;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelCuadradoData extends PanelDeFigura {
    private JSpinner ladoSpinner;

    public PanelCuadradoData() {
        this.setLayout(new GridLayout(1, 2));

        JLabel lado = new JLabel("Lado:");

        ladoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));

        this.add(lado);
        this.add(ladoSpinner);
    }

    @Override
    public void setData() {
    }
}