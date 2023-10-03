/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri

La clase fue hecha por:
Hernandez Meza Victor Yahir
 */

package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.PoligonoRegular;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelPoligono extends PanelDeFigura {
    private JSpinner ladoSpinner;
    private JSpinner apotemaSpinner;
    private int numLados;
    public PanelPoligono(int numLados) {
        this.numLados = numLados;
        // tamaño del panel con un GridLayout
        this.setLayout(new GridLayout(2, 2));

        // etiquetas para "Lado" y "Apotema"
        JLabel ladoLabel = new JLabel("Lado:");
        JLabel apotemaLabel = new JLabel("Apotema:");

        // se crea JSpinners para ingresar el lado y el apotema
        ladoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));
        apotemaSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0, 100, 1));

        // Agrega los componentes al panel
        this.add(ladoLabel);
        this.add(ladoSpinner);
        this.add(apotemaLabel);
        this.add(apotemaSpinner);
    }
    @Override
    public void setData() {
        double lado = (double) ladoSpinner.getValue();
        double apotema = (double) apotemaSpinner.getValue();

        this.f = new PoligonoRegular(lado,apotema,this.numLados);
    }
}
