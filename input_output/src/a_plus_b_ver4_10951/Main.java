package a_plus_b_ver4_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null) {
            int A = Integer.parseInt(str.substring(0, 1));
            int B = Integer.parseInt(str.substring(2, 3));

            System.out.println(A + B);
        }
    }
}