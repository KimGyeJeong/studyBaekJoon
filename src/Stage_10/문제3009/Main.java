package Stage_10.문제3009;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5 5\n" +
//                "5 7\n" +
//                "7 5";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> listX = new ArrayList<>();
        List<String> listY = new ArrayList<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            listX.add(input[0]);
            listY.add(input[1]);
        }

        Collections.sort(listX);
        Collections.sort(listY);
        
        if (listX.get(0).equals(listX.get(1))) {
            x = Integer.parseInt(listX.get(2));
        } else {
            x = Integer.parseInt(listX.get(0));
        }
        
        if (listY.get(0).equals(listY.get(1))) {
            y = Integer.parseInt(listY.get(2));
        } else {
            y = Integer.parseInt(listY.get(0));
        }
        
        bw.write(x + " " + y);

        br.close();

        bw.flush();
        bw.close();
    }
}