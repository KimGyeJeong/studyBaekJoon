package Stage_10.문제10101;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "40\n" +
//                "40\n" +
//                "100";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 각각의 각도
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        
        if(a + b + c != 180) {
            bw.write("Error");
        } else if(a == b && b == c) {
            bw.write("Equilateral");
        } else if(a == b || b == c || a == c) {
            bw.write("Isosceles");
        } else {
            bw.write("Scalene");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}