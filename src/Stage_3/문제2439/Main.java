package Stage_3.문제2439;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int num = Integer.parseInt(br.readLine());    // 문제의 정수

        for(int i =0; i<num; i++) {
            for(int j = 0; j<num-i-1; j++) {
                bw.write(" ");
            }
            for(int k = 0; k<=i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}