package Prog1;
import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        LinkedList21 list = new LinkedList21();
        list.add(new Mahasiswa21("001", "Alice", "01-01-2000"));
        list.add(new Mahasiswa21("002", "Bob", "02-02-2001"));
        list.add(new Mahasiswa21("003", "Charlie", "03-03-2002"));
        list.add(new Mahasiswa21("004", "David", "04-04-2003"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Tampilkan Semua Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    list.add(new Mahasiswa21(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    list.delete(nim);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    Mahasiswa21 mhs = list.get(nim);
                    if (mhs != null) {
                        System.out.println(mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (choice != 5);
    }
}