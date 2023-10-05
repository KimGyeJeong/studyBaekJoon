package Stage_4.문제10807;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "11\n" +
//                "1 4 1 2 4 2 4 2 3 4 4\n" +
//                "2";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());    // 문제의 정수
        String[] str = br.readLine().split(" ");
        int[] arr = new int[num];
        int count = 0;
        
        for(int i = 0; i<num; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int v = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<num; i++) {
            if(arr[i] == v) {
                count++;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
