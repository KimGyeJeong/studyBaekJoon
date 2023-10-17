package Stage_5.문제1152;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "The Curious Case of Benjamin Button";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int cnt = 0;
        cnt = input.length;
        
        for(int i=0; i<input.length; i++){
            if(input[i].equals("")){
                cnt--;
            }
        }
        bw.write(String.valueOf(cnt));

        br.close();

        bw.flush();
        bw.close();
    }
}
