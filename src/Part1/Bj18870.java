package Part1;

import java.io.*;
import java.util.*;

public class Bj18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer nums = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] compression = new Integer[nums];
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < nums; i++) {
            Integer one = Integer.valueOf(st.nextToken());
            compression[i] = one;
            treeSet.add(one);
        }

        Map<Integer, Integer> rslt = new HashMap<>();
        Integer idx = 0;
        for(Integer x : treeSet) rslt.put(x, idx++);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < compression.length; i++) {
            bw.write( rslt.get(compression[i]) + " " );
        }
        bw.flush();
    }
}
