package tugas;
import java.util.Scanner;

public class Main2 {
    public static void menu() {
        System.out.println("-------------------------------");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("-------------------------------");
        System.out.println("1. Tambah data awal");
        System.out.println("2. Tambah data akhir");
        System.out.println("3. Tambah data indeks tertentu");
        System.out.println("4. Hapus data pertama");
        System.out.println("5. Hapus data terakhir");
        System.out.println("6. Hapus data tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari id film");
        System.out.println("9. Urut data rating film");
        System.out.println("10. Keluar");
        System.out.println("-------------------------------");
    }

    public static void main(String[] arsc) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList2 dll = new DoubleLinkedList2();

        int pilih;
    
        do {
            menu(); 
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Posisi Awal");
                    System.out.println("-----------------------------");
                    System.out.print("ID : ");
                    int id = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul = sc.next();
                    System.out.print("Rating : ");
                    double rating = sc.nextDouble();
                    Film21 nb = new Film21(id, judul, rating);
                    dll.addFirst(nb);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Posisi Akhir");
                    System.out.println("-----------------------------");
                    System.out.print("ID : ");
                    int id1 = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul1 = sc.next();
                    System.out.print("Rating : ");
                    double rating1 = sc.nextDouble();
                    Film21 nb1 = new Film21(id1, judul1, rating1);
                    dll.addFirst(nb1);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data FILM");
                    System.out.println("-----------------------------");
                    System.out.print("Urutan ke : ");
                    int index = sc.nextInt();
                    System.out.print("ID : ");
                    int id2 = sc.nextInt();
                    System.out.print("Judul Film : ");
                    String judul2 = sc.next();
                    System.out.print("Rating : ");
                    double rating2 = sc.nextDouble();
                    Film21 nb2 = new Film21(id2, judul2, rating2);
                    dll.add(nb2, index);
                    System.out.println();
                    break;
                case 4:
                    Film21 film = dll.getFirst();
                    System.out.println("Film " +film.judul + " telah dihapus.");
                    dll.removeFirst();
                    System.out.println();
                    break;
                case 5:
                    Film21 film1 = dll.getLast();
                    System.out.println("Film " +film1.judul + " telah dihapus.");
                    dll.removeLast();
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Urutan ke : ");
                    int index1 = sc.nextInt();
                    Film21 film2 = dll.get(index1);
                    System.out.println("Film " +film2.judul + " telah dihapus.");
                    dll.remove(index1);
                    break;
                case 7:
                    System.out.println("-----------------------------");
                    System.out.println("DATA FILM LAYAR LEBAR");
                    System.out.println("-----------------------------");
                    dll.print();
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Masukkan ID : ");
                    int idSearch = sc.nextInt();
                    Film21 seach = dll.searchId(idSearch);
                    System.out.println("ID \t: " +seach.id);
                    System.out.println("Judul \t: " +seach.judul);
                    System.out.println("Rating \t: " +seach.rating);
                    break;
                case 9:
                    dll.sortRatingDesc();
                    System.out.println("-----------------------------");
                    System.out.println("DATA FILM LAYAR LEBAR SORTING DESC");
                    System.out.println("-----------------------------");
                    dll.print();
                    System.out.println();
                    break;
                case 10:
                    return;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5|| pilih == 6|| pilih == 7|| pilih == 8|| pilih == 9|| pilih == 10);
        sc.close();
    }
}