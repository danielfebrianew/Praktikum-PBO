package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Page {
    // -- DEKLARASI PANEL & FRAME
    private static JPanel panel;
    private static JFrame frame;

    // -- DEKLARASI LABEL-LABEL
    private static JLabel judulLabel;
    private static JLabel alurLabel;
    private static JLabel penokohanLabel;
    private static JLabel aktingLabel;

    // --DEKLARASI TEXTFIELD-TEXTFIELD
    private static JTextField judulField;
    private static JTextField alurField;
    private static JTextField penokohanField;
    private static JTextField aktingField;

    // -- DEKLARASI TOMBOL-TOMBOL AKSI
    private static JButton tambahButton;
    private static JButton updateButton;
    private static JButton deleteButton;
    private static JButton clearButton;

    // -- DEKLARASI TABEL
    private static JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scroller;
    private static Object namaKolom[] =  {"Judul", "Alur", "Penokohan", "Akting", "Nilai"};

    public void initialize(){
        // -- DEKLARASI PANEL & FRAME
        panel = new JPanel();
        frame = new JFrame();

        // -- SET SIZE & TITLE FRAME
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("Responsi");

        // -- SET WARNA BACKGROUND & LAYOUT PANEL
        panel.setLayout(null);
        panel.setBackground(Color.white);

        // -- SET TEXT LABEL 
        judulLabel = new JLabel("Judul");
        judulLabel.setBounds(510, 20, 90, 20);
        panel.add(judulLabel);

        alurLabel = new JLabel("Alur");
        alurLabel.setBounds(510, 60, 90, 20);
        panel.add(alurLabel);

        penokohanLabel = new JLabel("Penokohan");
        penokohanLabel.setBounds(510, 100, 90, 20);
        panel.add(penokohanLabel);

        aktingLabel = new JLabel("Akting");
        aktingLabel.setBounds(510, 140, 90, 20);
        panel.add(aktingLabel);

        // -- SET TEXT FIELD
        judulField = new JTextField();
        judulField.setBounds(510, 40, 120, 20);
        panel.add(judulField);

        alurField = new JTextField();
        alurField.setBounds(510, 80, 120, 20);
        panel.add(alurField);

        penokohanField = new JTextField();
        penokohanField.setBounds(510, 120, 120, 20);
        panel.add(penokohanField);

        aktingField = new JTextField();
        aktingField.setBounds(510, 160, 120, 20);
        panel.add(aktingField);

        // -- SET BUTTON
        tambahButton = new JButton("Tambah");
        tambahButton.setBounds(525, 210, 90, 20);
        panel.add(tambahButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(525, 240, 90, 20);
        panel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(525, 270, 90, 20);
        panel.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(525, 300, 90, 20);
        clearButton.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    judulField.setText("");
                    alurField.setText("");
                    penokohanField.setText("");
                    aktingField.setText("");
                }
            }
        );
        panel.add(clearButton);

        // -- DEKLARASI TABEL
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        panel.add(tabel);

        // -- DEKLARASI SCROLLPANE TABEL
        scroller = new JScrollPane(tabel);
        panel.add(scroller);

        // -- SET VISIBILITY FRAME
        frame.setLocationRelativeTo(null); // -- BIKIN WINDOW PROGRAM DI TENGAH LAYAR
        frame.setVisible(true); // -- MEMUNCULKAN WINDOW
    }

    public String getJudul(){
        return judulField.getText();
    }
    
    public String getAlur(){
        return alurField.getText();
    }
    
    public String getPenokohan(){
        return penokohanField.getText();
    }
    
    public String getAkting(){
        return aktingField.getText();
    }

}
