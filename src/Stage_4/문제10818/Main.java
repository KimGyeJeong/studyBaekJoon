package Stage_4.문제10818;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5\n" +
//                "20 10 35 30 7";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int arrCnt = Integer.parseInt(br.readLine());
        int minNum = 0;
        int maxNum = 0;

        String[] str = br.readLine().split(" ");
        
        for(int i = 0; i<arrCnt; i++) {
            if(i == 0) {
                minNum = Integer.parseInt(str[i]);
                maxNum = Integer.parseInt(str[i]);
            }
            else {
                if(minNum > Integer.parseInt(str[i])) {
                    minNum = Integer.parseInt(str[i]);
                }
                if(maxNum < Integer.parseInt(str[i])) {
                    maxNum = Integer.parseInt(str[i]);
                }
            }
        }
        bw.write(minNum + " " + maxNum);


        bw.flush();
        bw.close();
    }
}