package Stage_8.문제2869;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "100 99 1000000000";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        
        int treeClimb = Integer.parseInt(input[0]);
        int treeSlide = Integer.parseInt(input[1]);
        int treeHeight = Integer.parseInt(input[2]);
        
        int day = (treeHeight - treeSlide) / (treeClimb - treeSlide);
        
        if ((treeHeight - treeSlide) % (treeClimb - treeSlide) != 0) {
            day++;
        }
        
        bw.write(String.valueOf(day));

        br.close();

        bw.flush();
        bw.close();
    }
}

