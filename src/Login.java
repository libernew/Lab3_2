import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textuser;
    private JTextField pwduser;
    private JButton btnsubmit;
    private JButton btnclear;
    private JPasswordField textpwd;

    public Login() {
        btnsubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, textuser.getText());
        });
    }
}
