/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PostsDao;
import Dao.PostsImpl;
import Model.Posts;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author XDORRO
 */
public class PostsController {
    private PostsDao postDao;
    private JPanel This;

    public PostsController(JPanel This) {
        this.This = This;
        this.postDao = new PostsImpl();
    }
    
    public void post(int user_id, JTextArea txtPost) {
        
        if (
            txtPost.getText() == null
            || txtPost.getText().length() == 0
            || txtPost.getText().trim().equals("Bạn đang nghĩ gì?")
        ) {
            showMessageDialog(This, "Vui lòng nhập nội dung!");
        } else if (
            txtPost.getText().length() <= 255
        ) {
            boolean posts = postDao.post(user_id, txtPost.getText().trim());

            if (posts != false) {
                showMessageDialog(This, "Oke!");
                txtPost.setText("");
            } else {
                showMessageDialog(This, "Đăng bài không thành công!");
            }
        } else {
            showMessageDialog(This, "Nội dung yêu cầu nhỏ hơn 255 ký tự!");
        }
    }
    
    public void get(
        int user_id, List jPanel, List txtContent, List labelLike, 
        List labelPostAuthor, List labelPostID, List labelPostTime
    ) throws NoSuchFieldException {
        Posts[] posts = postDao.get();
        int i = 1;
        if (posts != null) {
            for (Posts post : posts) {
                if (post != null) {
                    int post_id = post.getPost_id();
                    boolean getGender = post.isUser_gender();
                    boolean checklike = postDao.getlike(user_id, post_id);
                    
                    JPanel getPanel = (JPanel) jPanel.get(i);
                    getPanel.setVisible(true);
                    
                    JTextArea getContent = (JTextArea) txtContent.get(i);
                    getContent.setText(post.getContent());
                    
                    JLabel getLike = (JLabel) labelLike.get(i);
                    getLike.setText(Integer.toString(post.getLike()));
                    
                    if (checklike) {
                        getLike.setForeground(new Color(237,73,86));
                        getLike.setIcon(new ImageIcon(getClass().getResource(
                            "/Images/icon_liked.png"
                        )));
                    } else {
                        getLike.setForeground(Color.black);
                        getLike.setIcon(new ImageIcon(getClass().getResource(
                            "/Images/icon_like.png"
                        )));
                    }
                    
                    JLabel getAuthor = (JLabel) labelPostAuthor.get(i);
                    getAuthor.setText(post.getUser_name());
                    
                    JLabel getPostID = (JLabel) labelPostID.get(i);
                    getPostID.setText("#" + Integer.toString(post_id));
                    
                    DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");  
                    JLabel getPostTime = (JLabel) labelPostTime.get(i);
                    getPostTime.setText(dateFormat.format(post.getCreated()));
                    
                    getLike.addMouseListener(new PostsController.LabelEvent(user_id, post_id, getLike));
                    i++;
                }
            }
        }
    }
    
    class LabelEvent implements MouseListener {
        private int user_id;
        private int post_id;
        private JLabel like;
        private boolean click;
        private int liked;

        public LabelEvent(int user_id, int post_id, JLabel like) {
            this.like = like;
            this.user_id = user_id;
            this.post_id = post_id;
            this.click = postDao.getlike(user_id, post_id);
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (click) {
                click = false;
                liked = Integer.parseInt(like.getText()) - 1;
                like.setText(Integer.toString(liked));
                postDao.unlike(liked, user_id, post_id);
            } else {
                click = true;
                liked = Integer.parseInt(like.getText()) + 1;
                like.setText(Integer.toString(liked));
                postDao.like(liked, user_id, post_id);
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            like.setForeground(new Color(237,73,86));
            like.setIcon(new ImageIcon(getClass().getResource(
                "/Images/icon_liked.png"
            )));
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            like.setForeground(new Color(237,73,86));
            like.setIcon(new ImageIcon(getClass().getResource(
                "/Images/icon_liked.png"
            )));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!click) {
                like.setForeground(Color.black);
                like.setIcon(new ImageIcon(getClass().getResource(
                    "/Images/icon_like.png"
                )));
            }
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }
    }
}
