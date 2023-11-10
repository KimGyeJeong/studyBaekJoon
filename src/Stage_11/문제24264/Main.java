package Stage_11.문제24264;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "7";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문제 24264는 시간복잡도를 구하는 문제
        //시간복잡도 O(n^2)

        Long longNumber = Long.valueOf(br.readLine());
        longNumber *= longNumber;

        bw.write(String.valueOf(longNumber) + "\n");
        bw.write("2");

        br.close();

        bw.flush();
        bw.close();
    }
}
