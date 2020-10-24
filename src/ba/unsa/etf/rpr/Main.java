package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    static int sumaCifara(int k) {
        int r = 0;
        do {
            r += k % 10;
            k /= 10;
        } while (k != 0);
        return r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Unesite n- ");
        int n = sc.nextInt();

        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0)
                System.out.print("  " + i);
        }
    }
}
