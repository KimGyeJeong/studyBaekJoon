package Stage_7.문제2563;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3\n" +
//                "3 7\n" +
//                "15 7\n" +
//                "5 2";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[100][100];
        
        int input = Integer.parseInt(br.readLine());
        
        for(int i=0; i<input; i++){
            String[] input2 = br.readLine().split(" ");
            int x = Integer.parseInt(input2[0]);
            int y = Integer.parseInt(input2[1]);
            
            for(int j=x; j<x+10; j++){
                for(int k=y; k<y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }
        
        int result = 0;
        
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j] == 1){
                    result++;
                }
            }
        }
        
        bw.write(String.valueOf(result));

        br.close();

        bw.flush();
        bw.close();
    }
}

