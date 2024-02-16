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

        boolean[][] rangeWidth = new boolean[range][range];
        boolean[][] rangeHeight = new boolean[range][range];

        char[] charArray = paths.toCharArray();
        int x = 0, y = 0;
        for (int i = 0; i < paths.length(); i++) {

            if(charArray[i] == 'U'){
                if(x == 0) continue;

                rangeHeight[x][y] = true;
                rangeHeight[x-1][y] = true;
                x--;
            } else if (charArray[i] == 'D') {
                if(x == range-1) continue;

                rangeHeight[x][y] = true;
                rangeHeight[x+1][y] = true;
                x++;
            }else if (charArray[i] == 'R') {
                if(y == range-1 ) continue;

                rangeWidth[x][y] = true;
                rangeWidth[x][y+1]= true;
                y++;
            }else if (charArray[i] == 'L') {
                if(y == 0) continue;

                rangeWidth[x][y] = true;
                rangeWidth[x][y-1] = true;
                y--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < range; i++) {
            for (int j = 0; j < range; j++) {

                if(rangeHeight[i][j] == rangeWidth[i][j] && rangeHeight[i][j] == true){
                    sb.append("+");
                } else if (rangeHeight[i][j] == true) {
                    sb.append("|");
                } else if (rangeWidth[i][j] == true) {
                    sb.append("-");
                }else{
                    sb.append(".");
                }

            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
