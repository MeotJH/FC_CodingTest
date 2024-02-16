package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2840 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr = Integer.valueOf(st.nextToken());
        int loop = Integer.valueOf(st.nextToken());

        // 1. 배열 초기화 한다.
        String[] wheel = new String[arr];
        Arrays.fill(wheel, "?");

        // 2. 루프를 돌며 값을 추측한다.
        // 2.1 값이 논리적으로 말이 안되면 ! 출력
        int temp = 0;
        String str = null;
        boolean flag = false;
        while(loop-- > 0){
            st = new StringTokenizer(br.readLine());

            int wheelTurn = Integer.valueOf(st.nextToken());
            int wheelTurn2 = wheelTurn;
            str = st.nextToken();

            wheelTurn  = (( temp - wheelTurn) % arr + arr ) % arr; //(wheelTurn + temp) >= arr ? wheelTurn + temp - arr : wheelTurn + temp;
            wheelTurn2 = (wheelTurn + temp) >= arr ? wheelTurn + temp - arr : wheelTurn + temp;


            if( wheel[wheelTurn].equals("?") ){
                temp = wheelTurn;
                String asas = wheel[wheelTurn2];


                for (int j = 0; j < wheel.length; j++) {
                    if(wheel[j].equals(str)){
                        System.out.print("!");
                        return;
                    }
                }
                
                
                wheel[wheelTurn] = str;
            } else if (wheel[wheelTurn].equals(str)) {
                temp = wheelTurn;
            } else {
                System.out.print("!");
                return;
            }
        }

        int t = Arrays.asList(wheel).indexOf(str);
        int idx = Arrays.asList(wheel).indexOf(str);

        StringBuilder sb = new StringBuilder();
        int one = arr;
        while(arr-- > 0){
            String outStr = wheel[idx];
            if( idx == one-1 ){
                idx = idx - one;
            }
            idx++;
            sb.append(outStr);
        }

        System.out.println(sb);


    }
}
