package Stage_9.문제2501;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2735 1";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int number = Integer.parseInt(input[0]);
        int ordinalNumber = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<Integer>();
        try {

            for (int i = number; i > 0; i--) {
                if (number % i == 0) {
                    list.add(i);
                }
            }
            list.sort(Comparator.naturalOrder());
            bw.write(String.valueOf(list.get(ordinalNumber - 1)));
        } catch (Exception e) {
            bw.write("0");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
