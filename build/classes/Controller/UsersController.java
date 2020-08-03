/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.UsersDao;
import Dao.UsersImpl;
import Model.Users;
import View.LoginJFrame;
import View.MainJFrame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author XDORRO
 */
public class UsersController {
    private UsersDao userDao;
    private JFrame This;

    public UsersController(JFrame This) {
        this.This = This;
        this.userDao = new UsersImpl();
    }
    
    public void setSignin(JTextField txtSigninUsername, JPasswordField txtSigninPassword) {
        if (
            txtSigninUsername.getText().length() == 0
            || txtSigninUsername.getText().trim().equals("Nhập tài khoản của bạn")
            || txtSigninPassword.getText().length() == 0
            || txtSigninPassword.getText().trim().equals("Nhập mật khẩu")
        ) {
            JOptionPane.showMessageDialog(This, "Vui lòng nhập đầy đủ dữ liệu!");
        } else {
            Users user = userDao.signin(
                txtSigninUsername.getText().trim(), 
                txtSigninPassword.getText().trim()
            );

            if (user == null) {
                JOptionPane.showMessageDialog(This, "Tên đăng nhập hoặc mật khẩu không đúng!");
                txtSigninPassword.setText("");
            } else {
                new MainJFrame(user).setVisible(true);
                This.dispose();
            }
        }
    }
    
    public void setSignup(JRadioButton radioSignupNam, JRadioButton radioSignupNu, 
            JTextField txtSignupUsername, JPasswordField txtSignupPassword) {
        if (
            txtSignupUsername.getText().length() == 0
            || txtSignupUsername.getText().trim().equals("Tài khoản của bạn")
            || txtSignupPassword.getText().length() == 0
            || txtSignupPassword.getText().trim().equals("Nhập mật khẩu")
            || (radioSignupNam.isSelected() == false && radioSignupNu.isSelected() == false)
        ) {
            JOptionPane.showMessageDialog(This, "Vui lòng nhập đầy đủ dữ liệu!");
        } else {
            Users user = userDao.signup(
                txtSignupUsername.getText(), 
                txtSignupPassword.getText(), 
                radioSignupNam.isSelected(), 
                false
            );

            if (user == null) {
                JOptionPane.showMessageDialog(This, "Đăng ký thất bại, vui lòng kiểm tra lại thông tin!");
            } else {
                new MainJFrame(user).setVisible(true);
                This.dispose();
            }
        }
    }
    
    public void changePassword(
        int user_id, JPasswordField txtNewpass, JPasswordField txtRenewPass
    ) {
        if (
            txtNewpass.getText().length() == 0
            || txtNewpass.getText().trim().equals("Nhập mật khẩu")
            || txtRenewPass.getText().length() == 0
            || txtRenewPass.getText().trim().equals("Nhập mật khẩu")
        ) {
            JOptionPane.showMessageDialog(This, "Vui lòng nhập đầy đủ dữ liệu!");
        } else {
            if (!txtNewpass.getText().equals(txtRenewPass.getText())) {
                JOptionPane.showMessageDialog(This, "Mật khẩu mới không giống nhau!");
            } else {
                boolean update = userDao.update(
                    user_id, 
                    txtNewpass.getText().trim()
                );

                if (update == false) {
                    JOptionPane.showMessageDialog(This, "Có lỗi xảy ra, vui lòng thử lại!");
                } else {
                    JOptionPane.showMessageDialog(This, "Đổi mật khẩu thành công!");
                    new LoginJFrame().setVisible(true);
                    This.dispose();
                }
            }
        }
    }
}
