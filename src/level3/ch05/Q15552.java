package level3.ch05;

import java.io.*;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int ans = Integer.parseInt(br.readLine());

        for (int i = 0; i < ans; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int sum = a + b;

            bw.write(sum + "\n"); // 질문
        }
            bw.flush();

    }
}
