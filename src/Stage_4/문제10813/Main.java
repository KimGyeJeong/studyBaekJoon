package Stage_4.문제10813;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5 4\n" +
//                "1 2\n" +
//                "3 4\n" +
//                "1 4\n" +
//                "2 2";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        //12345
        //21345
        //21435
        //31425

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int basketNum = Integer.parseInt(str[0]);
        int changeCnt = Integer.parseInt(str[1]);

        int[] basket = new int[basketNum];

        for (int i = 0; i < basketNum; i++) {
            basket[i] = i + 1;
        }

        int temp = 0;

        for (int i = 0; i < changeCnt; i++) {
            str = br.readLine().split(" ");
            int startBasket = Integer.parseInt(str[0]);
            int endBasket = Integer.parseInt(str[1]);

            temp = basket[startBasket - 1];
            basket[startBasket - 1] = basket[endBasket - 1];
            basket[endBasket - 1] = temp;
        }

        for (int i = 0; i < basketNum; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
