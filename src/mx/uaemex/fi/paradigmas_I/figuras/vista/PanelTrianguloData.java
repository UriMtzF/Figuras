/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri

La clase fue hecha por:
Martínez Florez Uri
 */

package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.TrianguloEquilatero;

import javax.swing.*;
import java.awt.*;

public class PanelTrianguloData extends PanelDeFigura {
    private JSpinner sLado;

    public PanelTrianguloData() {
        this.setLayout(new GridLayout(1, 2));
        JLabel lLado = new JLabel("Lado: ");

        this.sLado = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));

        this.add(lLado);
        this.add(this.sLado);
    }

    @Override
    public void setData() {
    }
}
