package Stage_3.문제25314;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "20";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int num = Integer.parseInt(br.readLine());    // 문제의 정수

        String result = "";
        for(int i = 0; i<num/4; i++) {
            result += "long ";
        }
        
        System.out.println(result + "int");
    }
}