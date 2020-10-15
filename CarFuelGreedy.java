import java.util.*;


public class Car {

    public static int minRefill(int[] x, int n, int L) {
        int numRefill = 0, currRefill = 0;

        while (currRefill <= n) {
            int lastRefill = currRefill;

            while (currRefill <= n && x[currRefill + 1] - x[lastRefill] <= L) {
                currRefill++;
            }

            if (currRefill == lastRefill)
                return -1;

            if (currRefill <= n) {
                numRefill++;
            }
        }

        return numRefill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDis = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[];
        for(int i=0;i<n;i++)
          a[i] = sc.nextInt();
        System.out.println(minRefill(a, n, maxDis));
    }
}
