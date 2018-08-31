import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_1 {
    private JTextField textuserlogin;
    private JPasswordField pwdUserpassword;
    private JButton btnSubmit;
    private JButton btnClear;
    private JPanel mainpanal;

    public Login_1() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textuserlogin.getText()
                        + " "+ new String(pwdUserpassword.getPassword()));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textuserlogin.setText("");
                pwdUserpassword.setText("");
            }
        });
    }
    public JPanel getMainpanal(){
        return mainpanal;
    }

}
