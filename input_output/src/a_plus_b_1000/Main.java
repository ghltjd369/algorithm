package a_plus_b_1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tmp = br.readLine();
        int A = Integer.parseInt(tmp.substring(0, 1));
        int B = Integer.parseInt(tmp.substring(2, 3));

        System.out.println(A + B);
    }
}
