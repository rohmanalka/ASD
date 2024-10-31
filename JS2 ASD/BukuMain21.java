public class BukuMain21 {
    public static void main(String[] args) {
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku21 bk2 = new Buku21("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku21 bukuAlka = new Buku21("Alka Anak Polinema", "Alka", 150, 10, 40000);
        bukuAlka.gantiHarga(30000);
        bukuAlka.tampilInformasi();
        int terjual = bukuAlka.terjual(8);
        int hargaTotal = bukuAlka.hitungHargaTotal(terjual);
        int diskon = bukuAlka.hitungDiskon(hargaTotal);
        bukuAlka.hitungHargaBayar(hargaTotal, diskon);
    }
}