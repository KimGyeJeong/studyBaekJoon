package Stage_10.문제9063;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "4\n" +
//                "2 1\n" +
//                "3 2\n" +
//                "5 2\n" +
//                "3 4";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rowCnt = Integer.parseInt(br.readLine());

        int xMin = 10000;
        int xMax = -10000;
        int yMin = 10000;
        int yMax = -10000;
        
        if (rowCnt < 2)
            bw.write("0");
        else {
            for (int i = 0; i < rowCnt; i++) {
                String[] input = br.readLine().split(" ");

                int x = Integer.parseInt(input[0]);
                int y = Integer.parseInt(input[1]);

                xMin = Math.min(xMin, x);
                xMax = Math.max(xMax, x);
                yMin = Math.min(yMin, y);
                yMax = Math.max(yMax, y);

            }

            int xLength = xMax - xMin;
            int yLength = yMax - yMin;

            bw.write(String.valueOf(xLength * yLength));
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
