package login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PersistentLogin {

    private JFrame loginFrame;
    private JFrame profileFrame;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JTextField txtName;
    private JTextField txtEmail;

    private Map<String, User> users = new HashMap<>();
    private User currentUser;

    private static final String DATA_FILE = "files/users.txt";

    public void showLoginScreen() {
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
        txtName = new JTextField(20);
        txtName.setText(currentUser.getName());
        namePanel.add(lblName);
        namePanel.add(txtName);
        namePanel.setBackground(Color.BLACK);
        lblName.setForeground(Color.WHITE);

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblEmail = new JLabel("Email:");
        txtEmail = new JTextField(20);
        txtEmail.setText(currentUser.getEmail());
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
        profileFrame.pack();
        profileFrame.setLocationRelativeTo(null);
        profileFrame.setVisible(true);
    }

    class LoginButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String username = txtUsername.getText().trim();
            String password = new String(txtPassword.getPassword());
            String hashedPassword = hashPassword(password);

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(loginFrame, "Please enter username and password.");
                return;
            }

            User user = users.get(username);

            if (user != null) {
                if (user.getHashedPassword().equals(hashedPassword)) {
                    JOptionPane.showMessageDialog(loginFrame, "Welcome back, " + username + "!");
                    currentUser = user;
                    loginFrame.dispose();
                    showProfileScreen();
                } else {
                    JOptionPane.showMessageDialog(loginFrame, "Invalid password.");
                }
            } else {
                int confirm = JOptionPane.showConfirmDialog(loginFrame,
                        "New user detected. Create account?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    user = new User(username, hashedPassword, "", "");
                    users.put(username, user);
                    currentUser = user;
                    saveUsers();
                    JOptionPane.showMessageDialog(loginFrame, "Account created!");
                    loginFrame.dispose();
                    showProfileScreen();
                }
            }

            Arrays.fill(txtPassword.getPassword(), '0');
        }
    }

    class SaveButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            currentUser.setName(txtName.getText());
            currentUser.setEmail(txtEmail.getText());
            saveUsers();
            JOptionPane.showMessageDialog(profileFrame, "Information saved!");
        }
    }

    class LogoutButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            currentUser = null;
            profileFrame.dispose();
            showLoginScreen();
        }
    }

    public void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    users.put(parts[0], new User(parts[0], parts[1], parts[2], parts[3]));
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading user data.");
        }
    }

    private void saveUsers() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(DATA_FILE))) {
            for (User u : users.values()) {
                writer.println(u.getUsername() + "|" + u.getHashedPassword() + "|" + u.getName() + "|" + u.getEmail());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving user data.");
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

