package Stage_3.문제25304;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "250000\n" +
//                "4\n" +
//                "20000 5\n" +
//                "30000 2\n" +
//                "10000 6\n" +
//                "5000 8";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int totAmt = Integer.parseInt(br.readLine());    //총금액
        int totCnt = Integer.parseInt(br.readLine());    //총 물건 종류 갯수
        
        int totSum = 0;

        for(int i = 0; i < totCnt; i++) {
            String[] arr = br.readLine().split(" ");
            int amt = Integer.parseInt(arr[0]);    //물건 가격
            int cnt = Integer.parseInt(arr[1]);    //물건 갯수
            totSum += amt * cnt;
        }
        
        String result = totAmt == totSum ? "Yes" : "No";
        System.out.println(result);
    }
}