package a_plus_b_ver8_11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            int A = Integer.parseInt(str.substring(0, 1));
            int B = Integer.parseInt(str.substring(2, 3));

            System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, A + B);
        }
    }
}
