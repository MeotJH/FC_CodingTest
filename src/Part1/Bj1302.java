package Part1;

import java.io.*;
import java.util.*;

public class Bj1302 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer number = Integer.valueOf(br.readLine());

        HashMap<String,Integer> selledBook = new HashMap<>();
        for (int i = 0; i < number; i++) {
            String bookOne = br.readLine();
            selledBook.put(bookOne, selledBook.getOrDefault(bookOne, 0 ) + 1 );
        }

        List<String> sortBookName = new ArrayList<>(selledBook.keySet());
        sortBookName.sort( (o1, o2) -> {
            if( selledBook.get(o2) == selledBook.get(o1)){
                return o1.compareTo(o2);
            }
            return selledBook.get(o2) - selledBook.get(o1);
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sortBookName.get(0));
        bw.flush();

    }
}
