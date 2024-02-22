package Part1;

import java.io.*;
import java.util.*;

public class Bj7785 {

    public static Boolean setIsEnter(String enterStr){
        return enterStr.equals("enter")? true : false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer inputLength = Integer.valueOf(br.readLine());

        HashMap<String,Boolean> map = new HashMap<>();
        for (int i = 0; i < inputLength; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enterStr = st.nextToken();
            map.put(name,setIsEnter(enterStr));

        }
        Set<String> strings = map.keySet();
        List<String> keySet = new ArrayList<>(strings);
        Collections.sort(keySet, Comparator.reverseOrder());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String key : keySet){
            if(map.get(key)){
                bw.write(key + "\n");
            }
        }
        bw.flush();


    }
}
