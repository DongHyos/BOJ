package level3.ch09;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int range = sc.nextInt();

        for (int i = 0; i < range; i++) {
            for (int j = i; j < range - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
