package Stage_3.문제10951;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "1 1\n" +
//                "2 3\n" +
//                "3 4\n" +
//                "9 8\n" +
//                "5 2\n" +
//                "0 0";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            while (true) {
                String[] str = br.readLine().split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);

                bw.write(a + b + "\n");
            }
        } catch (Exception e) {
            bw.flush();
            bw.close();
        }
    }
}
