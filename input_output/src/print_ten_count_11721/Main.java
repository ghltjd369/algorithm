package print_ten_count_11721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i + 1));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
