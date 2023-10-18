package Stage_5.문제2908;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "734 893";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        for(int i = 0; i < str.length; i++){
            str[i] = new StringBuffer(str[i]).reverse().toString();
        }

        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        bw.write(String.valueOf(Math.max(a, b)) + "\n");

        br.close();

        bw.flush();
        bw.close();
    }
}
