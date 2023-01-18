package min_max_10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int max = -1000000;
        int min = 1000000;

        int[] num = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());

            if (num[i] >= max) {
                max = num[i];
            }
            if (num[i] <= min) {
                min = num[i];
            }
        }

        System.out.println(min + " " + max);

    }
}
