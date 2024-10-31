package minggu5;
import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        faktorial[] fk = new faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke- " + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        long startTimeBF = System.currentTimeMillis();
        System.out.println("========================================================");
        System.out.println("Hasil faktorial dengan Brute Force ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long endTimeBF = System.currentTimeMillis();
        double executionTimeBF = (endTimeBF - startTimeBF) / 1000.0;
        System.out.println("Waktu eksekusi Brute Force: " + executionTimeBF + " detik");

        // Pengukuran waktu untuk faktorial dengan Divide and Conquer
        long startTimeDC = System.currentTimeMillis();
        System.out.println("========================================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        long endTimeDC = System.currentTimeMillis();
        double executionTimeDC = (endTimeDC - startTimeDC) / 1000.0;
        System.out.println("Waktu eksekusi Divide and Conquer: " + executionTimeDC + " detik");

        System.out.println("========================================================");
    }
}