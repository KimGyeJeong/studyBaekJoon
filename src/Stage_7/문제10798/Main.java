package Stage_7.문제10798;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "AABCDD\n" +
//                "afzz\n" +
//                "09121\n" +
//                "a8EWg6\n" +
//                "P5h3kx";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15];
        
        for(int i=0; i<5; i++){
            String[] input = br.readLine().split("");
            for(int j=0; j<input.length; j++){
                arr[i][j] = input[j];
            }
        }
        
        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i] != null){
                    bw.write(arr[j][i]);
                }
            }
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
