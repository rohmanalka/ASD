    public class transaksi21 {
        double saldo;
        double saldoAwal;
        double saldoAkhir;
        String tanggalTransaksi;
        String type;
        transaksi21 tr[];

        public transaksi21(transaksi21[] trans) {
            this.tr = trans;
        }

        public transaksi21() {

        }

        public transaksi21(double a, double b, double c, String d, String e) {
            this.saldo = a;
            this.saldoAwal = b;
            this.saldoAkhir = c;
            this.tanggalTransaksi = d; 
            this.type = e;
        }

        public void searchSaldo() {
            System.out.println("Transaksi dengan saldo lebih dari 500000:");
            for (transaksi21 tr : tr) {
                if (tr.saldo > 500000) {
                    System.out.println("Saldo: " + tr.saldo);
                    System.out.println("Saldo Awal: " + tr.saldoAwal);
                    System.out.println("Saldo Akhir: " + tr.saldoAkhir);
                    System.out.println("Tanggal Transaksi: " + tr.tanggalTransaksi);
                    System.out.println("--------------------------");
                }
            }
        }

        public void tampilDataTr() {
            System.out.println("Data Transaksi:");
            for (transaksi21 tr : tr) {
                System.out.println("Saldo: " + tr.saldo);
                System.out.println("Saldo Awal: " + tr.saldoAwal);
                System.out.println("Saldo Akhir: " + tr.saldoAkhir);
                System.out.println("Tanggal Transaksi: " + tr.tanggalTransaksi);
                System.out.println("--------------------------");
            }
        }
    }
