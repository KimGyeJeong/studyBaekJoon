package Stage_6.문제2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "7";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=input; i++){
            for(int j=1; j<=input-i; j++){
                bw.write(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }
        
        for(int i=1; i<input; i++){
            for(int j=1; j<=i; j++){
                bw.write(" ");
            }
            for(int k=1; k<=2*(input-i)-1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}