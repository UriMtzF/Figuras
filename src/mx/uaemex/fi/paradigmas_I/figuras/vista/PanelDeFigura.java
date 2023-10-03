/*
García Martínez María Fernanda
Márquez López María Fernanda
Hernandez Meza Victor Yahir
Martínez Florez Uri
 */

package mx.uaemex.fi.paradigmas_I.figuras.vista;

import mx.uaemex.fi.paradigmas_I.figuras.data.Figura;

import javax.swing.*;

public abstract class PanelDeFigura extends JPanel {
    protected Figura f;
    public PanelDeFigura() {
    }
    public abstract void setData();
    public Figura getF() {
        return f;
    }
}
