public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    void cetakInfo() {
        System.out.println("panjang: " + panjang + " lebar: " + lebar +
        " Luas: " + hitungLuas(panjang, lebar) + " Keliling: " + hitungKeliling(panjang, lebar));
    }

    int hitungLuas (int p, int l) {
        int Luas = p * l;
        return Luas;
    }

    int hitungKeliling (int p, int l) {
        int Keliling = 2 * (p+l);
        return Keliling;
    }
}