package mx.uaemex.fi.paradigmas_I.figuras.vista;

import javax.swing.*;
import java.awt.*;

public class PanelCirculoData extends PanelDeFigura {

    private JSpinner radio;

    public PanelCirculoData() {

        JLabel etqRadio;
        SpinnerModel modelo;

        setLayout(new GridLayout(1, 2));

        modelo = new SpinnerNumberModel(0, 0, 1000, 1);

        etqRadio = new JLabel("Radio: ");
        radio = new JSpinner();
        radio.setModel(modelo);

        add(etqRadio);
        add(radio);

    }

    @Override
    public void setData() {

    }
}


