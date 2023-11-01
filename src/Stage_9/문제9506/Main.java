package Stage_9.문제9506;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "6\n" +
//                "12\n" +
//                "28\n" +
//                "-1";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            
            if (input.equals("-1")) {
                break;
            }
            
            int number = Integer.parseInt(input);
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i = number-1; i > 0; i--) {
                if (number % i == 0) {
                    list.add(i);
                }
            }
            IntSummaryStatistics stat = list.stream().mapToInt(Integer::intValue).summaryStatistics();
            
            if (stat.getSum() == number) {
                list.sort(Comparator.naturalOrder());
                bw.write(number + " = ");
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {
                        bw.write(list.get(i) + "\n");
                    } else {
                        bw.write(list.get(i) + " + ");
                    }
                }
            } else {
                bw.write(number + " is NOT perfect.\n");
            }
            
        }
        
        br.close();

        bw.flush();
        bw.close();
    }
}
