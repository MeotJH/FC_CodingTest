package 아정코테;

import java.util.Calendar;

public class SolutionOne {

    public static void main(String[] args) {
        System.out.println(solution("2220281"));
    }

    public static String solution(String s) {
        String answer = "";

        String[] pad = {
                ".QZ","ABC","DEF"
                ,"GHI","JKL","MNO"
                ,"PRS","TUV","WXY"
        };

        StringBuilder sb = new StringBuilder();

        int prevDigit = -1;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int digit = Character.getNumericValue(s.charAt(i))-1;

            if(digit == prevDigit){

                count++;
                if(count >= pad[digit].length()){
                    sb.append( pad[digit].charAt( pad[digit].length()-1 ) );
                }

            }else{

                if(prevDigit != -1){
                    sb.append( pad[prevDigit].charAt(count) );
                }
                count = 0;
            }

            prevDigit = digit;
        }

        if(prevDigit != -1){
            sb.append( pad[prevDigit].charAt(count) );
        }























//        int prevDigit = -1;
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            int digit = Character.getNumericValue(s.charAt(i))-1;
//
//            if(digit == prevDigit){
//                count++;
//                if( count >= pad[digit].length()){
//                    sb.append(pad[digit].charAt(pad[digit].length()-1));
//                }
//            }else{
//
//                if(prevDigit != -1){
//                    sb.append(pad[prevDigit].charAt(count));
//                }
//                count = 0;
//            }
//
//            prevDigit = digit;
//        }
//
//        if( prevDigit != -1){
//            sb.append(pad[prevDigit].charAt(count));
//        }

        answer = sb.toString();
        return answer;
    }
}
