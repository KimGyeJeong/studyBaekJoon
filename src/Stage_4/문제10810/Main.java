package Stage_4.문제10810;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5 4\n" +
//                "1 2 3\n" +
//                "3 4 4\n" +
//                "1 4 1\n" +
//                "2 2 2";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int basketNum = Integer.parseInt(str[0]);    // 바구니의 개수
        int cnt = Integer.parseInt(str[1]);      // 공의 개수

        int[] basket = new int[basketNum];
        str = null;

        int startBasket = 0;
        int endBasket = 0;
        int ballNum = 0;

        for(int totCnt = 0; totCnt < cnt; totCnt ++){
            str = br.readLine().split(" ");
            startBasket = Integer.parseInt(str[0]);
            endBasket = Integer.parseInt(str[1]);
            ballNum = Integer.parseInt(str[2]);

            for(int i = startBasket - 1; i < endBasket; i++){
                basket[i] = ballNum;
            }

        }

        for(int i = 0; i < basketNum; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
