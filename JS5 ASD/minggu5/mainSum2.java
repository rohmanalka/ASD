package minggu5;
import java.util.Scanner;

public class mainSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total Perusahaan (Satuan Juta, Misal 5.9) ");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        sum[] companies = new sum[numCompanies]; // Array untuk menyimpan data perusahaan

        // Memasukkan data keuntungan untuk setiap perusahaan
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("===============================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.print("Masukkan jumlah bulan untuk perusahaan " + (i + 1) + ": ");
            int months = sc.nextInt();
            companies[i] = new sum(months); // Membuat objek sum untuk setiap perusahaan

            for (int j = 0; j < companies[i].elemen; j++) {
                System.out.print("Masukkan keuntungan bulan ke- " + (j + 1) + " untuk perusahaan " + (i + 1) + " : ");
                companies[i].keuntungan[j] = sc.nextDouble();
            }
        }

        // Menampilkan total keuntungan untuk setiap perusahaan
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("===============================================================");
            System.out.println("Perusahaan " + (i + 1));
            System.out.println("===============================================================");
            System.out.println("Algoritma Brute Force ");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n", companies[i].elemen, companies[i].totalBF(companies[i].keuntungan));

            System.out.println("===============================================================");
            System.out.println("Algoritma Divide Conquer ");
            System.out.printf("Total keuntungan perusahaan selama %d bulan adalah = %.2f\n", companies[i].elemen, companies[i].totalDC(companies[i].keuntungan, 0, companies[i].elemen - 1));
        }
    }
}
