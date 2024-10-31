public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
        System.out.println("=================");
    }

    int terjual(int jml) {
        if (stok>=jml) {
            stok -= jml;
        } else {
            System.out.println("stok tidak cukup");
        }
        return jml;
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku21() {

    }
    
    public Buku21(String jdl, String pg, int hal, int stok, int hrg) {
        judul = jdl;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = hrg;
    }

    int hitungHargaTotal(int terjual) {
        int hargaTotal = harga * terjual;
        System.out.println("Harga Total: " + hargaTotal);
        return hargaTotal;
    }
    
    int hitungDiskon(int hargaTotal) {
        int diskon = 0;
        if (hargaTotal>150000) {
            diskon = hargaTotal * 12 / 100;
            System.out.println("Anda Dapat Diskon 12% yaitu: " + diskon);
        } else if (hargaTotal>=75000) {
            diskon = hargaTotal * 5 / 100;
            System.out.println("Anda Dapat Diskon 5% yaitu: " + diskon);
        } else {
            System.out.println("Anda Tidak Mendapat Diskon");
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        int hargaBayar = hargaTotal - diskon;
        System.out.println("Total Pembayaran Anda Sebesar: " + hargaBayar);
        return hargaBayar;
    }
}
