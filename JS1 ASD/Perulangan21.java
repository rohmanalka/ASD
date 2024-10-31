import java.util.Scanner;

public class Perulangan21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nim;
        
        System.out.print("Masukkan digit akhir NIM Anda: ");
        nim = scanner.nextInt();

        if (nim < 10) {
            nim += 10;
        }

        for (int i = 1; i <= nim; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}