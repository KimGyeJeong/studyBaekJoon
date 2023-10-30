package Stage_8.문제2292;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "58";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int roomNum = Integer.parseInt(br.readLine());
        
        int result = 1;
        
        //6, 12, 18
        while (roomNum > 1) {
        	roomNum -= 6 * result;
        	result++;
        }
        bw.write(String.valueOf(result));

        br.close();

        bw.flush();
        bw.close();
    }
}
