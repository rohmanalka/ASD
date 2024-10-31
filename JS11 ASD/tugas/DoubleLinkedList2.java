package tugas;

public class DoubleLinkedList2 {
    Node2 head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film21 item) {
        if (isEmpty()) {
            head = new Node2(null, item, null);
        } else {
            Node2 newNode = new Node2(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film21 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node2 newNode = new Node2(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film21 item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node2 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            Node2 newNode = new Node2(current.prev, item, current);
            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;
            size++;
        }
    }
 
    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node2 tmp = head;
            System.out.println("Cetak");
            while (tmp != null) {
                System.out.println("No.ID \t: " + tmp.data.id);
                System.out.println(" Judul \t: " + tmp.data.judul);
                System.out.println(" Rating \t: " + tmp.data.rating);
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
            head = head.next;
        } else {
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node2 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node2 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Film21 getFirst () throws Exception {
        if (isEmpty ()) {
            throw new Exception ("Linked List kosong");
        }
        return head.data;
    }

    public Film21 getLast () throws Exception {
        if (isEmpty ()) {
            throw new Exception ("Linked List kosong");
        }
        Node2 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film21 get (int index) throws Exception {
        if (isEmpty () || index >= size) {
            throw new Exception ("Nilai indeks di luar batas.");
        }
        Node2 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public Film21 searchId(int id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong");
        }

        Node2 current = head;
        while (current != null) {
            if (current.data.id == id) {
                return current.data;
            }
            current = current.next;
        }

        throw new Exception("ID Film21 " + id + " tidak ditemukan");
    }

    public void sortRatingDesc() {
        if (isEmpty() || size == 1) {
            return; 
        }

        for (int i = 0; i < size - 1; i++) {
            Node2 current = head;
            Node2 maxNode = current;

            for (int j = 0; j < size - i - 1; j++) {
                if (current.next != null && current.next.data.rating > maxNode.data.rating) {
                    maxNode = current.next;
                }
                current = current.next;
            }

            if (maxNode != current) {
                Film21 temp = current.data;
                current.data = maxNode.data;
                maxNode.data = temp;
            }
        }
    }
}