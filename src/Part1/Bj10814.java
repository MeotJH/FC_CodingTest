package Part1;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer number = Integer.valueOf(br.readLine());

        String[] member = new String[number];
        for (int i = 0; i < number; i++) {
            member[i] = br.readLine();
        }

        Arrays.sort(member, (o1,o2) -> {
            Integer o1Age = Integer.valueOf(o1.split(" ")[0]);
            Integer o2Age = Integer.valueOf(o2.split(" ")[0]);
            return o1Age - o2Age;
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0 ; i < number; i++) {
            bw.write(member[i]+ "\n");
        }
        bw.flush();
    }
}
