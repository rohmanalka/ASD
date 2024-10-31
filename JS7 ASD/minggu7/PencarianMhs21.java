package minggu7;

public class PencarianMhs21 {
    Mahasiswa21 listMhs[];
    int idx;
    
    public PencarianMhs21(int jumlahMahasiswa) {
        listMhs = new Mahasiswa21[jumlahMahasiswa];
    }

    void tambah(Mahasiswa21 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx ++;
        } else {
            System.out.println("Data Sudah Penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa21 m : listMhs) {
            m.tampil();
            System.out.println("-----------------------");
        }
    }

    public int findSeqSearch(int cari) {
        int posisi = -1;
        for(int j=0; j < listMhs.length; j++) {
            if(listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if(pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data" + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if(pos!= -1) {
            System.out.println("Nim\t: " + x);
            System.out.println("Nama\t: " +listMhs[pos].nama);
            System.out.println("umur\t: " +listMhs[pos].umur);
            System.out.println("IPK\t: " +listMhs[pos].ipk);
        } else{
            System.out.println("Data "+ x +" Tidak ditemukan" );
        }
    }

    // public int findBinarySearch(int cari, int left, int right) {
    
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         if (listMhs[mid].nim == cari)
    //             return mid;
    //         if (listMhs[mid].nim < cari)
    //             right = mid - 1;
    //         else
    //             left = mid + 1; 
    //     }
    //     return -1;
    // }

    public void tampilPosisiNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void tampilDataNama(String x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearchByName(String cari, int left, int right) {
        if (right >= left) {

            int mid = (left + right) / 2;
            int comparison = listMhs[mid].nama.compareTo(cari);

            if (comparison < 0) {
                return FindBinarySearchByName(cari, mid + 1, right);
            } else if (comparison > 0) {
                return FindBinarySearchByName(cari, left, mid - 1);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public void countSearchName(String cari)
    {
        int count = 0;
        for(int i=0; i<listMhs.length; i++){
            if(cari.equalsIgnoreCase(listMhs[i].nama)){
                count += 1;
            }
        }

        if (count > 1) {
            System.out.println("Data yang ditemukan lebih dari 1");
            return;
        }
    }
}