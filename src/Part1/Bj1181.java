package Part1;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bj1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer num = Integer.valueOf(br.readLine());

        String[] sortTarget = new String[num];
        for (int i = 0; i < num; i++) {
            sortTarget[i] = br.readLine();
        }

        Arrays.sort(sortTarget, (o1,o2) -> {
            if(o1.length() == o2.length()){
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });

        List<String> collect = Arrays.stream(sortTarget).distinct().collect(Collectors.toList());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String each : collect){
            bw.write(each + "\n");
        }
        bw.flush();
    }
}
