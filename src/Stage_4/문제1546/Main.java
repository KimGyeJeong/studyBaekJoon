package Stage_4.문제1546;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "3\n" +
//                "10 20 30";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int subjectCnt = Integer.parseInt(br.readLine());
        String[] score = br.readLine().split(" ");
        double[] scoreDouble = new double[subjectCnt];
        double max = 0;
        
        int[] scoreInt = new int[subjectCnt];
        
        for(int i=0; i<subjectCnt; i++){
            scoreInt[i] = Integer.parseInt(score[i]);
        }
        
        max = (double) Arrays.stream(scoreInt).max().getAsInt();
        
        for(int i=0; i<subjectCnt; i++) {
            scoreDouble[i] = (scoreInt[i] / max) * 100;
        }
        
        double sum = Arrays.stream(scoreDouble).sum();
        
        bw.write(String.valueOf(sum / subjectCnt));

        br.close();

        bw.flush();
        bw.close();
    }
}
