package tugas;

public class Node1 {
    int noAntrian;
    String nama;
    Node1 prev, next;

    public Node1(Node1 prev, int noAntrian, String nama, Node1 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.nama = nama;
        this.next = next;
    }
}
