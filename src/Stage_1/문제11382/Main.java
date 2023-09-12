package Stage_1.문제11382;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "77 77 7777";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        //System.out.println(Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + Integer.parseInt(str[2]));
        // 런타임 에러 (NumberFormat)
        // 수정 int --> long

        System.out.println(Long.parseLong(str[0]) + Long.parseLong(str[1]) + Long.parseLong(str[2]));


    }
}
