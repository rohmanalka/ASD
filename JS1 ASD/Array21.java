import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMatKul;
        String[] namaMK, nilaiHuruf;
        int[] nilaiAngka;
        double[] bobotNilai, sks;
        double ip = 0;
        double totBobotNilai = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        jmlMatKul = sc.nextInt();

        namaMK = new String[jmlMatKul];
        nilaiAngka = new int[jmlMatKul];
        nilaiHuruf = new String[jmlMatKul];
        bobotNilai = new double[jmlMatKul];
        sks = new double[jmlMatKul];

        for (int i = 0; i < jmlMatKul; i++) {
            System.out.printf("Masukkan nama mata kuliah: ", i + 1);
            namaMK[i] = sc.next();
            System.out.printf("Masukkan nilai untuk: ", namaMK[i]);
            nilaiAngka[i] = sc.nextInt();
            System.out.printf("Masukkan bobot SKS untuk: ", namaMK[i]);
            sks[i] = sc.nextDouble();
        }

        for (int i = 0; i < jmlMatKul; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        for (int i = 0; i < jmlMatKul; i++) {
            ip += bobotNilai[i] * sks[i];
            totBobotNilai += sks[i];
        }

        ip /= totBobotNilai;

        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Hitung IP");
        System.out.println("-------------------------------------");
        for (int i = 0; i < jmlMatKul; i++) {
            System.out.println("Matakuliah "+ namaMK[i]+": "+nilaiAngka[i]);
        }
        System.out.println();
        System.out.println("Hasil Nilai");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("| %-30s | %-10s | %-10s | %-10s |\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < jmlMatKul; i++) {
            System.out.printf("| %-30s | %-10s  | %-10s  | %-10s  | \n", namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("IP : %.2f\n", ip);
    }
}