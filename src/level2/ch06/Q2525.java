package level2.ch06;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = B + C;


        if (B + C >= 60) {
            A += (D / 60);
            D = (D % 60);
        }
        if (A > 23) {
            A -= 24;
        }

        System.out.print(A + " ");
        System.out.print(D);
    }
}

