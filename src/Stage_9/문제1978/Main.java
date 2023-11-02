package Stage_9.문제1978;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "4\n" +
//                "1 3 5 7";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int primeCnt = 0;
        
        for(int i = 0; i<cnt ; i++) {
            boolean isPrime = true;
            
            int number = Integer.parseInt(input[i]);
            
            if(number == 1) {
//                isPrime = false;
                continue;
            }
            for(int j =2; j<=Math.sqrt(number); j++) {
                if(number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime) {
                primeCnt++;
            }
        }
        
        bw.write(String.valueOf(primeCnt + ""));
        
        br.close();

        bw.flush();
        bw.close();
    }
}
