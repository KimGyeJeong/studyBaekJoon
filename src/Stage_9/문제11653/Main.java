package Stage_9.문제11653;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "9991";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        
        for(int i = 2; i<=input; i++) {
            while(input % i == 0) {
                bw.write(String.valueOf(i + "\n"));
                input /= i;
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
