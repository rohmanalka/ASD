package tugas;

public class DoubleLinkedList1 {
    Node1 head, tail;
    int size;

    public DoubleLinkedList1() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int noAntrian, String nama) {
        Node1 newNode = new Node1(tail, noAntrian, nama, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Data penerima vaksin berhasil ditambahkan.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
        } else {
            System.out.println("Data penerima vaksin dengan nomor antrian " + head.noAntrian + " dan nama " + head.nama + " telah divaksinasi.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Tidak ada pengantri vaksin.");
        } else {
            Node1 current = head;
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.printf("|%-5s|%-10s|\n", "No.", "Nama");
            System.out.println("+++++++++++++++++++++++++++++++++++");
            while (current != null) {
                System.out.printf("|%-5d|%-10s|\n", current.noAntrian, current.nama);
                current = current.next;
            }
            System.out.println("+++++++++++++++++++++++++++++++++++");
            System.out.println("Sisa Antrian: " + size);
        }
    }

    public int getSize() {
        return size;
    }
}
