package tugas;

public class Node2 {
    Film21 data;
    Node2 prev, next;

    public Node2(Node2 prev, Film21 data, Node2 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
