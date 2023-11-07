package Stage_10.문제15894;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "4";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long square = Long.parseLong(br.readLine());
        
        bw.write(String.valueOf(square * 4));
        
        
        br.close();

        bw.flush();
        bw.close();
    }
}
