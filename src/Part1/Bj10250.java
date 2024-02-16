package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int time = Integer.valueOf(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < time; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int floors = Integer.valueOf(st.nextToken());
            int rooms = Integer.valueOf(st.nextToken());
            int user = Integer.valueOf(st.nextToken());
            int target = 0;

            int[][] hotel = new int[floors+1][rooms+1];

            loopFir:
            for (int k = 1; k <= rooms; k++) {
                for (int j = floors; j >= 1; j--) {
                    hotel[j][k] = 1;
                    target++;
                    if(user == target){

                        sb.append(floors+1-j);
                        if(k>9){
                            sb.append(k);
                        }else{
                            sb.append("0").append(k);
                        }
                        sb.append("\n");
                        break loopFir;
                    }
                }
            }


        }

        System.out.println(sb);
    }
}
