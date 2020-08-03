/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Dao.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author XDORRO
 */
public class TestDB {
    public Statement st;
    public ResultSet rs;

    public TestDB() {
        this.st = null;
        this.rs = null;
    }
    
    public static void main(String[] args) throws SQLException {
        int uid = 2;
        String content = "Nam thần nước Úc đã có hành trình tuyệt vời cùng MCU khi đảm nhận vai diễn Thor. Bắt đầu từ Thor đến Avengers: Hồi Kết, Chris Hemsworth đã thay đổi rất nhiều từ ngoại hình đến diễn xuất và trở thành một trong những nhân vật được yêu thích nhất của Marvel Studios.";
        String sql = "INSERT INTO `posts`(`user_id`, `content`) VALUES (?, ?)";
        Connection con = DB.connect();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, uid);
        ps.setString(2, content);
        
        System.out.println(content.length());
        
//        int check = ps.executeUpdate();
//        
//        if (check > 0) {
//            System.out.println(check + " - " + content.length());
//        }
        
    }
}
