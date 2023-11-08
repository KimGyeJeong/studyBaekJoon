package Stage_10.문제5073;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "7 7 7\n" +
//                "6 5 4\n" +
//                "3 2 5\n" +
//                "6 2 6\n" +
//                "0 0 0";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isFinish = true;
        
        while(isFinish) {
            String[] arr = br.readLine().split(" ");
            
            if(arr[0].equals("0") && arr[1].equals("0") && arr[2].equals("0")) {
                isFinish = false;
                break;
            }
            
            int[] arrInt = new int[3];
            
            arrInt[0] = Integer.parseInt(arr[0]);
            arrInt[1] = Integer.parseInt(arr[1]);
            arrInt[2] = Integer.parseInt(arr[2]);

            Arrays.sort(arrInt);
            
            if(arrInt[0] + arrInt[1] <= arrInt[2]) {
                bw.write("Invalid\n");
            } else if(arrInt[0] == arrInt[1] && arrInt[1] == arrInt[2]) {
                bw.write("Equilateral\n");
            } else if(arrInt[0] == arrInt[1] || arrInt[1] == arrInt[2] || arrInt[0] == arrInt[2]) {
                bw.write("Isosceles\n");
            } else {
                bw.write("Scalene\n");
            }

        }

        br.close();

        bw.flush();
        bw.close();
    }
}
