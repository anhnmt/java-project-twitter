/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Posts;

/**
 *
 * @author XDORRO
 */
public interface PostsDao {
    public boolean post(int user_id, String content);
    
    public Posts[] get();
    
    public boolean like(int num_like, int user_id, int post_id);
    
    public boolean unlike(int num_like, int user_id, int post_id);
    
    public boolean getlike(int user_id, int post_id);
}
