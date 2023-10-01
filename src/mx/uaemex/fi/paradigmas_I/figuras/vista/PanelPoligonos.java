package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.PoligonoRegular;

import javax.swing.*;
import java.awt.GridLayout;

public class PanelPoligonos extends PanelDeFigura {
    public PanelPoligonos() {
        JSpinner ladoSpinner;
        JSpinner apotemaSpinner;

        // tamaño del panel con un GridLayout
        this.setLayout(new GridLayout(2, 2));

        // etiquetas para "Lado" y "Apotema"
        JLabel ladoLabel = new JLabel("Lado:");
        JLabel apotemaLabel = new JLabel("Apotema:");

        // se crea JSpinners para ingresar el lado y el apotema
        ladoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, Double.MAX_VALUE, 0.1));
        apotemaSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, Double.MAX_VALUE, 0.1));

        // Agrega los componentes al panel
        this.add(ladoLabel);
        this.add(ladoSpinner);
        this.add(apotemaLabel);
        this.add(apotemaSpinner);
    }
    @Override
    public void setData() {
        // se obtienen los valores del lado y el apotema desde los JSpinners
        double lado = (double) ladoSpinner.getValue();
        double apotema = (double) apotemaSpinner.getValue();

        // crea una instancia de Figura con los datos ingresados
        f = new PoligonoRegular(lado, apotema, numeroLados);
    }
}
