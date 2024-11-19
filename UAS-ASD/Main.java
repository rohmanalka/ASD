import java.util.Scanner;

public class Main {
    static BarangRental[] daftarBarang = new BarangRental[10];
    static TransaksiRental[] daftarTransaksi = new TransaksiRental[10];
    static int jumlahBarang = 0;
    static int jumlahTransaksi = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasiDataBarang();
        menuUtama();
    }

    public static void inisialisasiDataBarang() {
        daftarBarang[jumlahBarang++] = new BarangRental("N 3589 AAA", "Honda Beat", "Motor", 2015, 25000);
        daftarBarang[jumlahBarang++] = new BarangRental("N 4971 BBB", "Yamaha Aerox", "Motor", 2019, 25000);
        daftarBarang[jumlahBarang++] = new BarangRental("N 1283 CCC", "Land Cruisher", "Mobil", 2018, 40000);
        daftarBarang[jumlahBarang++] = new BarangRental("L 8890 DDD", "BMW e36", "Mobil", 2001, 40000);
        daftarBarang[jumlahBarang++] = new BarangRental("L 8102 EEE", "Mercy e200", "Mobil", 2002, 40000);
    }

    public static void menuUtama() {
        int pilihan;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan Transaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    lihatDataBarang();
                    break;
                case 2:
                    tambahTransaksi();
                    break;
                case 3:
                    lihatTransaksi();
                    break;
                case 4:
                    menuUrutkanTransaksi();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void lihatDataBarang() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  DAFTAR KENDARAAN RENTAL ROHMANALKA  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("| %-15s | %-20s | %-10s | %-8s | %-20s | %-15s |\n", 
                          "Nomor TNKB", "Nama Kendaraan", "Jenis", "Tahun", "Biaya Sewa Perjam", "Status");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    
        for (int i = 0; i < jumlahBarang; i++) {
            BarangRental br = daftarBarang[i];
            String status = br.tersedia ? "Tersedia" : "Tidak Tersedia";
            System.out.printf("| %-15s | %-20s | %-10s | %-8d | %-20d | %-15s |\n", 
                              br.noTNKB, br.namaKendaraan, br.jenisKendaraan, br.tahun, br.biayaSewa, status);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public static void tambahTransaksi() {
        System.out.println("\n~~~ Tambah Transaksi ~~~");
        System.out.print("Nama Peminjam: ");
        String namaPeminjam = scanner.nextLine();
        System.out.print("Masukkan Nomer TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Lama Pinjam (jam): ");
        int lamaPinjam = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Apakah Member (ya/tidak): ");
        boolean isMember = scanner.nextLine().equalsIgnoreCase("ya");

        BarangRental barang = cariBarang(noTNKB);
        if (barang == null) {
            System.out.println("Kendaraan tidak ditemukan.");
            return;
        }

        if (!barang.tersedia) {
            System.out.println("Gagal, kendaraan sudah dipinjam.");
            return;
        }

        TransaksiRental transaksi = new TransaksiRental(namaPeminjam, lamaPinjam, barang, isMember);
        daftarTransaksi[jumlahTransaksi++] = transaksi;
        barang.tersedia = false;

        System.out.println("Transaksi berhasil.");
        System.out.println("Kode Transaksi: " + transaksi.kodeTransaksi);
        System.out.println("Nama Peminjam: " + transaksi.namaPeminjam);
        System.out.println("Lama Pinjam: " + transaksi.lamaPinjam);
        System.out.println("Total Biaya: " + transaksi.totalBiaya);
    }

    public static BarangRental cariBarang(String noTNKB) {
        for (int i = 0; i < jumlahBarang; i++) {
            BarangRental br = daftarBarang[i];
            if (br.noTNKB.equalsIgnoreCase(noTNKB)) {
                return br;
            }
        }
        return null;
    }

    public static void lihatTransaksi() {
        double totalPendapatan = 0;
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  DAFTAR KENDARAAN TRANSAKSI  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.printf("| %-4s | %-11s | %-15s | %-15s | %-10s | %-17s |\n", "Kode", "No TNKB", "Nama Barang",
                "Nama Peminjam", "Lama Pinjam", "Total Biaya");
        for (int i = 0; i < jumlahTransaksi; i++) {
            TransaksiRental tr = daftarTransaksi[i];
            totalPendapatan += tr.totalBiaya;
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n", tr.kodeTransaksi, tr.br.noTNKB,
                    tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam, tr.totalBiaya);
        }
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.println("TOTAL PENDAPATAN");
        System.out.println("~~~~~~~~~~~~~~~~");
        System.out.printf("Pendapatan hari ini :%.0f\n", totalPendapatan);
    }

    public static void menuUrutkanTransaksi() {
        System.out.println("\nUrutkan Transaksi");
        System.out.println("1. Huruf pertama Nama lengkap A-M, Nomor TNKB secara desc");
        System.out.println("2. Huruf pertama Nama lengkap N-Z, Nama secara desc");
        System.out.print("Pilih(1-2): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); 

        switch (pilihan) {
            case 1:
                urutkanTransaksiByTNKB();
                break;
            case 2:
                urutkanTransaksiByNama();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void urutkanTransaksiByTNKB() {
        TransaksiRental[] transaksiAM = new TransaksiRental[jumlahTransaksi];
        int countAM = 0;

        for (int i = 0; i < jumlahTransaksi; i++) {
            if (daftarTransaksi[i].namaPeminjam.matches("^[A-Ma-m].*")) {
                transaksiAM[countAM++] = daftarTransaksi[i];
            }
        }

        for (int i = 0; i < countAM - 1; i++) {
            for (int j = 0; j < countAM - i - 1; j++) {
                if (transaksiAM[j].br.noTNKB.compareTo(transaksiAM[j + 1].br.noTNKB) < 0) {
                    TransaksiRental temp = transaksiAM[j];
                    transaksiAM[j] = transaksiAM[j + 1];
                    transaksiAM[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < countAM; i++) {
            TransaksiRental tr = transaksiAM[i];
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n",
                    tr.kodeTransaksi, tr.br.noTNKB, tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam,
                    tr.totalBiaya);
        }
    }

    public static void urutkanTransaksiByNama() {
        TransaksiRental[] transaksiNZ = new TransaksiRental[jumlahTransaksi];
        int countNZ = 0;

        for (int i = 0; i < jumlahTransaksi; i++) {
            if (daftarTransaksi[i].namaPeminjam.matches("^[N-Zn-z].*")) {
                transaksiNZ[countNZ++] = daftarTransaksi[i];
            }
        }

        for (int i = 0; i < countNZ - 1; i++) {
            for (int j = 0; j < countNZ - i - 1; j++) {
                if (transaksiNZ[j].namaPeminjam.compareTo(transaksiNZ[j + 1].namaPeminjam) < 0) {
                    TransaksiRental temp = transaksiNZ[j];
                    transaksiNZ[j] = transaksiNZ[j + 1];
                    transaksiNZ[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < countNZ; i++) {
            TransaksiRental tr = transaksiNZ[i];
            System.out.printf("| %-4d | %-11s | %-15s | %-15s | %-10d | %-17.0f |\n",
                    tr.kodeTransaksi, tr.br.noTNKB, tr.br.namaKendaraan, tr.namaPeminjam, tr.lamaPinjam,
                    tr.totalBiaya);
        }
    }
}