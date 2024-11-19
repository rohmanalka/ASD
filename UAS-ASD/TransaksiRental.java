public class TransaksiRental {
    public static int autoIncrement = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;

    public TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br, boolean Member) {
        this.kodeTransaksi = autoIncrement++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = hitungTotalBiaya(lamaPinjam, br.biayaSewa, Member);
    }

    public double hitungTotalBiaya(int lamaPinjam, int biayaSewa, boolean Member) {
        double total = lamaPinjam * biayaSewa;
        double diskon = 0;
        if (Member) {
            total -= 25000;
        }
        if (lamaPinjam > 78) {
            diskon = total * 0.2;
        } else if (lamaPinjam >= 48) {
            diskon = total * 0.1;
        }
        total -= diskon;
        return total;
    }
}