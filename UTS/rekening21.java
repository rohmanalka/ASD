public class rekening21 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;
    rekening21 rek[];

    public rekening21(rekening21[] reks) {
        this.rek = reks;
    }

    public rekening21() {

    }

    public rekening21(String a, String b, String c, String d, String e) {
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.phone = d;
        this.email = e;
    }

    public void sortingByName(boolean asc) {
    for (int i = 0; i < rek.length - 1; i++) {
        for (int j = 0; j < rek.length - i - 1; j++) {
            int compare = asc ? rek[j].nama.compareTo(rek[j + 1].nama) : rek[j + 1].nama.compareTo(rek[j].nama);
            if (compare > 0) {
                // Tukar posisi
                rekening21 temp = rek[j];
                rek[j] = rek[j + 1];
                rek[j + 1] = temp;
                }
            }
        }
    }


    public void tampilDataRek() {
        System.out.println("Data Rekening:");
        for (rekening21 rek : rek) {
            System.out.println("No Rekening: " + rek.noRekening);
            System.out.println("Nama: " + rek.nama);
            System.out.println("Nama Ibu: " + rek.namaIbu);
            System.out.println("Phone: " + rek.phone);
            System.out.println("Email: " + rek.email);
            System.out.println("--------------------------");
        }
    }
}
