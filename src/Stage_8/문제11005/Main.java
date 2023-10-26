package Stage_8.문제11005;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "60466175 36";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int n = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        String tempstr = "";
        
        while(n > 0) {
        	int temp = n % b;
        	if(temp >= 10) {
                tempstr += String.valueOf((char)(temp + 55));
        	}
        	else {
                tempstr += String.valueOf(temp);
        	}
        	n /= b;
        }

        // StringBuffer 클래스의 reverse() 메소드를 사용하여 문자열을 뒤집는다.
        // 뒤집어서 출력해야 함.
        bw.write(new StringBuffer(tempstr).reverse().toString());
        
        br.close();

        bw.flush();
        bw.close();
    }
}
