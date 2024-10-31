package TUGAS;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNode(String question, String answer) {
        Node newNode = new Node(question, answer);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Node getHead() {
        return head;
    }
}