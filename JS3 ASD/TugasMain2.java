import java.util.Scanner;
public class TugasMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah anggota: ");
        int anggota = sc.nextInt();
        
        Tugas2[] tugas2 = new Tugas2[anggota];

        for (int i = 0; i < tugas2.length; i++) {
            System.out.println("Masukkan anggota ke- " + (i+1));
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Jurusan: ");
            String jurusan = sc.next();
            System.out.print("No. Hp: ");
            String noHp = sc.next();

            tugas2[i] = new Tugas2(nama, nim, jurusan, noHp);
        }

        for (Tugas2 angt : tugas2) {
            angt.tampilInfo();

        }
    }
}
