package level3.ch07;

import java.io.*;
import java.util.StringTokenizer;

public class Q11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int range = Integer.parseInt(br.readLine());

        for (int i = 1; i < range + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + a + " + " + b + " = " + (a + b) +"\n");
        }
        bw.flush();
    }
}
