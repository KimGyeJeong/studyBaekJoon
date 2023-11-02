package Stage_9.문제2581;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "64\n" +
//                "65";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int firstNUM = Integer.parseInt(br.readLine());
        int secondNUM = Integer.parseInt(br.readLine());
        
        int min = 0;
        int primeSum = 0;
        
        for(int i = firstNUM; i<=secondNUM; i++) {
            boolean isPrime = true;
            
            if(i == 1) {
                continue;
            }
            for(int j =2; j<=Math.sqrt(i); j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                if(min == 0) {
                    min = i;
                }
                primeSum += i;
            }
        }
        
        if(primeSum == 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(primeSum + "\n" + min));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
