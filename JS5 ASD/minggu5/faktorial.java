package minggu5;

public class faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int hasil = 1;
        int i = 1;
        while (i <= n) {
            hasil *= i;
            i++;
        }
        return hasil;
    }

    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }    
}