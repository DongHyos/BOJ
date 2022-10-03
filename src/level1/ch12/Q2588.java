package level1.ch12;

import java.util.Scanner;

public class Q2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        String str1 = String.valueOf(B);
        int b = str1.charAt(2) - '0';
        int b1 = str1.charAt(1) - '0';
        int b2 = str1.charAt(0) - '0';

        System.out.println(A*b);
        System.out.println(A*b1);
        System.out.println(A*b2);
        System.out.println(A * B);


    }
}
