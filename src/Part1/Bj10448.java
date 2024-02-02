package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10448 {

    public static void main(String[] args) throws IOException {

        int[] triArr = new int[44];
        for (int i = 0; i < 44; i++) {
            int a = i+1;
            triArr[i] = a*(a+1)/2;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int nums = Integer.valueOf(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums; i++) {
            st = new StringTokenizer(br.readLine());
            Integer target = Integer.valueOf(st.nextToken());

            boolean flag = false;
            Loop1:
            for (int j = 0; j < triArr.length; j++) {
                for (int k = 0; k < triArr.length; k++) {
                    for (int l = 0; l < triArr.length; l++) {
                        if( (triArr[j] + triArr[k] + triArr[l]) == target){
                            flag = true;
                            break Loop1;
                        }
                    }
                }
            }
            if(flag){
                sb.append("1").append("\n");
            }else{
                sb.append("0").append("\n");
            }

        }

        System.out.println(sb);
    }
}
