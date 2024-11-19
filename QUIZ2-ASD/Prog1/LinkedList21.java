package Prog1;
public class LinkedList21 {
    private Node head;

    private class Node {
        Mahasiswa21 data;
        Node next;

        Node(Mahasiswa21 data) {
            this.data = data;
        }
    }

    public void add(Mahasiswa21 data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(String nim) {
        if (head == null) return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa21 get(String nim) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}