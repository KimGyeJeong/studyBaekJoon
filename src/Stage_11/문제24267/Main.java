package Stage_11.문제24267;

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

        long n = Long.parseLong(br.readLine());
        
        bw.write(String.valueOf((n*(n-1)*(n-2))/6));
        bw.write("\n3");

        br.close();

        bw.flush();
        bw.close();
    }
}
