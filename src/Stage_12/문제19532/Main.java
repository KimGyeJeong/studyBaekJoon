package Stage_12.문제19532;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2 5 8 3 -4 -11";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);
        int f = Integer.parseInt(input[5]);
        
        int x = 0;
        int y = 0;
        
        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if (a*i + b*j == c && d*i + e*j == f) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        bw.write(String.valueOf(x + " " + y));

        br.close();

        bw.flush();
        bw.close();
    }
}
