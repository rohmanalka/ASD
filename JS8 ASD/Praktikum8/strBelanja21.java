package Praktikum8;

public class strBelanja21 {
    String tanggal, namaBarang;
    int noTransaksi, jml, total;

    strBelanja21(int nt, String tgl, String nb, int jml, int t) {
        noTransaksi = nt;
        tanggal = tgl;
        namaBarang = nb;
        this.jml = jml;
        total = t;
    }
}