package star_ver17_10992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            if (i == N) {
                for (int j = 1; j <= 2 * N - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= N-i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                if (i != 1) {
                    for (int j = 1; j <= 2 * i - 3; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
