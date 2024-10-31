package Praktikum8;
import java.util.Scanner;

public class strBelanjaMain21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("          Struk Belanja           ");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.print("Masukkan Banyak Struk: ");
        int banyak = sc.nextInt();
        System.out.println();
        belanja21 blj = new belanja21(banyak);

        int totalHarga = 0;
        int jml, harga;

        for (int i = 0; i < banyak; i++) {
            System.out.print("Nomor Transaksi: ");
            int nt =sc.nextInt();
            System.out.print("Tanggal Pembelian: ");
            String tanggal =sc.next();
            System.out.print("Nama Barang: ");
            String nb =sc.next();
            System.out.print("Jumlah Barang: ");
            jml = sc.nextInt();
            System.out.print("Harga Barang: ");
            harga = sc.nextInt();

            totalHarga =jml * harga;
            strBelanja21 sb =new strBelanja21(nt, tanggal, nb, jml,harga);
            blj.push(sb);
            System.out.print("Total Harga: "+ totalHarga);
            System.out.println("\n");
        }

        char pilih;
        do {
            System.out.println("------------------------------------");
            System.out.println("             PILIHAN MENU           ");
            System.out.println("------------------------------------");
            System.out.println(" 1. menampilkan struk teratas\n 2. ambil 5 struk untuk mendapatkan kupon\n 3. lihat sisa struk\n 4. keluar\n");
                
            System.out.print("Pilih Menu (masukkan angka 1-4)");
            int pilihan =sc.nextInt();
            System.out.println("------------------------------------------------");
            
            switch (pilihan) {
                case 1:
                    blj.peek();
                    blj.print();
                    break;

                case 2:
                    blj.pop();
                    blj.pop();
                    blj.pop();
                    blj.pop();
                    blj.pop();
                    break;

                case 3:
                    blj.print();
                    break;

                case 4:
                    System.out.println("Terima Kasih");
                    break;

                default:
                    System.out.println("Menu yang anda masukkan salah");
                    break;

            } if(pilihan == 4) {
                    pilih = 't';
            } else {
                    System.out.print("Kembali ke menu Utama (y/t) : ");
                    pilih = sc.next().charAt(0);
            }
        } while(pilih == 'y');
    }
}