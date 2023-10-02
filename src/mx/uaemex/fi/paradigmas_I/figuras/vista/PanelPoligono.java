package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.PoligonoRegular;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelPoligono extends PanelDeFigura {
    private JSpinner ladoSpinner;
    private JSpinner apotemaSpinner;
    public PanelPoligono() {
        // tamaño del panel con un GridLayout
        this.setLayout(new GridLayout(2, 2));

        // etiquetas para "Lado" y "Apotema"
        JLabel ladoLabel = new JLabel("Lado:");
        JLabel apotemaLabel = new JLabel("Apotema:");

        // se crea JSpinners para ingresar el lado y el apotema
        ladoSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
        apotemaSpinner = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));

        // Agrega los componentes al panel
        this.add(ladoLabel);
        this.add(ladoSpinner);
        this.add(apotemaLabel);
        this.add(apotemaSpinner);
    }
    @Override
    public void setData() {
    }
}
