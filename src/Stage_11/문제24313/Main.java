package Stage_11.문제24313;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "7 7\n" +
//                "8\n" +
//                "10";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a1 = Integer.parseInt(arr[0]);
        int a0 = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf((a1*n0 + a0 <= c* n0) && (c >= a1) ? 1:0));

        br.close();

        bw.flush();
        bw.close();
    }
}