package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        boolean ulang;
        
        do {
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih :");
            int inputPilihan = userInput.nextInt();
            
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
            int inputUlangi = userInput.nextInt();
            
            if(inputUlangi == 1) {
                ulang = true;
            } else {
                ulang = false;
            }
            
        }while (ulang == true);  
    }
    
    static void hitungBalok() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("\nInput Panjang : ");
        int inputPanjangB = userInput.nextInt();
        System.out.print("Input Lebar : ");
        int inputLebarB = userInput.nextInt();
        System.out.print("Input Tinggi : ");
        int inputTinggiB = userInput.nextInt();
        System.out.println("\n");

//        System.out.println("Luas Persegi Panjang =" + luasPP " m");
//        System.out.println("Keliling Persegi Panjang =" + kelilingPP " m");
//        System.out.println("Volume Balok =" + volumeB " m");
//        System.out.println("Luas Permukaan Balok =" + luasPermukaanB " m"); 
    }
    
    static void hitungTabung() {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nInput Tinggi : ");
        int inputTinggiT = userInput.nextInt();
        System.out.print("Input Jari-jari : ");
        int inputJariJariT = userInput.nextInt();
        System.out.println("\n");

//        System.out.println("Luas Lingkaran =" + luasL " m");
//        System.out.println("Keliling Lingkaran =" + kelilingL  " m");
//        System.out.println("Volume Tabung =" + volumeT " m");
//        System.out.println("Luas Permukaan Tabung =" + luasPermukaanT " m");
    }
}
