package Stage_4.문제10871;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "10 5\n" +
//                "1 10 4 9 2 3 8 5 7 6";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 문제의 정수
        String[] str = br.readLine().split(" ");
        int arrCnt = Integer.parseInt(str[0]);
        int maxNum = Integer.parseInt(str[1]);
        
        str = null;
        str = br.readLine().split(" ");
        
        for(int i = 0; i<arrCnt; i++) {
            if(Integer.parseInt(str[i]) < maxNum) {
                bw.write(str[i] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
