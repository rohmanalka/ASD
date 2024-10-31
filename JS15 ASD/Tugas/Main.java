package Tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemNilai sistem = new SistemNilai();
        Scanner input = new Scanner(System.in);
        int pilihan;

        // insert data mahasiswa
        sistem.tambahMahasiswa("2001", "Thalhah", "021xxx");
        sistem.tambahMahasiswa("2002", "Zubair", "021xxx");
        sistem.tambahMahasiswa("2003", "Abdur-Rahman", "021xxx");
        sistem.tambahMahasiswa("2004", "Sa'ad", "021xxx");
        sistem.tambahMahasiswa("2005", "Sa'id", "021xxx");
        sistem.tambahMahasiswa("2006", "Ubaidah", "021xxx");

        sistem.tambahMataKuliah("0001", "Internet of Things", 3);
        sistem.tambahMataKuliah("0002", "Algoritma dan Struktur Data", 2);
        sistem.tambahMataKuliah("0003", "Algoritma dan Pemrograman", 2);
        sistem.tambahMataKuliah("0004", "Praktikum Algoritma dan Struktur Data", 3);
        sistem.tambahMataKuliah("0005", "Praktikum Algoritma dan Pemrograman", 3);

        do {
            System.out.println("=======================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("=======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            // System.out.println("5. Tambah Mahasiswa ke Antrian Penghapusan");
            // System.out.println("6. Hapus Mahasiswa dari Antrian");
            // System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();  

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeMk = input.nextLine();
                    System.out.print("Masukkan Nilai: ");
                    double nilai = input.nextDouble();
                    sistem.inputNilai(nim, kodeMk, nilai);
                    break;
                case 2:
                    sistem.tampilNilai();
                    break;
                case 3:
                    System.out.print("Masukkan NIM: ");
                    nim = input.nextLine();
                    sistem.cariNilaiMahasiswa(nim);
                    break;
                case 4:
                    sistem.urutDataNilai();
                    break;
                case 5:
                    return;

                // case 5:
                //     System.out.print("Masukkan NIM Mahasiswa yang akan ditambahkan ke antrian penghapusan: ");
                //     nim = input.nextLine();
                //     sistem.antrianHapusMahasiswa(nim);
                //     break;
                // case 6:
                //     sistem.hapusMahasiswa();
                //     break;
                // case 7:
                //     return;
                default:
                    System.out.println("Pilih antara 1-7.");
            }
        } while (pilihan != 7);
    }
}