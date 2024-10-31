package minggu5;

public class latihan21 {
    public static int akarBF(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return i;
            }
        }
        return -1; // Bilangan bukan kuadrat sempurna
    }

    public static int akarDC(int n, int low, int high) {
        if (low > high) {
            return -1; // Bilangan bukan kuadrat sempurna
        }
        int mid = (low + high) / 2;
        if (mid * mid == n) {
            return mid;
        } else if (mid * mid < n) {
            return akarDC(n, mid + 1, high);
        } else {
            return akarDC(n, low, mid - 1);
        }
    }
}
