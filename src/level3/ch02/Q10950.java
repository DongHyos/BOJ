package level3.ch02;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int[] arr = new int[c];

        for (int i = 0; i < c; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            arr[i] = A + B;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
