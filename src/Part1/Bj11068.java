package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj11068 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int nums = Integer.valueOf(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums; i++) {
            Integer palindrome = Integer.valueOf(bf.readLine());

            boolean palindromeRslt = false;
            LoopNumber:
            for (int j = 2; j < 65; j++) {
                int number = j;
                List<Integer> list = new ArrayList<>();
                int palindromeTemp = palindrome;
                while(palindromeTemp >= number){
                    int temp = palindromeTemp % number;
                    list.add(temp);
                    palindromeTemp = palindromeTemp / number;
                }
                list.add(palindromeTemp);

                //list에 담겨진게 nummber로 만들어진 진법
                LoopDefine:
                for (int k = 0; k < list.size()/2 ; k++) {
                    int end = list.size()-(1+k);
                    int start = k;

                    if (!(list.get(start) == list.get(end)) ){
                        palindromeRslt= false;
                        break LoopDefine;
                    }else{
                        palindromeRslt = true;
                    }
                }

                if(palindromeRslt == true){
                    //회문이니 더이상 회문인거 찾으려고 안해도됨
                    break LoopNumber;
                }
            }

            if(palindromeRslt == true){
                sb.append("1").append("\n");
            }else{
                sb.append("0").append("\n");
            }

        }

        System.out.println(sb);
    }
}
