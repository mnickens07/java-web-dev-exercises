package livecodingpractice;

import java.math.BigInteger;

public class LargestPrimeFactor {
    public static long largestPrimeNum(long n) {
        if (n <= 1) {
            return 0;
        } else {
            int div = 2;
            while (div < n) {
                if (n%div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeNum(600851475  ));
    }

}
