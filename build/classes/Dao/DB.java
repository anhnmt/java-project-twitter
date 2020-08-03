/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author XDORRO
 */
public class DB {
    //Tạo biến connect database
    public static Connection con;
    public static Properties props;
    public static File file;
    public static FileInputStream input;
    public static String driver;
    public static String url;
    public static String user;
    public static String password;
        
    public static Connection connect() {
        try {
            props = new Properties();
            file = new File("src/DAO/Config.properties");
            input = new FileInputStream(file.getAbsolutePath());
            props.load(input);
            input.close();

            // load the Driver Class
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

            // create the connection now
            con = DriverManager.getConnection(
                props.getProperty("DB_URL"),
                props.getProperty("DB_USERNAME"),
                props.getProperty("DB_PASSWORD")
            );
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println("Khong the ket noi Database!");
            System.exit(0);
        }
        
        //Trả về kết quả biến connect
        return con;
    }
    
    public static void main(String[] args) {
        //In kết quả ra màn hình
        System.out.println(connect());
    }
}
