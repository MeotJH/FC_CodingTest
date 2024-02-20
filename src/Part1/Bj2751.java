package Part1;

import java.io.*;
import java.util.Arrays;

public class Bj2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer time = Integer.valueOf(br.readLine());

        Integer[] beforeSort = new Integer[time];
        for (int i = 0; i < time; i++) {
            beforeSort[i] = Integer.valueOf(br.readLine());
        }

        Arrays.sort(beforeSort);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < time; i++) {
            bw.write(beforeSort[i] + "\n");
        }
        bw.flush();

    }
}
