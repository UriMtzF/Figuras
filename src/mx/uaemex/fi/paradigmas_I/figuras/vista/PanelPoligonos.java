package mx.uaemex.fi.paradigmas_I.figuras.vista;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.GridLayout;

public class PanelPoligonos extends PanelDeFigura {
    private JSpinner ladoSpinner;
    private JSpinner apotemaSpinner;

    public PanelPoligonos() {
        super();

        // tamaño del panel con un GridLayout
        setLayout(new GridLayout(2, 2));

        // etiquetas para "Lado" y "Apotema"
        JLabel ladoLabel = new JLabel("Lado:");
        JLabel apotemaLabel = new JLabel("Apotema:");

        // se crea JSpinners para ingresar el lado y el apotema
        ladoSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, Double.MAX_VALUE, 0.1));
        apotemaSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, Double.MAX_VALUE, 0.1));

        // Agrega los componentes al panel
        add(ladoLabel);
        add(ladoSpinner);
        add(apotemaLabel);
        add(apotemaSpinner);
    }

    @Override
    public void setData() {
        // se obtienen los valores del lado y el apotema desde los JSpinners
        double lado = (double) ladoSpinner.getValue();
        double apotema = (double) apotemaSpinner.getValue();

        // crea una instancia de Figura con los datos ingresados
        f = new Figura(lado, apotema);
    }
}
