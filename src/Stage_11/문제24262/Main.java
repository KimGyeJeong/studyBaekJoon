package Stage_11.문제24262;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "1";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문제 24262는 시간복잡도를 구하는 문제
        //시간복잡도 O(1)

        bw.write("1\n");
        bw.write("0");

        br.close();

        bw.flush();
        bw.close();
    }
}