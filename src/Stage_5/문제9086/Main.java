package Stage_5.문제9086;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3\n" +
//                "ACDKJFOWIEGHE\n" +
//                "O\n" +
//                "AB";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCnt; i++){
            String str = br.readLine();
            bw.write(str.charAt(0) + "" + str.charAt(str.length() - 1) + "\n");
        }


        br.close();

        bw.flush();
        bw.close();
    }
}