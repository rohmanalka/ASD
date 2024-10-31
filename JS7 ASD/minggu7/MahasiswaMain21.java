package minggu7;
import java.util.Scanner;

public class MahasiswaMain21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = s.nextInt();

        PencarianMhs21 data = new PencarianMhs21(jumlahMahasiswa);
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari Nim terkecil");
        for(int i=0; i < jumlahMahasiswa; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            Mahasiswa21 m = new Mahasiswa21(nim, nama, umur, ipk);
            data.tambah(m);
        }    
        
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
            
        // System.out.println("______________________________________________");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        // System.out.print("NIM\t: ");
        // int cari = s.nextInt();
        // System.out.println("Menggunakan sequential Search");
        // int posisi = data.findSeqSearch(cari);
            
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        // System.out.println("______________________________________________");
        // System.out.println("menggunakan binary search");
        // posisi = data.findBinarySearch(cari, 0, jumlahMahasiswa - 1);
        
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        System.out.println("______________________________________________");
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cari = s.next();

        System.out.println("______________________________________________");
        System. out.println("menggunakan binary Search") ;

        data.countSearchName(cari);
        int posisi = data.FindBinarySearchByName(cari, 0, jumlahMahasiswa - 1);
        data.tampilPosisiNama(cari, posisi);
        data.tampilDataNama (cari, posisi);

    }
}