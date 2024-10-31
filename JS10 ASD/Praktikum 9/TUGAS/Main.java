package TUGAS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList scavengerHunt = new LinkedList();
        scavengerHunt.addNode("Software apakah yang digunakan untuk coding?", "VSCode");
        scavengerHunt.addNode("Bahasa pemrograman apa yang sedang digunakan?", "Java");
        scavengerHunt.addNode("Materi apa yang sedang dipelajari?", "Linked List");
        scavengerHunt.addNode("Mata Kuliah apa yang mempelajari Linked List? (Singkat)", "ASD");

        startScavengerHunt(scavengerHunt);
    }

    public static void startScavengerHunt(LinkedList scavengerHunt) {
        Scanner sc = new Scanner(System.in);
        Node currentPoint = scavengerHunt.getHead();

        while (currentPoint != null) {
            System.out.println(currentPoint.getQuestion());
            String playerAnswer = sc.nextLine();

            if (playerAnswer.equalsIgnoreCase(currentPoint.getAnswer())) {
                System.out.println("Jawaban benar! Lanjut ke pertanyaan selanjutnya.");
                currentPoint = currentPoint.getNext();
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }

        sc.close();
        System.out.println("Selamat, Anda menemukan harta karun!");
    }
}