package Stage_5.문제10809;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "baekjoon";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char[] charArray = str.toCharArray();
        
        int[] alphabet = new int[26];
        for(int i=0; i<alphabet.length; i++) {
            alphabet[i] = -1;
        }
        
        for(int i=0; i<charArray.length; i++) {
            if(alphabet[charArray[i] - 97] == -1) {
                alphabet[charArray[i] - 97] = i;
            }
        }
        
        for(int i=0; i<alphabet.length; i++) {
            bw.write(alphabet[i] + " ");
        }


        br.close();

        bw.flush();
        bw.close();
    }
}
