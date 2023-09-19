package Stage_2.문제2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "20";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        if(b>=45)
            System.out.println(a+" "+(b-45));
        else{
            if(a==0)
                System.out.println(23+" "+(b+15));
            else
                System.out.println((a-1)+" "+(b+15));
        }

    }
}