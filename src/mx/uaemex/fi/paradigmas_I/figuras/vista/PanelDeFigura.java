package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.Figura;

import javax.swing.*;

public abstract class PanelDeFigura extends JPanel {
    protected Figura f;

    public PanelDeFigura() {
    }

    public Figura getF() {
        return f;
    }

    public abstract void setData();
}
