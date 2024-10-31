import java.util.Scanner;

public class Fungsi21 {

    public static String[][] dataStok = {
        {"RoyalGarden 1", "Aglonema", "10"},
        {"RoyalGarden 1", "Keladi", "5"},
        {"RoyalGarden 1", "Alocasia", "15"},
        {"RoyalGarden 1", "Mawar", "7"},
        {"RoyalGarden 2", "Aglonema", "6"},
        {"RoyalGarden 2", "Keladi", "11"},
        {"RoyalGarden 2", "Alocasia", "9"},
        {"RoyalGarden 2", "Mawar", "12"},
        {"RoyalGarden 3", "Aglonema", "2"},
        {"RoyalGarden 3", "Keladi", "10"},
        {"RoyalGarden 3", "Alocasia", "10"},
        {"RoyalGarden 3", "Mawar", "5"},
        {"RoyalGarden 4", "Aglonema", "5"},
        {"RoyalGarden 4", "Keladi", "7"},
        {"RoyalGarden 4", "Alocasia", "12"},
        {"RoyalGarden 4", "Mawar", "9"}
    };

    static int[] bungaRusak = {-1, -2, 0, -5};
    static int[] hargaBunga = {75000, 50000, 60000, 100000};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("=== Royal Garden ===");
            System.out.println("1. Cek Stok Royal Garden 4");
            System.out.println("2. Cek Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    cekStok();
                    break;
                case 2:
                    cekPendapatan();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    static void cekStok () {
        for (int i = 0; i < dataStok.length; i++) {
            if (dataStok[i][0].equals("RoyalGarden 4")) {
                String namaBunga = dataStok[i][1];
                int stokAwal = Integer.parseInt(dataStok[i][2]);
                int bungaMati = bungaRusak[i % bungaRusak.length]; // Menggunakan operasi modulo
                int stokAkhir = stokAwal + bungaMati;
                System.out.println("======STOK ROYAL GARDEN 4======");
                System.out.println(" - " + namaBunga + ": ");
                System.out.printf("Stok sisa: " + stokAwal + "-" + bungaMati + " = " + stokAkhir);
                System.out.println();
            }
        }
    }
    
    
    static void cekPendapatan() {
        System.out.println("Pendapatan setiap cabang:");
        for (int i = 0; i < dataStok.length; i += 4) {
            String namaCabang = dataStok[i][0];
            int pendapatan = hitungPendapatanCabang(namaCabang);
            System.out.println(namaCabang + ": Rp" + pendapatan);
        }
    }
    
    static int hitungPendapatanCabang(String namaCabang) {
        int pendapatan = 0;
        for (int i = 0; i < dataStok.length; i++) {
            if (dataStok[i][0].equals(namaCabang)) {
                int stok = Integer.parseInt(dataStok[i][2]);
                int harga = getHargaBunga(dataStok[i][1]);
                pendapatan += stok * harga;
            }
        }
        return pendapatan;
    }

    static int getHargaBunga(String namaBunga) {
        for (int i = 0; i < dataStok.length; i++) {
            if (namaBunga.equals(dataStok[i][1])) {
                int indexHarga = i % 4; // Untuk mendapatkan indeks harga bunga yang sesuai dengan indeks dalam array hargaBunga
                return hargaBunga[indexHarga];
            }
        }
        return -1; // Jika bunga tidak ditemukan, mengembalikan -1
    }
}
