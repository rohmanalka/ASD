package Praktikum8;

public class stack21 {
    int size, top, data[];
    
    public stack21 (int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }
    
    public boolean IsFull() {
        if (top == size -1){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsEmpty() {
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(int dt){
        if(!IsFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Stack Penuh");
        }
    }

    public void pop() {
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen teratas stack: "+ data[top]);
    }

    public void print() {
        System.out.println("Isi stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i] + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}