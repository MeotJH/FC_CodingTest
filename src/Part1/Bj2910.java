package Part1;

import java.io.*;
import java.util.*;

public class Bj2910 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums = Integer.valueOf(st.nextToken());
        int max = Integer.valueOf(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums; i++) {
            Integer one = Integer.valueOf(st.nextToken());
            set.add(one);
            map.put(one, map.getOrDefault(one, 0)+1);
        }


        List<Integer> list = new ArrayList(set);
        Collections.sort(list, (o1, o2) -> map.get(o2) - map.get(o1));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Integer each : list){
            for (int i = 0; i < map.get(each) ; i++) {
                bw.write(each + " ");
            }
        }
        bw.flush();
    }
}
