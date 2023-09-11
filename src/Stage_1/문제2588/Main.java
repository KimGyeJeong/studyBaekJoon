package Stage_1.문제2588;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "472\n" +
//                "385";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        System.out.println(A*(B%10));
        System.out.println(A*((B%100)-(B%10))/10);
        System.out.println(A*(B/100));

        System.out.println(A*B);
    }
}



