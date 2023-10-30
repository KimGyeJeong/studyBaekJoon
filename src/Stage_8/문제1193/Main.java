package Stage_8.문제1193;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "15";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int orderNum = Integer.parseInt(br.readLine());
        int i = 0;

        while (orderNum > 0) {
        	i++;
        	orderNum -= i;
        }
        
        if(i % 2 == 0) {
        	bw.write(String.valueOf(i + orderNum) + "/" + String.valueOf(1 - orderNum));
        }
        else {
        	bw.write(String.valueOf(1 - orderNum) + "/" + String.valueOf(i + orderNum));
        }


        br.close();

        bw.flush();
        bw.close();
    }
}
