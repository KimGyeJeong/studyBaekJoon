package Stage_2.문제2753;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "1992";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
        int a = Integer.parseInt(br.readLine());
        if(a%4 == 0 && a%100 != 0)
            System.out.println("1");
        else if(a%400 == 0)
            System.out.println("1");
        else
            System.out.println("0");


    }
}
