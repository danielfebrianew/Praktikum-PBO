import java.util.Scanner;

public class Main {
    static Konversi konversi;
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("+-----------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU |");
        System.out.println("+-----------------------+");
        
        boolean ulang;
        
        do {
            ulang = false;
            
            System.out.println("\n");

            System.out.print("Input Suhu dalam Celsius : ");
            double inputSuhu = userInput.nextInt();
            
            konversi = new Konversi(inputSuhu);
            
            System.out.println("\n");

            System.out.println("+------+");
            System.out.println("| Opsi |");
            System.out.println("+------+");

            System.out.println("\n");

            System.out.println("1. Lihat data konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            int inputPilihan = userInput.nextInt();

            if (inputPilihan == 1) {
               lihatData();
            } else if (inputPilihan == 2) {
                ulang = true;
            } else if (inputPilihan == 3) {
                System.out.println("Terimakasih telah menggunakan program!");
            } else {
                System.out.println("Opsi tidak ada. Mohon masukkan opsi dengan benar!");
                ulang = true;
            }
        }while (ulang == true);
    }
        
    static void lihatData() {
        String derajat = "\u00b0";
        
        System.out.println("\n");
        System.out.println("Suhu dalam Celsius : " + konversi.suhuC + derajat + " C");
        System.out.println("Suhu dalam Fahrenheit : " + konversi.fahrenheit() + derajat + " F");
        System.out.println("Suhu dalam Reamur : " + konversi.reamur() + derajat + " R");
        System.out.println("Suhu dalam Kelvin : " + konversi.kelvin() + " K");
                
        if (konversi.suhuC <= 0) {
            System.out.println("Kondisi Air Beku");
        } else if ((konversi.suhuC > 0) && (konversi.suhuC < 100)) {
            System.out.println("Kondisi Air Normal");
        } else if (konversi.suhuC >= 100) {
            System.out.println("Kondisi Air Mendidih");
        }
    }
}
