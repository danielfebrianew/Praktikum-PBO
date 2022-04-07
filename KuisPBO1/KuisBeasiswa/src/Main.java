import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loopJenisMhs = false;
        boolean loop = false;
        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("| Pendaftaran Beasiswa PT. Bening |");
        System.out.println("+---------------------------------+");
        System.out.print("\n");
        System.out.println("Terdapat 2 program beasiswa yang dibuka: ");
        System.out.println("\t1. Beasiswa Pelajar");
        System.out.println("\t2. Beasiswa Mahasiswa");
        System.out.println("Pilih beasiswa yang ingin didaftar: ");
        double jenisBeasiswa = input.nextDouble();

        do {
            if(jenisBeasiswa == 1) {
                System.out.println("\n");
                System.out.println("+--------------------------+");
                System.out.println("| FORM PENDAFTARAN PELAJAR |");
                System.out.println("+--------------------------+");
                System.out.print("\n");
                System.out.println("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                System.out.println("Usia\t: ");
                double usia = input.nextDouble();

                if(usia < 16) {
                    System.out.println("Maaf, Anda terlalu muda untuk bisa mendaftar!");
                    System.exit(0);
                } else if(usia > 24) {
                    System.out.println("Maaf, anda terlalu tua untuk bisa mendaftar!");
                    System.exit(0);
                }

                System.out.println("\n");
                System.out.println("+----------------+");
                System.out.println("| FORM PENILAIAN |");
                System.out.println("+----------------+");
                System.out.print("\n");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.println("\n");
                System.out.println("Nilai Struktur dan Konten Esai : ");
                double nilaiPelajar1 = input.nextDouble();
                System.out.println("Nilai Teknik Visualisasi : ");
                double nilaiPelajar2 = input.nextDouble();
                System.out.println("Nilai Kemampuan Design Thinking : ");
                double nilaiPelajar3 = input.nextDouble();

                Pelajar pelajar1 = new Pelajar(namaLengkap,usia,nilaiPelajar1,nilaiPelajar2,nilaiPelajar3);
                
                System.out.println("\n");
                System.out.println("+------+");
                System.out.println("| MENU |");
                System.out.println("+------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.println("Pilih: ");
                double pilih = input.nextDouble();

                do {
                    if(pilih == 1) {
                        pelajar1.display();

                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.println("Nilai Struktur dan Konten Esai : ");
                        // double nilaiMhs1 = input.nextDouble();
                        System.out.println("Nilai Teknik Visualisasi : ");
                        // double nilaiMhs2 = input.nextDouble();
                        System.out.println("Nilai Kemampuan Design Thinking : ");
                        // double nilaiMhs3 = input.nextDouble();

                        loop = false;
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                        loop = true;
                    }
                } while(loop == true);

                loopJenisMhs = false;
            } else if (jenisBeasiswa == 2) {
                System.out.println("\n");
                System.out.println("+----------------------------+");
                System.out.println("| FORM PENDAFTARAN MAHASISWA |");
                System.out.println("+----------------------------+");
                System.out.print("\n");
                System.out.println("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                System.out.println("Usia\t: ");
                double usia = input.nextDouble();

                if(usia < 16) {
                    System.out.println("Maaf, Anda terlalu muda untuk bisa mendaftar!");
                    System.exit(0);
                } else if(usia > 24) {
                    System.out.println("Maaf, anda terlalu tua untuk bisa mendaftar!");
                    System.exit(0);
                }

                System.out.println("\n");
                System.out.println("+----------------+");
                System.out.println("| FORM PENILAIAN |");
                System.out.println("+----------------+");
                System.out.print("\n");
                System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                System.out.println("\n");
                System.out.println("Nilai Struktur dan Konten Jurnal : ");
                double nilaiMhs1 = input.nextDouble();
                System.out.println("Nilai Relevansi Data : ");
                double nilaiMhs2 = input.nextDouble();
                System.out.println("Nilai Kemampuan Problem Solving : ");
                double nilaiMhs3 = input.nextDouble();

                Mahasiswa mahasiswa1 = new Mahasiswa(namaLengkap,usia,nilaiMhs1,nilaiMhs2,nilaiMhs3);
                
                System.out.println("\n");
                System.out.println("+------+");
                System.out.println("| MENU |");
                System.out.println("+------+");
                System.out.println("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.println("Pilih: ");
                double pilih = input.nextDouble();

                do {
                    if(pilih == 1) {
                        mahasiswa1.display();

                        loop = false;
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.println("Nilai Struktur dan Konten Esai : ");
                        // double  = input.nextDouble();
                        System.out.println("Nilai Teknik Visualisasi : ");
                        // double nilaiTeknik = input.nextDouble();
                        System.out.println("Nilai Kemampuan Design Thinking : ");
                        // double nilaiKemampuan = input.nextDouble();

                        loop = false;
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                        loop = true;
                    }
                } while(loop == true);

                loopJenisMhs = false;
            } else {
                System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");

                loopJenisMhs = true; 
            }
        } while (loopJenisMhs == true);
    }
}
