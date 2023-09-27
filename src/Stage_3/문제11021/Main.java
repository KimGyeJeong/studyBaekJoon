package Stage_3.문제11021;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5\n" +
//                "1 1\n" +
//                "12 34\n" +
//                "5 500\n" +
//                "40 60\n" +
//                "1000 1000";

//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int num = Integer.parseInt(br.readLine());    // 문제의 정수

        for(int i = 0; i<num; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            bw.write("Case #" + (i+1) + ": " + (a+b) + "\n");
        }
        bw.flush();
        bw.close();
    }
}