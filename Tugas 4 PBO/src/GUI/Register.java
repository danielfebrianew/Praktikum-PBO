package GUI;

import Connection.Connector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.*;

public class Register {
    // Deklarasi Panel & Frame
    private static JPanel panel;
    private static JFrame frame;

    // Deklarasi Tombol & Label Register
    private static JLabel userLabelRegister;
    private static JTextField userTextRegister;
    private static JLabel passwordLabelRegister;
    private static JPasswordField passwordTextRegister;
    private static JButton registerButton;

    // Deklarasi Tombol Navigasi Register & Login
    private static JLabel goToLoginLabel;
    private static JButton gotToLoginButton;

    public void initialize() {
        Connector connector = new Connector();

        // Instansiasi Panel dan Frame
        panel = new JPanel();
        frame = new JFrame();
        
        // Set Size Frame, Title Frame dan add Panel ke Frame
        frame.setSize(375, 285);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Register - 123200120");

        // Set Warna Background dan Layout Panel
        panel.setLayout(null);
        panel.setBackground(Color.white);

         // ----REGISTER
         userLabelRegister = new JLabel("Username");
         userLabelRegister.setBounds(10,20,80,25);
         panel.add(userLabelRegister);
         // userLabelRegister.setFont(mainFont);
         userLabelRegister.setForeground(Color.black);
 
         userTextRegister = new JTextField(20);
         userTextRegister.setBounds(100,20,165,25);
         panel.add(userTextRegister);
 
         passwordLabelRegister = new JLabel("Password");
         passwordLabelRegister.setBounds(10,60,80,25);
         panel.add(passwordLabelRegister);
         // passwordLabelRegister.setFont(mainFont);
         passwordLabelRegister.setForeground(Color.black);
 
         passwordTextRegister = new JPasswordField();
         passwordTextRegister.setBounds(100,60,165,25);
         panel.add(passwordTextRegister);
 
         registerButton = new JButton("Daftar");
         registerButton.setBounds(135,105,90,25);
         registerButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                int jumlah = 0;
                String username = userTextRegister.getText();
                String password = new String(passwordTextRegister.getPassword());
                Boolean textFieldKosong = false;
                Boolean usernameSama = false;
                 try {
                    // -- MENGECEK APAKAH TEXT FIELD ADA ISINYA
                    if((username.isEmpty()) || (password.isEmpty())) {
                        textFieldKosong = true;
                    }

                    // System.out.println(textFieldKosong);

                    if(textFieldKosong == false) {
                        // ---MENGECEK USERNAME YANG SAMA
                        String data[][] = new String[100][3]; // reminder : getJumlahData tu while loop kaya di bawah make resultSet.next() dengan int jumlah++ doang
                        String querySelect = "select * from users";
                        PreparedStatement pstmtSelect = connector.koneksi.prepareStatement(querySelect);
                        connector.statement = connector.koneksi.createStatement();
                        ResultSet resultSet = pstmtSelect.executeQuery(querySelect);
                        while (resultSet.next()) {
                            data[jumlah][0] = String.valueOf(resultSet.getInt("id")); // ngambil int jadikan string
                            data[jumlah][1] = resultSet.getString("username"); // ngambil string
                            data[jumlah][2] = resultSet.getString("password");
                            if(data[jumlah][1].equals(username)) {
                                usernameSama = true;
                                break;
                            }
                            jumlah++;
                        }

                        if(usernameSama == true) {
                            JOptionPane.showMessageDialog(frame, "Username Telah Digunakan!");
                            userTextRegister.setText("");
                            passwordTextRegister.setText("");
                        } else {
                            // --INSERT QUERY
                            String queryInsert = "insert into users(username, password) values (?,?)";
                            PreparedStatement pstmtInsert = connector.koneksi.prepareStatement(queryInsert);
                            // pstmtInsert.setString(0, "1"); index 0 tidak jadi digunakan karena udh autoincrement di db
                            pstmtInsert.setString(1, getUsernameRegister());
                            pstmtInsert.setString(2, getPasswordRegister());
                            connector.statement = connector.koneksi.createStatement();
                            pstmtInsert.executeUpdate();
                            JOptionPane.showMessageDialog(frame, "Registrasi Berhasil!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "Username/Password tidak boleh kosong!");
                        userTextRegister.setText("");
                        passwordTextRegister.setText("");
                    }
                 } catch(Exception exception) {
                    System.out.println(exception.getMessage());
                 }
             }
         });
         panel.add(registerButton);
         registerButton.setForeground(Color.black);

        goToLoginLabel = new JLabel("Sudah Memiliki Akun?");
        goToLoginLabel.setBounds(120,105,250,125);
        goToLoginLabel.setForeground(Color.black);
        panel.add(goToLoginLabel);

        gotToLoginButton = new JButton("Masuk");
        gotToLoginButton.setBounds(137,195,85,25);
        gotToLoginButton.setForeground(Color.black);
        gotToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Login login = new Login();
                    login.initialize();
                    frame.dispose();
                } catch(Exception exception) {
                    System.out.println(exception.getMessage());
                }
            }
        });
        panel.add(gotToLoginButton);
        frame.setVisible(true);
    }

    public String getUsernameRegister() {
        return userTextRegister.getText();
    }

    public String getPasswordRegister() {
        return new String(passwordTextRegister.getPassword());
    }
}
