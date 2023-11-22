package Stage_12.문제2798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "10 500\n" +
//                "93 181 245 214 315 36 185 138 216 295";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int cardCnt = Integer.parseInt(arr[0]);
        int maxNum = Integer.parseInt(arr[1]);

        int[] arrInt = new int[cardCnt];
        arr = br.readLine().split(" ");
        for (int i = 0; i < cardCnt; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int max = 0;

        for (int i = 0; i < cardCnt - 2; i++) {
            for (int j = i + 1; j < cardCnt - 1; j++) {
                for (int k = j + 1; k < cardCnt; k++) {
                    int sum = Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) + Integer.parseInt(arr[k]);
                    if (sum <= maxNum && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(max));

        br.close();

        bw.flush();
        bw.close();
    }
}
