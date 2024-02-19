package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BJ2817 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalVote = Integer.valueOf(br.readLine());
        int votedMen = Integer.valueOf(br.readLine());

        double bottom = totalVote * 0.05;
        HashMap<Double,String> alpsResult = new HashMap<>();
        while (votedMen-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String man = st.nextToken();
            Double turnout = Double.valueOf(st.nextToken());
            if(turnout < bottom){
                continue;
            }

            for (int i = 0; i <14; i++) {
                double score = turnout / (i + 1);
                alpsResult.put(score,man);
            }


        }
        List<Double> scores = alpsResult
                                .keySet()
                                .stream()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
        Map<String,Integer> rslt = new HashMap<>();
        for(Double key : alpsResult.keySet()){
            String man = alpsResult.get(key);
            rslt.put(man,0);
        }
        for (int i = 0; i < 14; i++) {
            Double key = scores.get(i);
            String rsltKey = alpsResult.get(key);
            rslt.put(rsltKey, rslt.getOrDefault(rsltKey,0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(String each :  rslt.keySet()){
            sb.append(each).append(" ").append(rslt.get(each)).append("\n");
        }
        System.out.println(sb);



    }
}
