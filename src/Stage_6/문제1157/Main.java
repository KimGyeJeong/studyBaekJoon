package Stage_6.문제1157;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "baaa";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().toUpperCase();
        int[] cnt = new int[26];
        
        for(int i=0; i<input.length(); i++){
            cnt[input.charAt(i) - 65]++;
        }
        
        int max = -1;
        char result = '?';
        
        for(int i=0; i<cnt.length; i++){
            if(cnt[i] > max){
                max = cnt[i];
                result = (char)(i + 65);
            }else if(cnt[i] == max){
                result = '?';
            }
        }
        
        bw.write(result);

        br.close();

        bw.flush();
        bw.close();
    }
}
