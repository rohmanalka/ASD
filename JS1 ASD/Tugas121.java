import java.util.Scanner;

public class Tugas121 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array kode plat mobil
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Array nama kota
        char[][] kota = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };

        // Input kode plat nomor
        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = input.next();

        // Mencari nama kota berdasarkan kode plat nomor
        int kodeIndex = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode.charAt(0)) {
                kodeIndex = i;
                break;
            }
        }

        // Menampilkan nama kota
        if (kodeIndex != -1) {
            System.out.print("Kota: ");
            // Akses seluruh elemen baris dengan loop
            for (int j = 0; j < kota[kodeIndex].length; j++) {
                System.out.print(kota[kodeIndex][j]);
            }
            System.out.println();
        } else {
            System.out.println("Kode plat nomor tidak valid!");
        }
    }
}
