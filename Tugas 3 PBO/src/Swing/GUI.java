package Swing;

import javax.swing.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    int inputSquareArea;
    int inputSquareCircumference;
    int inputCuboidVolume;
    int inputCuboidSurfaceArea;

    JLabel text_length = new JLabel("Length");
    JTextField length = new JTextField(15);

    JLabel text_width = new JLabel("Width");
    JTextField width = new JTextField(15);

    JLabel text_height = new JLabel("Height");
    JTextField height = new JTextField(15);

    JLabel result = new JLabel("Result :");

    JLabel squareArea = new JLabel("Square Area");
    String squareAreaString = String.valueOf(inputSquareArea);
    JLabel squareAreaResult = new JLabel(squareAreaString);

    JLabel squareCircumference = new JLabel("Square Circumference");
    String SquareCircumferenceString = String.valueOf(inputSquareCircumference);
    JLabel squareCircumferenceResult = new JLabel(SquareCircumferenceString);

    JLabel cuboidVolume = new JLabel("Cuboid Volume");
    String CuboidVolumeString = String.valueOf(inputCuboidVolume);
    JLabel cuboidVolumeResult = new JLabel(CuboidVolumeString);

    JLabel CuboidSurfaceArea = new JLabel("Cuboid Surface Area");
    String CuboidSurfaceAreaString = String.valueOf(inputCuboidSurfaceArea);
    JLabel CuboidSurfaceAreaResult = new JLabel(CuboidSurfaceAreaString);

    JButton count = new JButton("Count");
    JButton reset = new JButton("Reset");

    //constructor
    public GUI() {
        // title
        setTitle("123200120_DanielFebrianEkaWijaya"); 
        setSize(400,500);

        // set layout
        setLayout(null); 
        add(text_length);
        add(length);
        add(text_width);
        add(width);
        add(text_height);
        add(height);
        add(result);
        add(squareArea);
        add(squareAreaResult);
        add(squareCircumference);
        add(squareCircumferenceResult);
        add(cuboidVolume);
        add(cuboidVolumeResult);
        add(CuboidSurfaceArea);
        add(CuboidSurfaceAreaResult);
        add(count);
        add(reset);

        // set bounds
        text_length.setBounds(10,10,120,20);
        length.setBounds(130,10,150,20);
        text_width.setBounds(10,35,120,20);
        width.setBounds(130,35,150,20);
        text_height.setBounds(10,60,150,20);
        height.setBounds(130,60,150,20);
        result.setBounds(145,90,120,20);
        squareArea.setBounds(10,110,190,20);
        squareAreaResult.setBounds(175,110,120,20);
        squareCircumference.setBounds(10,130,190,20);
        squareCircumferenceResult.setBounds(175,130,120,20);
        cuboidVolume.setBounds(10,150,190,20);
        cuboidVolumeResult.setBounds(175,150,120,20);
        CuboidSurfaceArea.setBounds(10,170,190,20);
        CuboidSurfaceAreaResult.setBounds(175,170,120,20);
        count.setBounds(145,330,120,20);
        reset.setBounds(145,360,120,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == count) {
            length.getText();
            width.getText();
            height.getText();
        }
    }

    static void hitungBalok() {
        Balok balok = new Balok();
        balok.display();
        
    } // MAAF KAK SUDAH MENTOK HEHE :D
}