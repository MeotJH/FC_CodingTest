package Part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Bj3085 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );

        Integer nums = Integer.valueOf(br.readLine());

        /**
         * [ [],[],[] ], 00 01 02
         * [ [],[],[] ], 10 11 12
         * [ [],[],[] ], 20 21 22
         */


        char[][] board = new char[nums][nums];
        for (int i = 0; i < nums; i++) {
            char[] charArray = br.readLine().toCharArray();
            for (int j = 0; j < nums; j++) {
                board[i][j] = charArray[j];
            }
        }


        int candy = 0;


        for (int i = 0; i < nums; i++) {
            char temp = 0;

            int rowTempCandy = 0;
            int lengthTempCandy = 0;
            for (int j = 0; j < nums; j++) {
                char[][] clone = new char[nums][nums];
                for (int k = 0; k < nums; k++) {
                    System.arraycopy(board[k], 0, clone[k], 0, clone[k].length);
                }

                if( ( j+1 < nums ) && ( clone[i][j+1] != clone[i][j] ) ){

                    temp = clone[i][j+1];
                    clone[i][j+1] =clone[i][j];
                    clone[i][j] = temp ;
                    int tempCandy = getCandy(nums, clone);
                    if(tempCandy > rowTempCandy){
                        rowTempCandy = tempCandy;
                    }
                    int si = 0;
                }

            }

            for (int k = 0; k < nums; k++) {

                char[][] clone = new char[nums][nums];
                for (int p = 0; p < nums; p++) {
                    System.arraycopy(board[p], 0, clone[p], 0, clone[p].length);
                }

                if( ( k+1 < nums ) && ( clone[k+1][i] != clone[k][i] ) ){


                    temp = clone[k+1][i];
                    clone[k+1][i] =clone[k][i];
                    clone[k][i] = temp;

                    int tempCandy = getCandy(nums, clone);
                    if(tempCandy > rowTempCandy){
                        lengthTempCandy = tempCandy;
                    }
                    int si = 0;
                }

            }

            rowTempCandy = rowTempCandy > lengthTempCandy ? rowTempCandy : lengthTempCandy;
            if( rowTempCandy > candy ){
                candy = rowTempCandy;
            }
        }
        System.out.println(candy);

    }

    private static int getCandy(Integer nums, char[][] board) {
        int candy  = 0;
        for (int i = 0; i < nums; i++) {
            int rowTempCandy = 1;
            int lengthTempCandy = 1;
            char rowTemp = 0;
            char lengthTemp = 0;
            for (int j = 0; j < nums; j++) {
                if(j == 0){
                    rowTemp = board[i][j];
                    lengthTemp = board[j][i];
                }else{

                    if(rowTemp == board[i][j]){
                        rowTempCandy++;
                    }else{
                        lengthTemp = board[j][i];
                        rowTempCandy = 1;
                    }
                }
            }


            for (int j = 0; j < nums; j++) {
                if(j == 0){
                    lengthTemp = board[j][i];
                }else{

                    if(lengthTemp == board[j][i]){
                        lengthTempCandy++;
                    }else{
                        lengthTemp = board[j][i];
                        lengthTempCandy = 1;
                    }
                }
            }

            rowTempCandy = rowTempCandy > lengthTempCandy ? rowTempCandy : lengthTempCandy;
            if(rowTempCandy > candy){
                candy = rowTempCandy;
            }
        }
        return candy;
    }
}
