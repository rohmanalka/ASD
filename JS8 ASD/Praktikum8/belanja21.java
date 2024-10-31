package Praktikum8;

public class belanja21 {
    int size;
    int top;
    strBelanja21 data[];
    
    public belanja21(int size) {
        this.size = size;
        data = new strBelanja21[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(strBelanja21 sb) {
        if (!IsFull()) {
            top++;
            data[top] = sb;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            strBelanja21 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.noTransaksi + " " + x.tanggal + 
            " " + x.namaBarang + " " + x.jml + " " + x.total);
        } else {
            System.out.println("Stock masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas: " + data[top].noTransaksi +"."+ " " + 
        data[top].tanggal + " " + data[top].namaBarang + " " + data[top].jml + " " + data[top].total);
    }

    public void print() {
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].noTransaksi + " " + data[i].tanggal + " " + 
            data[i].namaBarang + " " + data[i].jml + " " + data[i].total);
        }
        System.out.println("");
    }
        
    public void clear() {
        if(!IsEmpty()) {
            for(int i = top; i >= 0; i--) {
                top--;
            }
                System.out.println("Stock sudah dikosongkan");
            } else {
            System.out.println("Stock masih kosong");
        }
    }
}