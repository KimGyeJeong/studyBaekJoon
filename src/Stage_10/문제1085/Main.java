package Stage_10.문제1085;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "653 375 1000 1000";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int h = Integer.parseInt(input[3]);

        int min = Math.min(x, w - x);

        if(y < h-y) {
            if(min > y) min = y;
        }
        else {
            if(min > h-y) min = h-y;
        }

        bw.write(String.valueOf(min));


        br.close();

        bw.flush();
        bw.close();
    }
}
