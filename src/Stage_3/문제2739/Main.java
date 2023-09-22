package Stage_3.문제2739;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}