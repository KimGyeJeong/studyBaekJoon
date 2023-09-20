package Stage_2.문제2525;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "23 48\n" +
//                "25";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if((b+=c) >= 60){
            a += (b/60);
            b %= 60;
        }
        if(a >= 24){
            a %= 24;
        }
        System.out.println(a+" "+b);
    }
}
