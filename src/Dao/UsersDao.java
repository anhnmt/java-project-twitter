/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Users;

/**
 *
 * @author XDORRO
 */
public interface UsersDao {
    public Users signin(String username, String password);
    
    public Users signup(String username, String password, boolean gender, boolean level);
    
    public boolean update(int user_id, String newpassword);
}
