package Stage_5.문제11718;

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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isEnd = true;

        String str = null;

        while (isEnd){
            str = br.readLine();
            if(str == null) {
                isEnd = false;
                break;
            }
            bw.write(str + "\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
