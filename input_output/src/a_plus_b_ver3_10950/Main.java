package a_plus_b_ver3_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String tmp = br.readLine();
            int A = Integer.parseInt(tmp.substring(0, 1));
            int B = Integer.parseInt(tmp.substring(2, 3));
            System.out.println(A + B);
        }
    }
}