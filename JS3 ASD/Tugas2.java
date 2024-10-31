public class Tugas2 {
    public String nama;
    public String nim;
    public String jurusan;
    public String noHp;

    public Tugas2(String nama, String nim, String jur, String no) {
        this.nama = nama;
        this.nim = nim;
        jurusan = jur;
        noHp = no;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
    public String getJur() {
        return jurusan;
    }
    public String getNo() {
        return noHp;
    }

    void tampilInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
        System.out.println("Jurusan: " + getJur());
        System.out.println("No. Hp: " + getNo());
    }
}

