public class DoubleLinkedList21 {
    Node21 head;
    int size;
    
    public DoubleLinkedList21() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node21(null, item, jarak, null);
        } else {
            Node21 newNode21 = new Node21(null, item, jarak, head);
            head.prev = newNode21;
            head = newNode21;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node21 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node21 newNode21 = new Node21(current, item, jarak, null);
            current.next = newNode21;
            size++;
        }
    }

    public void add(int item, int jarak, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node21 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }

            if (current.prev == null) {
                Node21 newNode21 = new Node21(null, item, jarak, current);
                current.prev = newNode21;
                head = newNode21;
            } else {
                Node21 newNode21 = new Node21(current.prev, item, jarak, current);
                current.prev.next = newNode21;
                current.prev = newNode21;
            }
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
            Node21 tmp = head;  
            while (tmp != null) {  
                System.out.print (tmp.data + "\t");
                tmp = tmp.next;  
            }  
            System.out.println("\nberhasi1 diisi");  
        } else {  
            System.out.println("Linked Lists Kosong");  
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
        Node21 current = head;  
        while (current.next.next != null) {
            current = current.next;
        }  
        current.next = null;  
        size--;  
    }

    public void removeFirst() throws Exception {  
        if (isEmpty()) {  
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");  
        } else if (size == 1) {  
            removeLast();  
        } else {  
            head = head.next;  
            head.prev = null;  
            size--;  
        }  
    }
 
    public void remove(int index) {
        Node21 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }  

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
    
    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        
        Node21 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size || index < 0) {
            throw new Exception("Nilai indeks di luar batas.");
        }

        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }

        return tmp.jarak;
    }
}