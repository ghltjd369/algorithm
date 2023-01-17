package day_of_the_week_1924;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        String[] dayOfTheWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;

        for (int i = 0; i < month - 1; i++) {
            sum += dayOfMonth[i];
        }

        sum += day - 1;

        System.out.println(dayOfTheWeek[sum % 7]);

    }
}
