package Stage_12.문제2231;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "216";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int nLength = String.valueOf(n).length();
        int result = 0;
        
        for (int i = (n-(nLength * 9)); i<n; i++) {
            int number = i;
            int sum = 0;
            
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            
            if (sum + i == n) {
                result = i;
                break;
            }
        }
        
        bw.write(String.valueOf(result));
        
        br.close();

        bw.flush();
        bw.close();
    }
}