import java.util.Scanner;

public class main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rekening21 rekening = new rekening21();
        transaksi21 transaksi = new transaksi21();

        rekening21[] rekenings = {
            new rekening21("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"),
            new rekening21("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"),
            new rekening21("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"),
            new rekening21("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"),
            new rekening21("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"),
            new rekening21("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"),
            new rekening21("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"),
            new rekening21("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"),
            new rekening21("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"),
            new rekening21("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"),
            new rekening21("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"),
            new rekening21("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664", "vel@ullamcorpermagna.co.uk"),
            new rekening21("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110", "Aliquam.gravida@vestibulumMauris.net"),
            new rekening21("16130909 2979", "Ryder", "Joel Cunningham", "817-1766", "interdum.Curabitur.dictum@rutrumurna.edu"),
            new rekening21("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501", "et.ultrices@a.co.uk"),
            new rekening21("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"),
            new rekening21("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"),
            new rekening21("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"),
            new rekening21("16771126 7372", "Ignatius", "Lionel Kane", "353-5137", "cubilia.Curae.Phasellus@Duis.com")
        };

        transaksi21[] transaksis = {
            new transaksi21(898214, 494048, 3587, "2021-03-09 07:54:42", ""),
            new transaksi21(205420, 200162, 775880, "2021-06-25 10:23:00", ""),
            new transaksi21(838632, 350929, 328316, "2021-09-18 23:00:04", ""),
            new transaksi21(230659, 204434, 690503, "2022-02-02 19:10:34", ""),
            new transaksi21(770592, 334245, 444267, "2020-08-11 13:36:56", ""),
            new transaksi21(685302, 451002, 376442, "2020-05-23 07:34:53", ""),
            new transaksi21(816129, 851403, 597842, "2021-07-18 19:41:20", ""),
            new transaksi21(989609, 333823, 802752, "2022-02-01 01:13:11", ""),
            new transaksi21(297103, 396116, 779589, "2021-07-03 01:09:49", ""),
            new transaksi21(66190, 259150, 619774, "2021-09-09 03:57:30", ""),
            new transaksi21(234301, 278309, 547922, "2021-08-24 13:18:39", ""),
            new transaksi21(243306, 869468, 50283, "2021-03-12 03:40:16", ""),
            new transaksi21(371045, 991242, 602034, "2021-08-06 11:48:59", ""),
            new transaksi21(395170, 97058, 472273, "2021-05-02 10:53:31", ""),
            new transaksi21(862731, 561908, 109431, "2021-07-31 08:11:00", ""),
            new transaksi21(556798, 31387, 725426, "2021-03-27 06:18:20", ""),
            new transaksi21(873982, 896213, 846142, "2021-07-18 04:06:30", ""),
            new transaksi21(774247, 739406, 775848, "2020-10-24 01:39:00", ""),
            new transaksi21(66987, 823014, 868772, "2020-12-21 05:57:59", "")
        };

        rekening = new rekening21(rekenings);
        transaksi = new transaksi21(transaksis);
       
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampil Data Rekening");
            System.out.println("2. Tampil Data Transaksi");
            System.out.println("3. Mencari Saldo > 500000");
            System.out.println("4. Sorting by Name");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda (1-5): ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    rekening.tampilDataRek();
                    break;
                case 2:
                    transaksi.tampilDataTr();
                    break;
                case 3:
                    transaksi.searchSaldo();
                    break;
                case 4:
                    rekening.sortingByName(true); 
                    rekening.tampilDataRek();
                    break;
                case 5:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilihan != 5);
    }
}