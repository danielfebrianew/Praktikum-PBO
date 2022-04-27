import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean loopJenisMhs = false;
        Scanner input = new Scanner(System.in);

        System.out.println("+---------------------------------+");
        System.out.println("| Pendaftaran Beasiswa PT. Bening |");
        System.out.println("+---------------------------------+");
        System.out.print("\n");
        System.out.println("Terdapat 2 program beasiswa yang dibuka: ");
        System.out.println("\t1. Beasiswa Pelajar");
        System.out.println("\t2. Beasiswa Mahasiswa");
        System.out.print("Pilih beasiswa yang ingin didaftar: ");
        
        double jenisBeasiswa = input.nextDouble();

        do {
            if(jenisBeasiswa == 1) {
                System.out.println("\n");
                System.out.println("+--------------------------+");
                System.out.println("| FORM PENDAFTARAN PELAJAR |");
                System.out.println("+--------------------------+");
                System.out.print("\n");
                System.out.print("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                namaLengkap += input.nextLine();
                System.out.print("Usia\t\t: ");
                int usia = input.nextInt();

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
                System.out.print("Nilai Struktur dan Konten Esai : ");
                double nilaiPelajar1 = input.nextDouble();
                System.out.print("Nilai Teknik Visualisasi : ");
                double nilaiPelajar2 = input.nextDouble();
                System.out.print("Nilai Kemampuan Design Thinking : ");
                double nilaiPelajar3 = input.nextDouble();

                Pelajar pelajar = new Pelajar(namaLengkap,usia,nilaiPelajar1,nilaiPelajar2,nilaiPelajar3);

                while(true) {
                    System.out.println("\n");
                    System.out.println("+------+");
                    System.out.println("| MENU |");
                    System.out.println("+------+");
                    System.out.print("\n");
                    System.out.println("\t1. Tampilkan Hasil");
                    System.out.println("\t2. Ubah Nilai");
                    System.out.println("\t3. Keluar");
                    System.out.print("Pilih: ");
                    double pilih = input.nextDouble();

                    if(pilih == 1) {
                        pelajar.display();
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.print("Nilai Struktur dan Konten Esai : ");
                        double tempPelajar1 = input.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi : ");
                        double tempPelajar2 = input.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking : ");
                        double tempPelajar3 = input.nextDouble();

                        pelajar.setNilaiPelajar(tempPelajar1,tempPelajar2,tempPelajar3);
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                    }
                    loopJenisMhs = false;
                }
            } else if (jenisBeasiswa == 2) {
                System.out.println("\n");
                System.out.println("+----------------------------+");
                System.out.println("| FORM PENDAFTARAN MAHASISWA |");
                System.out.println("+----------------------------+");
                System.out.print("\n");
                System.out.print("Nama Lengkap\t: ");
                String namaLengkap = input.next();
                namaLengkap += input.nextLine();
                System.out.print("Usia\t\t: ");
                int usia = input.nextInt();

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
                System.out.print("Nilai Struktur dan Konten Jurnal : ");
                double nilaiMhs1 = input.nextDouble();
                System.out.print("Nilai Relevansi Data : ");
                double nilaiMhs2 = input.nextDouble();
                System.out.print("Nilai Kemampuan Problem Solving : ");
                double nilaiMhs3 = input.nextDouble();

                Mahasiswa mahasiswa = new Mahasiswa(namaLengkap,usia,nilaiMhs1,nilaiMhs2,nilaiMhs3);
                
                System.out.println("\n");
                System.out.println("+------+");
                System.out.println("| MENU |");
                System.out.println("+------+");
                System.out.print("\n");
                System.out.println("\t1. Tampilkan Hasil");
                System.out.println("\t2. Ubah Nilai");
                System.out.println("\t3. Keluar");
                System.out.print("Pilih: ");
                double pilih = input.nextDouble();

                while(true) {
                    if(pilih == 1) {
                        mahasiswa.display();
                    } else if (pilih == 2) {
                        System.out.println("\n");
                        System.out.println("+------+");
                        System.out.println("| EDIT |");
                        System.out.println("+------+");
                        System.out.println("\n");

                        System.out.println("Keterangan: Nilai yang valid berada diantara 0 - 100");
                        System.out.println("\n");
                        System.out.print("Nilai Struktur dan Konten Esai : ");
                        double tempNilai1 = input.nextDouble();
                        System.out.print("Nilai Teknik Visualisasi : ");
                        double tempNilai2 = input.nextDouble();
                        System.out.print("Nilai Kemampuan Design Thinking : ");
                        double tempNilai3 = input.nextDouble();

                        mahasiswa.setNilaiMhs(tempNilai1,tempNilai2,tempNilai3);
                    } else if (pilih == 3) {
                        System.exit(0);
                    } else {
                        System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");
                    }

                    loopJenisMhs = false;
                }
            } else {
                System.out.println("Input yang anda masukkan salah, silakan masukkan kembali!");

                loopJenisMhs = true; 
            }
        } while (loopJenisMhs == true);
        input.close();
    }
}
