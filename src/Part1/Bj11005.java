package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Bj11005 {

    public static void main(String[] args) throws IOException {

        /**
60466175
36
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int input = Integer.valueOf(st.nextToken());
        int number = Integer.valueOf(st.nextToken());

        List<Integer> list = new ArrayList<>();
         while(input >= number){
            int temp = input % number;
             list.add(temp);
             input = input / number;
        }

         list.add(input);

        Iterator<Integer> iterator = list.iterator();
         StringBuilder sb = new StringBuilder();

        for (int i = list.size()-1; i >= 0 ; i--) {
            Integer one = list.get(i);
            if( number >= 10 && one >= 10){
                sb.append( Character.toChars(one + 55) );
            }else{
                sb.append(one);
            }
        }

        System.out.println(sb);
    }
}
