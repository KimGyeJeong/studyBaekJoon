package Stage_4.문제2562;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3\n" +
//                "29\n" +
//                "38\n" +
//                "12\n" +
//                "57\n" +
//                "74\n" +
//                "40\n" +
//                "85\n" +
//                "61";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCnt = 9;
        int maxNum = 0;
        int maxNumIndex = 0;
        
        int[] arr = new int[arrCnt];
        
        for(int i = 0; i<arrCnt; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            
            if(i == 0) {
                maxNum = arr[i];
                maxNumIndex = i;
            }
            else {
                if(maxNum < arr[i]) {
                    maxNum = arr[i];
                    maxNumIndex = i;
                }
            }
        }
        
        bw.write(maxNum + "\n" + (maxNumIndex+1));

        bw.flush();
        bw.close();
    }
}