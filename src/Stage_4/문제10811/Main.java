package Stage_4.문제10811;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5 4\n" +
//                "1 2\n" +
//                "3 4\n" +
//                "1 4\n" +
//                "2 2";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(str[0])];
        int cnt = Integer.parseInt(str[1]);
        
        int startNum = 0;
        int endNum = 0;
        
        for(int i = 0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        
        for(int i = 0; i<cnt; i++) {
            str = null;
            str = br.readLine().split(" ");
            
            startNum = Integer.parseInt(str[0]);
            endNum = Integer.parseInt(str[1]);

            while (startNum < endNum) {
                int temp = arr[startNum - 1];
                arr[startNum - 1] = arr[endNum - 1];
                arr[endNum - 1] = temp;
                startNum++;
                endNum--;
            }
        }
        
        for(int i = 0; i<arr.length; i++) {
            bw.write(arr[i] + " ");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
