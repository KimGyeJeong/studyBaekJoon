package Stage_5.문제27866;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "Baekjoon\n" +
//                "4";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String string = br.readLine();
        char[] charArray = string.toCharArray();

        int outputNum = Integer.parseInt(br.readLine());

        bw.write(charArray[outputNum - 1]);

        br.close();

        bw.flush();
        bw.close();
    }
}

