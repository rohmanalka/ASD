public class Tugas1 {
    public String nama;
    public String nim;
    public String kelamin;
    public double ipk;

    public Tugas1(String nama, String nim, String kel, double ipk) {
        this.nama = nama;
        this.nim = nim;
        kelamin = kel;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKel() {
        return kelamin;
    }

    public double getIpk() {
        return ipk;
    }
}
