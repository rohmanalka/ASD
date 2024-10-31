import java.util.Scanner;
public class TugasMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int mahasiswa = sc.nextInt();

        Tugas1[] tugas1 = new Tugas1[mahasiswa];

        for (int i = 0; i < tugas1.length; i++) {
            System.out.println("Mahasiswa ke- " + (i+1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jenis Kelamin: ");
            String kelamin = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            tugas1[i] = new Tugas1(nama, nim, kelamin, ipk);

            System.out.println("==============");
        }

        double TotIpk = 0;
        for (Tugas1 mhs : tugas1) {
            TotIpk += mhs.getIpk();
        }
        double rataRata = TotIpk / tugas1.length;  

        System.out.println("DATA MAHASISWA");
        System.out.println("==============");
        for (Tugas1 mhs : tugas1) {
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("NIM: " + mhs.getNim());
            System.out.println("Jenis Kelamin: " + mhs.getKel());
            System.out.println("IPK: " + mhs.getIpk());
            System.out.println();
        }
        System.out.println(rataRata);
    }
}
