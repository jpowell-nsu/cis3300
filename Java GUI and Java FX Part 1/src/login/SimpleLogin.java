package login;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SimpleLogin {
	
    private JFrame loginFrame;
    private JFrame profileFrame;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtName;
    private JTextField txtEmail;
    private String savedName = "";
    private String savedEmail = "";
    private final String correctUsername = "student";
    private final String correctHashedPassword = hashPassword("java123");
 
    public void loginScreen() {
        loginFrame = new JFrame("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setBackground(Color.BLACK);        
 
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.BLACK);

        JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblUsername = new JLabel("Username:");
        txtUsername = new JTextField(15);
        userPanel.add(lblUsername);
        userPanel.add(txtUsername);
        userPanel.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.WHITE);

        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblPassword = new JLabel("Password:");
        txtPassword = new JPasswordField(15);
        passPanel.add(lblPassword);
        passPanel.add(txtPassword);
        passPanel.setBackground(Color.BLACK);
        lblPassword.setForeground(Color.WHITE);
        
        JPanel buttonPanel = new JPanel();
        JButton btnLogin = new JButton("Login");
        buttonPanel.add(btnLogin);
        buttonPanel.setBackground(Color.BLACK);

        panel.add(userPanel);
        panel.add(passPanel);
        panel.add(buttonPanel);

        btnLogin.addActionListener(new LoginButtonHandler());

        loginFrame.add(panel);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
    }    

    private void showProfileScreen() {
        profileFrame = new JFrame("User Profile");
        profileFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        profileFrame.setBackground(Color.BLACK);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.setBackground(Color.BLACK);

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblName = new JLabel("Full Name:");
        txtName = new JTextField(20);  // 20 characters wide
        txtName.setText(savedName);
        namePanel.add(lblName);
        namePanel.add(txtName);
        namePanel.setBackground(Color.BLACK);
        lblName.setForeground(Color.WHITE);

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20);
        txtEmail.setText(savedEmail);
        emailPanel.add(lblEmail);
        emailPanel.add(txtEmail);
        emailPanel.setBackground(Color.BLACK);
        lblEmail.setForeground(Color.WHITE);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnSave = new JButton("Save");
        JButton btnLogout = new JButton("Logout");
        buttonPanel.add(btnSave);
        buttonPanel.add(btnLogout);
        buttonPanel.setBackground(Color.BLACK);

        mainPanel.add(namePanel);
        mainPanel.add(emailPanel);
        mainPanel.add(buttonPanel);

        btnSave.addActionListener(new SaveButtonHandler());
        btnLogout.addActionListener(new LogoutButtonHandler());

        profileFrame.add(mainPanel);
        profileFrame.pack(); // adjust frame size to fit preferred sizes
        profileFrame.setLocationRelativeTo(null); // center on screen
        profileFrame.setVisible(true);
    }

    class LoginButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = txtUsername.getText();
            String hashedPassword = hashPassword(new String(txtPassword.getPassword()));

            if (username.equals(correctUsername) && hashedPassword.equals(correctHashedPassword)) {
                JOptionPane.showMessageDialog(loginFrame, "Login successful!");
                loginFrame.dispose();
                showProfileScreen();
            } else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid username or password.");
            }
            Arrays.fill(txtPassword.getPassword(), '0');
        }
    }

    class SaveButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            savedName = txtName.getText();
            savedEmail = txtEmail.getText();
            JOptionPane.showMessageDialog(profileFrame, "Information saved!");
        }
    }

    class LogoutButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            profileFrame.dispose();
            loginScreen();
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException("Hashing algorithm not found.");
        }
    }
}