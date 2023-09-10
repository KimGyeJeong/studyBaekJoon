package Stage_1.문제1008;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //TEST용 코드
//        String istest = "4 5";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String[] str = br.readLine().split(" ");

        System.out.println(Double.parseDouble(str[0]) / Double.parseDouble(str[1]));
    }
}
