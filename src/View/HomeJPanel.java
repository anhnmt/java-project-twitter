/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.PostsController;
import Model.Users;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author XDORRO
 */
public final class HomeJPanel extends javax.swing.JPanel {
    private int user_id;
    private PostsController controller;
    
    /**
     * Creates new form HomeJPanel
     * @param user
     */
    public HomeJPanel(Users user) {
        initComponents();
        setFocusable(true);
        
        if (user != null) {
            this.controller = new PostsController(this);
            this.user_id = user.getUser_id();
            String username = user.getUsername();
            boolean gender = user.isGender();

            labelUsername.setText(
                (username.length() <= 24 ? username : username.substring(0, 21) + "...").toUpperCase()
            );

            initMain();
        }
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                scrollPaneAll.getVerticalScrollBar().setValue(0);
            }
        });
    }
    
    private void initMain() {
        try {
            jPanel1.setVisible(false);
            jPanel2.setVisible(false);
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);
            jPanel5.setVisible(false);
            jPanel6.setVisible(false);
            jPanel7.setVisible(false);
            jPanel8.setVisible(false);
            jPanel9.setVisible(false);
            jPanel10.setVisible(false);
            
            List<JPanel> jPanel = new ArrayList<>();
            jPanel.add(jPanel1);
            jPanel.add(jPanel2);
            jPanel.add(jPanel3);
            jPanel.add(jPanel4);
            jPanel.add(jPanel5);
            jPanel.add(jPanel6);
            jPanel.add(jPanel7);
            jPanel.add(jPanel8);
            jPanel.add(jPanel9);
            jPanel.add(jPanel10);
            
            List<JTextArea> txtContent = new ArrayList<>();
            txtContent.add(txtContent1);
            txtContent.add(txtContent2);
            txtContent.add(txtContent3);
            txtContent.add(txtContent4);
            txtContent.add(txtContent5);
            txtContent.add(txtContent6);
            txtContent.add(txtContent7);
            txtContent.add(txtContent8);
            txtContent.add(txtContent9);
            txtContent.add(txtContent10);
            
            List<JLabel> labelLike = new ArrayList<>();
            labelLike.add(labelLike1);
            labelLike.add(labelLike2);
            labelLike.add(labelLike3);
            labelLike.add(labelLike4);
            labelLike.add(labelLike5);
            labelLike.add(labelLike6);
            labelLike.add(labelLike7);
            labelLike.add(labelLike8);
            labelLike.add(labelLike9);
            labelLike.add(labelLike10);
            
            List<JLabel> labelPostAuthor = new ArrayList<>();
            labelPostAuthor.add(labelPostAuthor1);
            labelPostAuthor.add(labelPostAuthor2);
            labelPostAuthor.add(labelPostAuthor3);
            labelPostAuthor.add(labelPostAuthor4);
            labelPostAuthor.add(labelPostAuthor5);
            labelPostAuthor.add(labelPostAuthor6);
            labelPostAuthor.add(labelPostAuthor7);
            labelPostAuthor.add(labelPostAuthor8);
            labelPostAuthor.add(labelPostAuthor9);
            labelPostAuthor.add(labelPostAuthor10);
            
            List<JLabel> labelPostID = new ArrayList<>();
            labelPostID.add(labelPostID1);
            labelPostID.add(labelPostID2);
            labelPostID.add(labelPostID3);
            labelPostID.add(labelPostID4);
            labelPostID.add(labelPostID5);
            labelPostID.add(labelPostID6);
            labelPostID.add(labelPostID7);
            labelPostID.add(labelPostID8);
            labelPostID.add(labelPostID9);
            labelPostID.add(labelPostID10);
            
            List<JLabel> labelPostTime = new ArrayList<>();
            labelPostTime.add(labelPostTime1);
            labelPostTime.add(labelPostTime2);
            labelPostTime.add(labelPostTime3);
            labelPostTime.add(labelPostTime4);
            labelPostTime.add(labelPostTime5);
            labelPostTime.add(labelPostTime6);
            labelPostTime.add(labelPostTime7);
            labelPostTime.add(labelPostTime8);
            labelPostTime.add(labelPostTime9);
            labelPostTime.add(labelPostTime10);
            
            controller.get(user_id, jPanel, txtContent, labelLike, labelPostAuthor, labelPostID, labelPostTime);
        } catch (NoSuchFieldException ex) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPost = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        txtPost = new javax.swing.JTextArea();
        panelUsername = new javax.swing.JPanel();
        labelUsername = new javax.swing.JLabel();
        btnPost = new javax.swing.JButton();
        scrollPaneAll = new javax.swing.JScrollPane();
        panelAll = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelPostAuthor1 = new javax.swing.JLabel();
        labelPostTime1 = new javax.swing.JLabel();
        labelLike1 = new javax.swing.JLabel();
        labelPostID1 = new javax.swing.JLabel();
        txtContent1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        labelPostAuthor2 = new javax.swing.JLabel();
        labelPostTime2 = new javax.swing.JLabel();
        labelLike2 = new javax.swing.JLabel();
        labelPostID2 = new javax.swing.JLabel();
        txtContent2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        labelPostAuthor3 = new javax.swing.JLabel();
        labelPostTime3 = new javax.swing.JLabel();
        labelLike3 = new javax.swing.JLabel();
        labelPostID3 = new javax.swing.JLabel();
        txtContent3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        labelPostAuthor4 = new javax.swing.JLabel();
        labelPostTime4 = new javax.swing.JLabel();
        labelLike4 = new javax.swing.JLabel();
        labelPostID4 = new javax.swing.JLabel();
        txtContent4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        labelPostAuthor5 = new javax.swing.JLabel();
        labelPostTime5 = new javax.swing.JLabel();
        labelLike5 = new javax.swing.JLabel();
        labelPostID5 = new javax.swing.JLabel();
        txtContent5 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        labelPostAuthor6 = new javax.swing.JLabel();
        labelPostTime6 = new javax.swing.JLabel();
        labelLike6 = new javax.swing.JLabel();
        labelPostID6 = new javax.swing.JLabel();
        txtContent6 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        labelPostAuthor7 = new javax.swing.JLabel();
        labelPostTime7 = new javax.swing.JLabel();
        labelLike7 = new javax.swing.JLabel();
        labelPostID7 = new javax.swing.JLabel();
        txtContent7 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        labelPostAuthor8 = new javax.swing.JLabel();
        labelPostTime8 = new javax.swing.JLabel();
        labelLike8 = new javax.swing.JLabel();
        labelPostID8 = new javax.swing.JLabel();
        txtContent8 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        labelPostAuthor9 = new javax.swing.JLabel();
        labelPostTime9 = new javax.swing.JLabel();
        labelLike9 = new javax.swing.JLabel();
        labelPostID9 = new javax.swing.JLabel();
        txtContent9 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        labelPostAuthor10 = new javax.swing.JLabel();
        labelPostTime10 = new javax.swing.JLabel();
        labelLike10 = new javax.swing.JLabel();
        labelPostID10 = new javax.swing.JLabel();
        txtContent10 = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(510, 512));
        setMinimumSize(new java.awt.Dimension(510, 512));
        setPreferredSize(new java.awt.Dimension(510, 512));

        panelPost.setBackground(new java.awt.Color(255, 255, 255));

        scrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtPost.setColumns(20);
        txtPost.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txtPost.setForeground(new java.awt.Color(153, 153, 153));
        txtPost.setLineWrap(true);
        txtPost.setRows(3);
        txtPost.setText("Bạn đang nghĩ gì?");
        txtPost.setToolTipText("Bạn đang nghĩ gì?");
        txtPost.setWrapStyleWord(true);
        txtPost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPostFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPostFocusLost(evt);
            }
        });
        scrollPane.setViewportView(txtPost);

        panelUsername.setBackground(new java.awt.Color(255, 255, 255));

        labelUsername.setBackground(new java.awt.Color(255, 255, 255));
        labelUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(29, 161, 242));
        labelUsername.setText("Unknown");
        labelUsername.setToolTipText("");

        javax.swing.GroupLayout panelUsernameLayout = new javax.swing.GroupLayout(panelUsername);
        panelUsername.setLayout(panelUsernameLayout);
        panelUsernameLayout.setHorizontalGroup(
            panelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsernameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUsernameLayout.setVerticalGroup(
            panelUsernameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsernameLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelUsername)
                .addGap(8, 8, 8))
        );

        btnPost.setBackground(new java.awt.Color(29, 161, 242));
        btnPost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPost.setForeground(new java.awt.Color(255, 255, 255));
        btnPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_send_white.png"))); // NOI18N
        btnPost.setText("ĐĂNG NGAY");
        btnPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPostLayout = new javax.swing.GroupLayout(panelPost);
        panelPost.setLayout(panelPostLayout);
        panelPostLayout.setHorizontalGroup(
            panelPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane)
                    .addGroup(panelPostLayout.createSequentialGroup()
                        .addComponent(panelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPost, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPostLayout.setVerticalGroup(
            panelPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPostLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        scrollPaneAll.setBorder(null);
        scrollPaneAll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneAll.setToolTipText("");
        scrollPaneAll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneAll.setAlignmentX(0.0F);
        scrollPaneAll.setAlignmentY(0.0F);
        scrollPaneAll.setAutoscrolls(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor1.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor1.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor1.setText("Unknown");

        labelPostTime1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime1.setText("00/00/00");
        labelPostTime1.setToolTipText("");

        labelLike1.setBackground(new java.awt.Color(255, 255, 255));
        labelLike1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike1.setText("0");
        labelLike1.setToolTipText("Like");
        labelLike1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID1.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID1.setText("#00");
        labelPostID1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent1.setEditable(false);
        txtContent1.setColumns(20);
        txtContent1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent1.setLineWrap(true);
        txtContent1.setRows(5);
        txtContent1.setText("null");
        txtContent1.setToolTipText("");
        txtContent1.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelLike1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor2.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor2.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor2.setText("Unknown");

        labelPostTime2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime2.setText("00/00/00");
        labelPostTime2.setToolTipText("");

        labelLike2.setBackground(new java.awt.Color(255, 255, 255));
        labelLike2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike2.setText("0");
        labelLike2.setToolTipText("Like");
        labelLike2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID2.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID2.setText("#00");
        labelPostID2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent2.setEditable(false);
        txtContent2.setColumns(20);
        txtContent2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent2.setLineWrap(true);
        txtContent2.setRows(5);
        txtContent2.setText("null");
        txtContent2.setToolTipText("");
        txtContent2.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelLike2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor3.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor3.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor3.setText("Unknown");

        labelPostTime3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime3.setText("00/00/00");
        labelPostTime3.setToolTipText("");

        labelLike3.setBackground(new java.awt.Color(255, 255, 255));
        labelLike3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike3.setText("0");
        labelLike3.setToolTipText("Like");
        labelLike3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID3.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID3.setText("#00");
        labelPostID3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent3.setEditable(false);
        txtContent3.setColumns(20);
        txtContent3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent3.setLineWrap(true);
        txtContent3.setRows(5);
        txtContent3.setText("null");
        txtContent3.setToolTipText("");
        txtContent3.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelLike3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor4.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor4.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor4.setText("Unknown");

        labelPostTime4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime4.setText("00/00/00");
        labelPostTime4.setToolTipText("");

        labelLike4.setBackground(new java.awt.Color(255, 255, 255));
        labelLike4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike4.setText("0");
        labelLike4.setToolTipText("Like");
        labelLike4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID4.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID4.setText("#00");
        labelPostID4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent4.setEditable(false);
        txtContent4.setColumns(20);
        txtContent4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent4.setLineWrap(true);
        txtContent4.setRows(5);
        txtContent4.setText("null");
        txtContent4.setToolTipText("");
        txtContent4.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelLike4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor5.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor5.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor5.setText("Unknown");

        labelPostTime5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime5.setText("00/00/00");
        labelPostTime5.setToolTipText("");

        labelLike5.setBackground(new java.awt.Color(255, 255, 255));
        labelLike5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike5.setText("0");
        labelLike5.setToolTipText("Like");
        labelLike5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID5.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID5.setText("#00");
        labelPostID5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent5.setEditable(false);
        txtContent5.setColumns(20);
        txtContent5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent5.setLineWrap(true);
        txtContent5.setRows(5);
        txtContent5.setText("null");
        txtContent5.setToolTipText("");
        txtContent5.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelLike5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor6.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor6.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor6.setText("Unknown");

        labelPostTime6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime6.setText("00/00/00");
        labelPostTime6.setToolTipText("");

        labelLike6.setBackground(new java.awt.Color(255, 255, 255));
        labelLike6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike6.setText("0");
        labelLike6.setToolTipText("Like");
        labelLike6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID6.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID6.setText("#00");
        labelPostID6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent6.setEditable(false);
        txtContent6.setColumns(20);
        txtContent6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent6.setLineWrap(true);
        txtContent6.setRows(5);
        txtContent6.setText("null");
        txtContent6.setToolTipText("");
        txtContent6.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent6)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(labelLike6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor7.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor7.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor7.setText("Unknown");

        labelPostTime7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime7.setText("00/00/00");
        labelPostTime7.setToolTipText("");

        labelLike7.setBackground(new java.awt.Color(255, 255, 255));
        labelLike7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike7.setText("0");
        labelLike7.setToolTipText("Like");
        labelLike7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID7.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID7.setText("#00");
        labelPostID7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent7.setEditable(false);
        txtContent7.setColumns(20);
        txtContent7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent7.setLineWrap(true);
        txtContent7.setRows(5);
        txtContent7.setText("null");
        txtContent7.setToolTipText("");
        txtContent7.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent7)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(labelLike7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor8.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor8.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor8.setText("Unknown");

        labelPostTime8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime8.setText("00/00/00");
        labelPostTime8.setToolTipText("");

        labelLike8.setBackground(new java.awt.Color(255, 255, 255));
        labelLike8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike8.setText("0");
        labelLike8.setToolTipText("Like");
        labelLike8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID8.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID8.setText("#00");
        labelPostID8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent8.setEditable(false);
        txtContent8.setColumns(20);
        txtContent8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent8.setLineWrap(true);
        txtContent8.setRows(5);
        txtContent8.setText("null");
        txtContent8.setToolTipText("");
        txtContent8.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent8)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(labelLike8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor9.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor9.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor9.setText("Unknown");

        labelPostTime9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime9.setText("00/00/00");
        labelPostTime9.setToolTipText("");

        labelLike9.setBackground(new java.awt.Color(255, 255, 255));
        labelLike9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike9.setText("0");
        labelLike9.setToolTipText("Like");
        labelLike9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID9.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID9.setText("#00");
        labelPostID9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent9.setEditable(false);
        txtContent9.setColumns(20);
        txtContent9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent9.setLineWrap(true);
        txtContent9.setRows(5);
        txtContent9.setText("null");
        txtContent9.setToolTipText("");
        txtContent9.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent9)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(labelLike9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostAuthor10.setBackground(new java.awt.Color(255, 255, 255));
        labelPostAuthor10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostAuthor10.setForeground(new java.awt.Color(29, 161, 242));
        labelPostAuthor10.setText("Unknown");

        labelPostTime10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostTime10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelPostTime10.setText("00/00/00");
        labelPostTime10.setToolTipText("");

        labelLike10.setBackground(new java.awt.Color(255, 255, 255));
        labelLike10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLike10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLike10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_like.png"))); // NOI18N
        labelLike10.setText("0");
        labelLike10.setToolTipText("Like");
        labelLike10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelPostID10.setBackground(new java.awt.Color(255, 255, 255));
        labelPostID10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelPostID10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPostID10.setText("#00");
        labelPostID10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        txtContent10.setEditable(false);
        txtContent10.setColumns(20);
        txtContent10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContent10.setLineWrap(true);
        txtContent10.setRows(5);
        txtContent10.setText("null");
        txtContent10.setToolTipText("");
        txtContent10.setWrapStyleWord(true);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContent10)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(labelPostAuthor10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(174, 174, 174)
                        .addComponent(labelPostTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(labelLike10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPostID10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPostTime10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPostAuthor10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContent10, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPostID10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLike10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout panelAllLayout = new javax.swing.GroupLayout(panelAll);
        panelAll.setLayout(panelAllLayout);
        panelAllLayout.setHorizontalGroup(
            panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAllLayout.setVerticalGroup(
            panelAllLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAllLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        scrollPaneAll.setViewportView(panelAll);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollPaneAll, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneAll, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostActionPerformed
        controller.post(user_id, txtPost);
    }//GEN-LAST:event_btnPostActionPerformed

    private void txtPostFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostFocusGained
        if (txtPost.getText().trim().equals("Bạn đang nghĩ gì?")) {
            txtPost.setText("");
            txtPost.setForeground(new Color(0, 0, 0));
            txtPost.setDocument(new PlainDocument() {
                @Override
                public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                    if (str == null || txtPost.getText().length() >= 255) {
                        return;
                    }
                    super.insertString(offs, str, a);
                }
            });
        }
    }//GEN-LAST:event_txtPostFocusGained

    private void txtPostFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPostFocusLost
        if (txtPost.getText().trim().equals("")) {
            txtPost.setText("Bạn đang nghĩ gì?");
            txtPost.setForeground(new Color(153, 153, 153));
        } else {
            txtPost.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtPostFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPost;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelLike1;
    private javax.swing.JLabel labelLike10;
    private javax.swing.JLabel labelLike2;
    private javax.swing.JLabel labelLike3;
    private javax.swing.JLabel labelLike4;
    private javax.swing.JLabel labelLike5;
    private javax.swing.JLabel labelLike6;
    private javax.swing.JLabel labelLike7;
    private javax.swing.JLabel labelLike8;
    private javax.swing.JLabel labelLike9;
    private javax.swing.JLabel labelPostAuthor1;
    private javax.swing.JLabel labelPostAuthor10;
    private javax.swing.JLabel labelPostAuthor2;
    private javax.swing.JLabel labelPostAuthor3;
    private javax.swing.JLabel labelPostAuthor4;
    private javax.swing.JLabel labelPostAuthor5;
    private javax.swing.JLabel labelPostAuthor6;
    private javax.swing.JLabel labelPostAuthor7;
    private javax.swing.JLabel labelPostAuthor8;
    private javax.swing.JLabel labelPostAuthor9;
    private javax.swing.JLabel labelPostID1;
    private javax.swing.JLabel labelPostID10;
    private javax.swing.JLabel labelPostID2;
    private javax.swing.JLabel labelPostID3;
    private javax.swing.JLabel labelPostID4;
    private javax.swing.JLabel labelPostID5;
    private javax.swing.JLabel labelPostID6;
    private javax.swing.JLabel labelPostID7;
    private javax.swing.JLabel labelPostID8;
    private javax.swing.JLabel labelPostID9;
    private javax.swing.JLabel labelPostTime1;
    private javax.swing.JLabel labelPostTime10;
    private javax.swing.JLabel labelPostTime2;
    private javax.swing.JLabel labelPostTime3;
    private javax.swing.JLabel labelPostTime4;
    private javax.swing.JLabel labelPostTime5;
    private javax.swing.JLabel labelPostTime6;
    private javax.swing.JLabel labelPostTime7;
    private javax.swing.JLabel labelPostTime8;
    private javax.swing.JLabel labelPostTime9;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPanel panelAll;
    private javax.swing.JPanel panelPost;
    private javax.swing.JPanel panelUsername;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JScrollPane scrollPaneAll;
    private javax.swing.JTextArea txtContent1;
    private javax.swing.JTextArea txtContent10;
    private javax.swing.JTextArea txtContent2;
    private javax.swing.JTextArea txtContent3;
    private javax.swing.JTextArea txtContent4;
    private javax.swing.JTextArea txtContent5;
    private javax.swing.JTextArea txtContent6;
    private javax.swing.JTextArea txtContent7;
    private javax.swing.JTextArea txtContent8;
    private javax.swing.JTextArea txtContent9;
    private javax.swing.JTextArea txtPost;
    // End of variables declaration//GEN-END:variables
}
