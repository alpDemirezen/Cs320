import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class LoginPanel extends JFrame {
    private String username = "username";
    private String password = "pass";
    private JTextField txtUsername;
    private JPasswordField txtPassword;


    public static void main(String args[]) {
        LoginPanel login = new LoginPanel();
        login.initialize();
    }

    private void initialize() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel UsernameLabel = new JLabel("Username:");
        JLabel PasswordLabel = new JLabel("Password:");
        txtUsername = new JTextField(20);
        txtPassword = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new LoginListener());
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new CancelListener());

        panel.add(UsernameLabel);
        panel.add(txtUsername);
        panel.add(PasswordLabel);
        panel.add(txtPassword);
        panel.add(loginButton);
        panel.add(cancelButton);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);

    }

    public class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (username.equals(txtUsername.getText()) && Arrays.equals(password.toCharArray(), txtPassword.getPassword())) {
                JOptionPane.showMessageDialog(null, "Logged in successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Log in failed!");
            }
        }
    }

    public class CancelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}