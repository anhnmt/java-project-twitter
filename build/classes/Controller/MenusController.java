/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Menus;
import Model.Users;
import View.HomeJPanel;
import View.SettingJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author XDORRO
 */
public class MenusController {
    private JFrame This;
    private JPanel root;
    private String kindSelected;
    private Users user;
    private List<Menus> listItem;

    public MenusController(JFrame This, JPanel panelRoot, Users user) {
        this.This = This;
        this.root = panelRoot;
        this.user = user;
        this.listItem = null;
        this.kindSelected = "";
    }

    public void setEvent(String kind, List<Menus> listItem) {
        this.listItem = listItem;
        
        for (Menus item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                kindSelected = kind;
                setMenuIcon(kindSelected, "white", item.getPanel(), item.getLabel());
                root.removeAll();
                root.setLayout(new BorderLayout());
                root.add(new HomeJPanel(user));
                root.validate();
                root.repaint();
            }
            
            item.getPanel().addMouseListener(new LabelEvent(item.getKind(), item.getPanel(), item.getLabel()));
        }
    }

    class LabelEvent implements MouseListener {
        private JPanel node;
        private final String kind;
        private final JPanel panelItem;
        private final JLabel labelItem;

        public LabelEvent(String kind, JPanel panelItem, JLabel labelItem) {
            this.kind = kind;
            this.panelItem = panelItem;
            this.labelItem = labelItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if ("Home".equals(kind)) {
                node = new HomeJPanel(user);
            } else {
                node = new SettingJPanel(This, user);
            }
            
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            setMenuIcon(kind, "white", panelItem, labelItem);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            setMenuIcon(kind, "white", panelItem, labelItem);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                setMenuIcon(kind, "black", panelItem, labelItem);
            }
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

    }

    private void setChangeBackground(String kind) {
        //Nếu click labelHome thì set icon_home
        //Đồng thời labelSetting thì set icon_setting
        //Và ngược lại
        
        for (Menus item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                setMenuIcon(kind, "white", item.getPanel(), item.getLabel());
            } else {
                setMenuIcon(item.getKind(), "black", item.getPanel(), item.getLabel());
            }
        }
    }
    
    private void setMenuIcon(String kind, String color, JPanel panel, JLabel label) {
        if ("white".equals(color) || "black".equals(color)) {
            setMenuColor(color, panel, label);
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/Images/icon_" + kind.toLowerCase() + "_" + color + ".png"
            )));
        }
    }
    
    private void setMenuColor(String color, JPanel panel, JLabel label) {
        if ("white".equals(color)) {
            panel.setBackground(new Color(29,161,242));
            label.setBackground(new Color(29,161,242));
            label.setForeground(Color.white);
        } else {
            panel.setBackground(new Color(255,255,255));
            label.setBackground(new Color(255,255,255));
            label.setForeground(Color.black);
        }
    }

}

