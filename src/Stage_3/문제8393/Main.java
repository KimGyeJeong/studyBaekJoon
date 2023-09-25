package Stage_3.문제8393;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "4";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int n = 0;
        int m = 0;

//        for (int i = 1; i <= a; i++) {
//            n = n + i;
//        }
//        System.out.println(n);
        
        while(m <= a){
            n = n + m++;
        }
        System.out.println(n);
        
    }
}