package Stage_3.문제10950;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5\n" +
//                "1 1\n" +
//                "2 3\n" +
//                "3 4\n" +
//                "9 8\n" +
//                "5 2";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int a = Integer.parseInt(br.readLine());

        for(int i = 0; i<a; i++){
            String[] str = br.readLine().split(" ");
            int b = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            System.out.println(b+c);
        }
    }
}