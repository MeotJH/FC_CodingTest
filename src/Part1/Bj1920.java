package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj1920 {

    public static void main(String[] args) throws IOException {
        /**
         * 5
         * 4 1 5 2 3
         * 5
         * 1 3 7 9 5
         */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        Set<Integer> nSet  = new HashSet<>();
        for (int i = 0; i < n; i++) {
            nSet.add(Integer.valueOf(st.nextToken()));
        }

        int m = Integer.valueOf(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int[] mNums = new int[m];
        for (int i = 0; i < m; i++) {
            mNums[i] = Integer.valueOf(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if(nSet.contains(mNums[i])){
                sb.append("1").append("\n");
            }else{
                sb.append("0").append("\n");
            }
        }


        System.out.println(sb);

    }
}
