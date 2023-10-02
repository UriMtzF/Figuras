package mx.uaemex.fi.paradigmas_I.figuras.vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaData extends JFrame implements ActionListener {
    protected PanelDeFigura panelData;
    private JButton bGuardar;

    public VentanaData(JPanel pData, String figura) throws HeadlessException {
        super(figura.substring(0,1).toUpperCase() + figura.substring(1));
        this.setLayout(new GridLayout(3,1));

        JLabel lImagen = new JLabel(getImage(figura));
        lImagen.setHorizontalAlignment(JLabel.CENTER);
        lImagen.setVerticalAlignment(JLabel.CENTER);

        this.bGuardar = new JButton("Guardar datos");
        this.bGuardar.addActionListener(this);

        this.add(lImagen);
        this.add(pData);
        this.add(this.bGuardar);

        this.setSize(200,300);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        //TODO: Implementar funcion boton Guardar datos
    }
    private ImageIcon getImage(String figura){
        String[] figurasDisponibles = {"triangulo","cuadrado","rectangulo","pentagono","hexagono",
        "heptagono","octagono","nonagono","circulo"};

        boolean esFiguraValida = false;

        for (String f:figurasDisponibles){
            if (f.equals(figura)) {
                esFiguraValida = true;
                break;
            }
        }

        ImageIcon iconoOriginal;

        if (esFiguraValida){
            iconoOriginal = new ImageIcon("res/"+figura+".png");
        }else {
            iconoOriginal = new ImageIcon("res/default.png");
        }

        Image imagenOriginal = iconoOriginal.getImage();
        Image imagenRedimensionada = imagenOriginal.getScaledInstance(100,100,Image.SCALE_SMOOTH);

        return new ImageIcon(imagenRedimensionada);
    }
}
