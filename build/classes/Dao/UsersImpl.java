/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Main.BCrypt;
import Model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XDORRO
 */
public class UsersImpl implements UsersDao {
    private Connection con = null;
    private String sql = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public Users signin(String username, String password) {
        Users user = null;
        
        try {
            con = DB.connect();
            sql = "SELECT `user_id`, `username`, `password`, `gender`, `level` FROM `Users` WHERE `username` LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                if (BCrypt.checkpw(password, rs.getString("password"))) {
                    user = new Users();
                    user.setUser_id(rs.getInt("user_id"));
                    user.setUsername(rs.getString("username"));
                    user.setGender(rs.getBoolean("gender"));
                    user.setLevel(rs.getBoolean("level"));
                }
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return user;
    }

    @Override
    public Users signup(String username, String password, boolean gender, boolean level) {
        Users user = null;
        String hashpw = BCrypt.hashpw(password, BCrypt.gensalt());
        
        try {
            con = DB.connect();
            sql = "INSERT INTO `Users` (`username`, `password`, `gender`, `level`) VALUES (?, ?, ?, ?)";
            ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, username);
            ps.setString(2, hashpw);
            ps.setBoolean(3, gender);
            ps.setBoolean(4, level);
            ps.execute();
            rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                user = new Users();
                user.setUser_id(rs.getInt(1));
                user.setUsername(username);
                user.setGender(gender);
                user.setLevel(level);
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return user;
    }
    
    @Override
    public boolean update(int user_id, String newpassword) {
        boolean update = false;
        String hashpw = BCrypt.hashpw(newpassword, BCrypt.gensalt());
        
        try {
            con = DB.connect();
            sql = "UPDATE `Users` SET `password` = ? WHERE `user_id` LIKE ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, hashpw);
            ps.setInt(2, user_id);
            int check = ps.executeUpdate();
            
            if (check > 0) {
                update = true;
            }
            
            con.close();
        } catch (SQLException e) {
        }
        
        return update;
    }

    public static void main(String[] args) {
        UsersDao userDao = new UsersImpl();
        
        Users signin = userDao.signin("admin", "1230123");
        System.out.println(signin);
        
//        Users signup = userDao.signup("admin", "123123", false, false);
//        System.out.println(signup);
    }
}
