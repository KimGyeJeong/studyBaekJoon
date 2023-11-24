package Stage_12.문제1018;

import java.io.*;

public class Main {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "9 23\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBB\n" +
//                "BBBBBBBBBBBBBBBBBBBBBBW";

//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        
        int n_row = n-7;
        int m_col = m-7;
        
        for(int i = 0; i < n_row; i++) {
            for(int j = 0; j < m_col; j++) {
                find(i,j);
            }
        }

        bw.write(String.valueOf(min));

        br.close();

        bw.flush();
        bw.close();
        
    }
    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x][y];

        for(int i = x; i < end_x; i++) {
            for(int j = y; j < end_y; j++) {
                if(arr[i][j] != TF) {
                    count++;
                }

                TF = (!TF);
            }

            TF = !TF;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
