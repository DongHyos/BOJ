package level1.ch10;

import java.util.Scanner;

public class Q3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] arr1 = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] - arr[j]+ " ");

        }
    }
}
