package Stage_10.문제14215;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "41 64 16";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] arrInt = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])};
        
        Arrays.sort(arrInt);
        
        if(arrInt[0] + arrInt[1] <= arrInt[2]) {
            bw.write(String.valueOf((arrInt[0] + arrInt[1]) * 2 - 1));
        } else {
            bw.write(String.valueOf(arrInt[0] + arrInt[1] + arrInt[2]));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
