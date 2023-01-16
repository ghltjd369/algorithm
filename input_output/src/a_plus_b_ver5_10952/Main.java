package a_plus_b_ver5_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            int A = Integer.parseInt(str.substring(0, 1));
            int B = Integer.parseInt(str.substring(2, 3));

            if (A == 0 && B == 0) break;

            System.out.println(A + B);
        }
    }
}
