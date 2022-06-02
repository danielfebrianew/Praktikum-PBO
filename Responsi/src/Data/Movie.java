package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Connection.Connector;

public class Movie {
    public class ModelMovie {
        Connector koneksi = new Connector();
    
        public String[][] MovieList(){
        
        try{
                int jmlData = 0;
                
                String data[][] = new String[getBanyakData()][5]; 
                String query = "select * from movie"; 
                PreparedStatement ptsm = koneksi.koneksi.prepareStatement(query);
                koneksi.statement = koneksi.koneksi.createStatement();
                ResultSet resultSet = ptsm.executeQuery(query);
                while (resultSet.next()){
                    data[jmlData][0] = resultSet.getString("judul"); //harus sesuai nama kolom di mysql
                    data[jmlData][1] = resultSet.getString("alur");                
                    data[jmlData][2] = resultSet.getString("penokohan");
                    data[jmlData][3] = resultSet.getString("akting");
                    data[jmlData][4] = resultSet.getString("nilai");
                    jmlData++;
                }
                return data;
                   
            }catch(SQLException e){
                System.out.println(e.getMessage());
                System.out.println("Database Error!");
            }
        return null;
        }
    
        public void insertmovie(String judul, String alur, String penokohan, String akting){
         int jmlData = 0;
         double alurField = Float.parseFloat(alur);
         double penokohanField = Float.parseFloat(penokohan);
         double aktingField = Float.parseFloat(akting);
         double nilai = (alurField + penokohanField +aktingField)/3;
            try {
               String query = "select * from movie where judul = '" + judul + "' "; 
               System.out.println(judul + " " + alurField + " " + penokohanField + " " + aktingField + " " + nilai);
               PreparedStatement ptsm = koneksi.koneksi.prepareStatement(query);
               koneksi.statement = koneksi.koneksi.createStatement();
               ResultSet resultSet = ptsm.executeQuery(query);
               while (resultSet.next()){ 
                    jmlData++;
                }
                
                if (jmlData == 0) {
                    query = "insert into movie values('" + judul + "','" + alurField + "','" + penokohanField + "','" + aktingField + "','" + nilai + "')";
                    koneksi.statement = koneksi.koneksi.createStatement();
                    ptsm.executeUpdate();
                    System.out.println("Berhasil ditambahkan");
                    JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Data sudah ada");
                }
            } catch (Exception sql) {
                System.out.println(sql.getMessage());   
                JOptionPane.showMessageDialog(null, sql.getMessage());
            }
        
        
        }
        
        public void updateMovie(String judul, String alur, String penokohan, String akting){
            int jmlData = 0;
            double alurField = Float.parseFloat(alur);
            double penokohanField = Float.parseFloat(penokohan);
            double aktingField = Float.parseFloat(akting);
            double nilai = (alurField + penokohanField +aktingField)/3; 
            try {
               String query = "select * from movie where judul = ? "; 
               PreparedStatement ptsm = koneksi.koneksi.prepareStatement(query);
               koneksi.statement = koneksi.koneksi.createStatement();
               ResultSet resultSet = ptsm.executeQuery(query);
               ptsm.setString(1, judul);
               while (resultSet.next()){ 
                    jmlData++;
                }
               
                 if (jmlData == 1) {
                    query = "update movie set alur ='" + alurField + "', penokohan='" + penokohanField + "', nilai='" + nilai + "', akting = '" + akting +"' WHERE judul='" + judul +"'";
                    koneksi.statement = koneksi.koneksi.createStatement();
                    ptsm.executeUpdate();//execute querynya
                    System.out.println("Berhasil diupdate");
                    JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
                 }
                 else {
                     JOptionPane.showMessageDialog(null, "Data Tidak Ada");
                 }
               
            } catch (Exception sql) {
                System.out.println(sql.getMessage());   
                JOptionPane.showMessageDialog(null, sql.getMessage());
            }
        }
    
    public int getBanyakData(){
            int jmlData = 0;
            try{
                String query = "Select * from movie";
                PreparedStatement ptsm = koneksi.koneksi.prepareStatement(query);
                koneksi.statement = koneksi.koneksi.createStatement();
                ResultSet resultSet = ptsm.executeQuery(query);
                while (resultSet.next()){ 
                    jmlData++;
                }
                return jmlData;
            }catch(SQLException e){
                System.out.println(e.getMessage());
                System.out.println("Banyak Data Error");
                return 0;
            }
        }
    
     public void deleteMovie (String judul) {
            try{
                String query = "delete from movie where judul = ?";
                PreparedStatement pstm = koneksi.koneksi.prepareStatement(query);
                koneksi.statement = koneksi.koneksi.createStatement();
                pstm.setString(1, judul);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            }catch(SQLException sql) {
                System.out.println(sql.getMessage());
            }
        }
    }
}
