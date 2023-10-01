package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.Figura;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class PanelCirculoData extends PanelDeFigura{

    private JSpinner radio;

    public PanelCirculoData(){
        super();

        JLabel etqRadio;
        SpinnerModel modelo;
        JButton btnGD;

        setLayout(new GridLayout(3,1));

        modelo = new SpinnerNumberModel(0,0,1000,1);

        etqRadio = new JLabel("Radio: ");
        radio= new JSpinner();
        radio.setModel(modelo);
        btnGD = new JButton("Guarda datos");

        add(etqRadio);
        add(radio);
        add(btnGD);

        setBorder(new EmptyBorder(10,10,10,10));



    }

    @java.lang.Override
    public void setData() {

            }
        }


