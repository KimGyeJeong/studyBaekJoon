package Stage_6.문제3003;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2 1 2 1 2 1";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        
        for(int i=0; i<input.length; i++){
            result[i] = chess[i] - Integer.parseInt(input[i]);
        }
        for(int i=0; i<result.length; i++){
            bw.write(String.valueOf(result[i]) + " ");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
