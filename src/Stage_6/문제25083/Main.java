package Stage_6.문제25083;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "Hello\n" +
//                "Baekjoon\n" +
//                "Online Judge";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
                "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
                " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
                "   `~\\/\n" + 			// \\, \n 이 제어문자다.
                "      |\n" + 			// \n 이 제어문자다.
                "      |";

        bw.write(s + "\n");

//        br.close();

        bw.flush();
        bw.close();
    }
}
