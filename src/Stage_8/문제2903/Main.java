package Stage_8.문제2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "5";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        
        int result = 2;
        
        for(int i=0; i<cnt; i++){
            result += result - 1;
        }
        
        bw.write(String.valueOf(result * result));

        br.close();

        bw.flush();
        bw.close();
    }
}
