package 아정코테;

import java.util.regex.*;
import java.util.*;

public class SolutionFour {

    public int solution(String[] birth) {
        int answer = 0;

        HashSet<Integer> validMonths = new HashSet<>();
        validMonths.add(1);
        validMonths.add(3);
        validMonths.add(5);
        validMonths.add(7);
        validMonths.add(8);
        validMonths.add(10);
        validMonths.add(12);

        for(int i = 0; i < birth.length ; i++ ){
            String birthStr = birth[i];
            if(!isValidDateFormat(birthStr)){
                continue;
            }
            String[] ymd = birthStr.split("-");

            int yearTemp = Integer.valueOf(ymd[0]);
            int monthTemp = Integer.valueOf(ymd[1]);
            int dayTemp = Integer.valueOf(ymd[2]);
            System.out.println(yearTemp + " " + monthTemp + " " + dayTemp);
            if(yearTemp < 1900 || yearTemp > 2021){
                continue;
            }

            if(monthTemp < 1 || monthTemp > 12){
                continue;
            }

            if(validMonths.contains(monthTemp) && (dayTemp < 1 || dayTemp > 31)){
                continue;
            }else if(!validMonths.contains(monthTemp) && (dayTemp < 1 || dayTemp > 30)){
                continue;
            }else if(monthTemp == 2 ){
                if(( yearTemp % 400 == 0 || (yearTemp % 4 == 0 && yearTemp % 100 != 0) )){
                    if(dayTemp < 1 || dayTemp > 29) continue;
                }else{
                    if(dayTemp < 1 || dayTemp > 28)continue;
                }

            }
            answer++;
        }
        return answer;
    }

    public static boolean isValidDateFormat(String dateString) {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);
        return matcher.matches();
    }

}
