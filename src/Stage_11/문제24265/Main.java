package Stage_11.문제24265;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "7";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //문제 24265는 시간복잡도를 구하는 문제
        //시간복잡도 O(n^2)

/**
 *
        MenOfPassion(A[], n) {
            sum <- 0;
            for i <- 1 to n - 1
            for j <- i + 1 to n
            sum <- sum + A[i] × A[j]; # 코드1
            return sum;
        }

 만약 n이 3인경우
 첫번재 for문에서는
 1, 2
 두번째 for문에서는
 i = 1
    j = 2, 3
 i = 2
    j = 3

 tot 3번

 만약 n이 4인경우
 first for.
 1, 2, 3
 second for.
 i = 1
    j = 2, 3, 4
 i = 2
    j = 3, 4
 i = 3
    j = 4

 tot 6

 n(n-1)/2

 */

        long longNumber = Long.parseLong(br.readLine());

        bw.write(String.valueOf(longNumber * (longNumber - 1) / 2) + "\n");
        bw.write("2");

        br.close();

        bw.flush();
        bw.close();
    }
}

