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
        for (int i = 0; i < arr; i++) {
            wheel[i] = "?";
        }

        // 2. 루프를 돌며 값을 추측한다.
        // 2.1 값이 논리적으로 말이 안되면 ! 출력
        StringBuilder sb = new StringBuilder();
        int temp = 0;
        String str = null;
        boolean flag = false;
        for (int i = 0 ; i < loop ; i++){
            st = new StringTokenizer(br.readLine());

            int wheelTurn = Integer.valueOf(st.nextToken());
            str = st.nextToken();
            wheelTurn  = (wheelTurn + temp) >= arr ? wheelTurn + temp - arr : wheelTurn + temp;
            if( wheel[wheelTurn].equals("?") ){
                temp = wheelTurn;
                wheel[wheelTurn] = str;
            } else if (wheel[wheelTurn].equals(str)) {
                temp = wheelTurn;
            } else {
                System.out.print("!");
                System.exit(0);
            }
        }

        int t = Arrays.asList(wheel).indexOf(str);
        int idx = Arrays.asList(wheel).indexOf(str);
        for (int i = 0; i < wheel.length; i++) {
            String outStr = wheel[idx];
            if(idx == 0){ //3 //2 //1 //0
                idx = idx + wheel.length;
            }
            idx--;
            System.out.print(outStr);
        }


    }
}
