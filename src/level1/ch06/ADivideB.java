package level1.ch06;

import java.util.Scanner;

public class ADivideB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        double C = (double)A / B;

        System.out.println(C);
    }
}
