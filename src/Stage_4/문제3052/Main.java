package Stage_4.문제3052;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "1\n" +
//                "2\n" +
//                "3\n" +
//                "4\n" +
//                "5\n" +
//                "6\n" +
//                "7\n" +
//                "8\n" +
//                "9\n" +
//                "10";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> hs = new HashSet<Integer>();
        
        for(int i = 0; i<10; i++) {
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }
        
        br.close();
        bw.write(hs.size() + "\n");

        bw.flush();
        bw.close();
    }
}
