import java.util.Scanner;

public class Pemilihan21 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      double tugas, kuis, uas, uts;
      double nilaiAkhir;
      String nilaiHuruf = "";
      String ket = "";

      System.out.print("Masukkan nilai Tugas: ");
      tugas = sc.nextDouble();
      System.out.print("Masukkan nilai Kuis: ");
      kuis = sc.nextDouble();
      System.out.print("Masukkan nilai UTS: ");
      uts = sc.nextDouble();
      System.out.print("Masukkan nilai UAS: ");
      uas = sc.nextDouble();
      System.out.println("====================");

      nilaiAkhir = tugas*0.2 + kuis*0.2 + uts*0.3 + uas*0.3;

      if (nilaiAkhir < 80 | nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            ket = "LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir < 73 | nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            ket = "LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir < 65 | nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            ket = "LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir < 60 | nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            ket = "LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir < 50 | nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            ket = "LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir < 39 | nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            ket = "TIDAK LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
            ket = "TIIDAK LULUS";
            System.out.println("Nilai Akhir: "+ nilaiAkhir);
            System.out.println("Nilai Huruf: "+ nilaiHuruf);
            System.out.println("====================");
            System.out.println("Keterangan: "+ ket);
            System.out.println("====================");
      } else {
            System.out.println("====================");
            System.out.print("Nilai Tidak Valid");
            System.out.println("====================");
      }
    }
}
