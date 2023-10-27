package Stage_8.문제2720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3\n" +
//                "124\n" +
//                "25\n" +
//                "194";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = {25, 10, 5, 1};
        int cnt = Integer.parseInt(br.readLine());
        for(int i =0 ; i< cnt; i++){
            int input = Integer.parseInt(br.readLine());
            for(int j=0; j<arr.length; j++){
                bw.write(String.valueOf(input/arr[j]) + " ");
                input %= arr[j];
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
