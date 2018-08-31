import javax.swing.*;
public class main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        Login_1 loginpanal = new Login_1();
        frame.setContentPane(loginpanal.getMainpanal());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
