package jobsheet6;

public class HotelMain21 {
     public static void main(String[] args) {
        HotelService21 list = new HotelService21();
        Hotel21 m1 = new Hotel21("RedDors", "Malang", 25000, (byte)5);
        Hotel21 m5 = new Hotel21("Santika", "Batu", 26000, (byte)3);
        Hotel21 m2 = new Hotel21("BlueBirds", "Surabaya", 19000, (byte)4);
        Hotel21 m3 = new Hotel21("RoyalGarden", "Kediri", 20000, (byte)1);
        Hotel21 m4 = new Hotel21("Opera", "Malang", 22000, (byte)2);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data hotel = ");
        list.tampilAll();

        System.out.println("Data hotel dengan harga termurah = ");
        list.bubbleSort();
        list.tampilAll();

        System.out.println("Data hotel dengan bintang tertinggi");
        list.selectionSort();
        list. tampilAll();

    }
}