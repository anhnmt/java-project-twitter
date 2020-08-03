/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author XDORRO
 */
public class Menus {
    private String kind;
    private JPanel panel;
    private JLabel label;

    public Menus(String kind, JPanel panel, JLabel label) {
        this.kind = kind;
        this.panel = panel;
        this.label = label;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getLabel() {
        return label;
    }

    public void setLabel(JLabel label) {
        this.label = label;
    }
}
