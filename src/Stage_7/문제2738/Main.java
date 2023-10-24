package Stage_7.문제2738;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3 3\n" +
//                "1 1 1\n" +
//                "2 2 2\n" +
//                "0 1 0\n" +
//                "3 3 3\n" +
//                "4 4 4\n" +
//                "5 5 100";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        
        for(int i=0; i<row; i++){
            String[] input2 = br.readLine().split(" ");
            for(int j=0; j<col; j++){
                arr1[i][j] = Integer.parseInt(input2[j]);
            }
        }
        for(int i=0; i<row; i++){
            String[] input3 = br.readLine().split(" ");
            for(int j=0; j<col; j++){
                arr2[i][j] = Integer.parseInt(input3[j]);
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                bw.write(String.valueOf(arr1[i][j] + arr2[i][j]) + " ");
            }
            bw.write("\n");
        }



        br.close();

        bw.flush();
        bw.close();
    }
}
