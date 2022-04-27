package GUI;

import Connection.Connector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login extends JFrame {
    // Deklarasi Panel & Frame
    private static JPanel panel;
    private static JFrame frame;
    
    // Deklarasi Tombol & Label Login
    private static JLabel userLabelLogin;
    private static JTextField userTextLogin;
    private static JLabel passwordLabelLogin;
    private static JPasswordField passwordTextLogin;
    private static JButton loginButton;

    // Deklarasi Tombol Navigasi Register & Login
    private static JLabel gotoRegisterLabel;
    private static JButton goToRegisterButton;

    // final private static Font mainFont = new Font("Roboto", Font.BOLD, 13);

    public void initialize() {
        Connector connector = new Connector();

        // Instansiasi Panel dan Frame
        panel = new JPanel();
        frame = new JFrame();
        
        // Set Size Frame, Title Frame dan add Panel ke Frame
        frame.setSize(375, 285);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Login - 123200120");

        // Set Warna Background dan Layout Panel
        panel.setLayout(null);
        panel.setBackground(Color.white);

        // ----LOGIN
        userLabelLogin = new JLabel("Username");
        userLabelLogin.setBounds(10,20,80,25);
        panel.add(userLabelLogin);
        // userLabelLogin.setFont(mainFont);
        userLabelLogin.setForeground(Color.black);

        userTextLogin = new JTextField(20);
        userTextLogin.setBounds(100,20,165,25);
        panel.add(userTextLogin);

        passwordLabelLogin = new JLabel("Password");
        passwordLabelLogin.setBounds(10,60,80,25);
        panel.add(passwordLabelLogin);
        // passwordLabelLogin.setFont(mainFont);
        passwordLabelLogin.setForeground(Color.black);

        passwordTextLogin = new JPasswordField();
        passwordTextLogin.setBounds(100,60,165,25);
        panel.add(passwordTextLogin);

        loginButton = new JButton("Masuk");
        loginButton.setBounds(140,105,80,25);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jumlah = 0;
                String username = userTextLogin.getText();
                String password = new String(passwordTextLogin.getPassword());
                Boolean berhasilLogin = false;
                try { 
                    String data[][] = new String[100][3];
                    String query = "select * from users";
                    PreparedStatement pstmt = connector.koneksi.prepareStatement(query);
                    connector.statement = connector.koneksi.createStatement();
                    ResultSet resultSet = pstmt.executeQuery(query);
                    while (resultSet.next()) {
                        data[jumlah][0] = String.valueOf(resultSet.getInt("id")); // ngambil int jadikan string
                        data[jumlah][1] = resultSet.getString("username"); // ngambil string
                        data[jumlah][2] = resultSet.getString("password");
                        if((data[jumlah][1].equals(username)) && (data[jumlah][2].equals(password))) {
                            berhasilLogin = true;   
                            break;
                        }
                        jumlah++;
                    }
                    if (berhasilLogin == true) {
                        JOptionPane.showMessageDialog(frame, "Login Berhasil!");
                    } else {
                        // JOptionPane.showMessageDialog(frame, "Login Gagal!");
                        JOptionPane.showMessageDialog(frame, "Kesalahan Username/Password!");
                    }
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                    // JOptionPane.showMessageDialog(frame, "Gagal Login!");
                }
            }
        });
        panel.add(loginButton);
        loginButton.setForeground(Color.black);

        gotoRegisterLabel = new JLabel("Belum Memiliki Akun?");
        gotoRegisterLabel.setBounds(115,105,250,125);
        gotoRegisterLabel.setForeground(Color.black);
        panel.add(gotoRegisterLabel);

        goToRegisterButton = new JButton("Daftar");
        goToRegisterButton.setBounds(140,195,85,25);
        goToRegisterButton.setForeground(Color.black);
        goToRegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Register register = new Register();
                    register.initialize();
                    frame.dispose();
                } catch(Exception exception) {
                    System.out.println(exception.getMessage());
                }
            }
        });
        panel.add(goToRegisterButton);

        frame.setVisible(true);
    }
}