package Stage_2.문제2480;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2 2 2";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        if(a == b && b == c){
            System.out.println(10000 + a * 1000);
        } else if(a == b || a == c){
            System.out.println(1000 + a * 100);
        } else if(b == c){
            System.out.println(1000 + b * 100);
        } else {
            System.out.println(Math.max(Math.max(a, b), c) * 100);
        }
    }
}