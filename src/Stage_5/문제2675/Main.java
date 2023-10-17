package Stage_5.문제2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "2\n" +
//                "3 ABC\n" +
//                "5 /HTP";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCnt = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수
        
        for(int i=0; i<testCnt; i++){
            String[] input = br.readLine().split(" "); // 테스트 케이스 입력
            int repeatCnt = Integer.parseInt(input[0]); // 반복 횟수
            String[] str = input[1].split(""); // 문자열을 한 글자씩 잘라 배열에 저장

            for(int j=0; j<str.length; j++){
                for(int k=0; k<repeatCnt; k++){
                    bw.write(str[j]);
                }
            }
            bw.write("\n");
        }

        br.close();

        bw.flush();
        bw.close();
    }
}
