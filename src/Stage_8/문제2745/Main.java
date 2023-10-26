package Stage_8.문제2745;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "ZZZZZ 36";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        
        for(int i = 0; i<26; i++) {
            	arr[i] = i+10;
        }
        
        String[] input = br.readLine().split(" ");
        String num = input[0];
        int b = Integer.parseInt(input[1]);
        
        int result = 0;
        
        for(int i=0; i<num.length(); i++) {
        	if(num.charAt(i) >= 'A' && num.charAt(i) <= 'Z') {
        		result += arr[num.charAt(i) - 'A'] * Math.pow(b, num.length()-i-1);
        	}
        	else {
        		result += (num.charAt(i) - '0') * Math.pow(b, num.length()-i-1);
        	}
        }
        
        bw.write(String.valueOf(result));
        
        br.close();

        bw.flush();
        bw.close();
    }
}
