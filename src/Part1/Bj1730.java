package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1730 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

        int range = Integer.valueOf(br.readLine());
        String paths  = br.readLine();
        //길 없을때 예외처리

        char[][] routes = new char[range][range];

        boolean[][] rangeWidth = new boolean[range][range];
        boolean[][] rangeHeight = new boolean[range][range];

        char[] charArray = paths.toCharArray();
        int x, y = 0;
        for (int i = 0; i < paths.length(); i++) {

            if(charArray[i] == 'U'){


            } else if (charArray[i] == 'D') {

            }else if (charArray[i] == 'R') {

            }else if (charArray[i] == 'L') {

            }
        }
    }
}
