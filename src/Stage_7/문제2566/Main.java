package Stage_7.문제2566;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3 23 85 34 17 74 25 52 65\n" +
//                "10 7 39 42 88 52 14 72 63\n" +
//                "87 42 18 78 53 45 18 84 53\n" +
//                "34 28 64 85 12 16 75 36 55\n" +
//                "21 77 45 35 28 75 90 76 1\n" +
//                "25 87 65 15 28 11 37 28 74\n" +
//                "65 27 75 41 7 89 78 64 39\n" +
//                "47 47 70 45 23 65 3 41 44\n" +
//                "87 13 82 38 31 12 29 29 80";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int row = 0;
        int col = 0;
        
        for(int i=0; i<9; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<9; j++){
//                if(Integer.parseInt(input[j]) > max){     // 얘때문에 계속 틀렸었음
                if(Integer.parseInt(input[j]) >= max){
                    max = Integer.parseInt(input[j]);
                    row = i+1;
                    col = j+1;
                }
            }
        }
        
        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(row) + " " + String.valueOf(col) + " ");

        br.close();

        bw.flush();
        bw.close();
    }
}

