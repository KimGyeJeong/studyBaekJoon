package Stage_9.문제5086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "8 16\n" +
//                "32 4\n" +
//                "17 5\n" +
//                "0 0";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input= null;

        while (true) {
            input = br.readLine().split(" ");

            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);

            if (first == 0 && second == 0) {
                break;
            }

            if (first % second == 0) {
                bw.write("multiple");
            } else if (second % first == 0) {
                bw.write("factor");
            } else {
                bw.write("neither");
            }
            bw.newLine();
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
