package Praktikum8;
import java.util.Scanner;

public class stackPkMain {
    public static void main(String[] args) {
        stackPk21 stk = new stackPk21(5);
        Scanner sc = new Scanner (System.in);

        char pilih;
        do {
            System.out.println("================");
            System.out.println("  PILIHAN MENU  ");
            System.out.println("================");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Harga Tertinggi");
            System.out.println("================");
            int pilihan;
            System.out.print("Pilih Menu (1-4): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    do {
                        System.out.print("Jenis: ");
                        String jenis = sc.next();
                        System.out.print("Warna: ");
                        String warna = sc.next();
                        System.out.print("Merk: ");
                        String merk = sc.next();
                        System.out.print("Ukuran: ");
                        String ukuran = sc.next();
                        System.out.print("Harga: ");
                        double harga = sc.nextDouble();
            
                        pakaian21 p = new pakaian21(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    } while (pilih == 'y');
                    break;

                case 2:
                    stk.pop();
                    break;
                
                case 3:
                    stk.peek();
                    break;

                case 4:
                    stk.print();
                    break;

                case 5:
                    stk.getMax();

                default:
                    System.out.println("");
                    break;

            } if (pilihan == 6) {
                pilih ='t';
            } else {
                System.out.print("Kembali ke menu Utama (y/t) ");
                pilih = sc.next().charAt(0);
            }
        } while (pilih == 'y');
    }
}