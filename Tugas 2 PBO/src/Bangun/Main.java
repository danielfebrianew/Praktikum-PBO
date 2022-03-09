package Bangun;

import Bangun.Balok;
import Bangun.Tabung;
import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean ulang;
        
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih :");
            double inputPilihan = userInput.nextInt();
            
            if (inputPilihan == 1) {
               hitungBalok();
            } else if (inputPilihan == 2) {
                hitungTabung();
            } else if (inputPilihan == 0) {
                System.out.println("Terimakasih telah menggunakan program!");
            } else {
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                ulang = true;
            }
            
            System.out.println("Ulangi? (Ya : 1 || Tidak : 0)");
            double inputUlangi = userInput.nextInt();
            
            if(inputUlangi == 1) {
                ulang = true;
            } else {
                ulang = false;
            }
            
        }while (ulang == true);  
    }
    
    static void hitungBalok() {
        System.out.print("\nInput Panjang : ");
        double inputPanjangB = userInput.nextInt();
        System.out.print("Input Lebar : ");
        double inputLebarB = userInput.nextInt();
        System.out.print("Input Tinggi : ");
        double inputTinggiB = userInput.nextInt();
        System.out.println("\n");
        Balok balok = new Balok(inputPanjangB, inputLebarB, inputTinggiB);
        balok.display();
    }
    
    static void hitungTabung() {
        System.out.print("\nInput Tinggi : ");
        double inputTinggiT = userInput.nextInt();
        System.out.print("Input Jari-jari : ");
        double inputJariJariT = userInput.nextInt();
        System.out.println("\n");
        Tabung tabung = new Tabung(inputJariJariT, inputTinggiT);
        tabung.display();
    }
}
