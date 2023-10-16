package Stage_5.문제11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "11\n" +
//                "10987654321";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int numCnt = Integer.parseInt(str);
        
        str= br.readLine();
        char[] charArray = str.toCharArray();
        
        int numSum = 0;
        for(int i=0; i<numCnt; i++) {
            numSum += Integer.parseInt(String.valueOf(charArray[i]));
        }
        bw.write(numSum + "");
        

        br.close();

        bw.flush();
        bw.close();
    }
}