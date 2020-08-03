/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Posts;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XDORRO
 */
public class PostsImpl implements PostsDao {
    private Connection con = null;
    private String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    @Override
    public boolean post(int user_id, String content) {
        boolean post = false;
        
        try {
            con = DB.connect();
            sql = "INSERT INTO `posts`(`user_id`, `content`) VALUES (?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setString(2, content);
            
            int check = ps.executeUpdate();
            if (check > 0) {
                post = true;
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return post;
    }

    @Override
    public Posts[] get() {
        Posts[] post = new Posts[10];
                
        try {
            con = DB.connect();
            sql = "SELECT Posts.post_id, Users.user_id, Users.username, Users.gender, Posts.content, Posts.like, Posts.created FROM Users INNER JOIN Posts ON Users.user_id = Posts.user_id ORDER BY Posts.post_id DESC LIMIT 10";
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                post[i] = new Posts();
                post[i].setPost_id(rs.getInt(1));
                post[i].setUser_id(rs.getInt(2));
                post[i].setUser_name(rs.getString(3).toUpperCase());
                post[i].setUser_gender(rs.getBoolean(4));
                post[i].setContent(rs.getString(5));
                post[i].setLike(rs.getInt(6));
                post[i].setCreated(rs.getTimestamp(7));
                i++;
            }         
            
            con.close();
        } catch (SQLException e) {
        }

        return post;
    }

    @Override
    public boolean like(int num_like, int user_id, int post_id) {
        boolean like = false;
        
        try {
            con = DB.connect();
            sql = "INSERT INTO `likes`(`user_id`, `post_id`) VALUES (?, ?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setInt(2, post_id);            
            int insert = ps.executeUpdate();
            
            sql = "UPDATE `posts` SET `like` = ? WHERE `post_id` LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, num_like);
            ps.setInt(2, post_id);
            int update = ps.executeUpdate();
            
            if (insert > 0 && update > 0) {
                like = true;
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return like;
    }

    @Override
    public boolean unlike(int num_like, int user_id, int post_id) {
        boolean unlike = false;
                
        try {
            con = DB.connect();
            sql = "DELETE FROM `likes` WHERE `user_id` LIKE ? AND `post_id` LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setInt(2, post_id);            
            int delete = ps.executeUpdate();
            
            sql = "UPDATE `posts` SET `like` = ? WHERE `post_id` LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, num_like);
            ps.setInt(2, post_id);
            int update = ps.executeUpdate();
            
            if (delete > 0 && update > 0) {
                unlike = true;
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return unlike;
    }
    
    @Override
    public boolean getlike(int user_id, int post_id) {
        boolean like = false;
        
        try {
            con = DB.connect();
            sql = "SELECT `user_id`, `post_id` FROM `likes` WHERE `user_id` LIKE ? AND `post_id` LIKE ? LIMIT 1";
            ps = con.prepareStatement(sql);
            ps.setInt(1, user_id);
            ps.setInt(2, post_id);
            
            rs = ps.executeQuery();
            if (rs.next()) {
                like = true;
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return like;
    }

    public static void main(String[] args) {
        PostsDao postDao = new PostsImpl();

        boolean like = postDao.unlike(1, 1, 5);
        System.out.println(like);
    }
    
}
