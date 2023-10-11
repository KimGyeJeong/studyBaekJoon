package Stage_4.문제5597;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "9\n" +
//                "30\n" +
//                "6\n" +
//                "12\n" +
//                "10\n" +
//                "20\n" +
//                "21\n" +
//                "11\n" +
//                "7\n" +
//                "5\n" +
//                "28\n" +
//                "4\n" +
//                "18\n" +
//                "29\n" +
//                "17\n" +
//                "19\n" +
//                "27\n" +
//                "13\n" +
//                "16\n" +
//                "26\n" +
//                "14\n" +
//                "23\n" +
//                "22\n" +
//                "15\n" +
//                "3\n" +
//                "1\n" +
//                "24\n" +
//                "25";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[30];
        
        for(int i = 0; i<28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 1; i<=30; i++) {
            boolean isExist = false;
            for(int j = 0; j<28; j++) {
                if(i == arr[j]) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}