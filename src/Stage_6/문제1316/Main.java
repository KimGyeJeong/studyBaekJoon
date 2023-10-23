package Stage_6.문제1316;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "9\n" +
//                "aaa\n" +
//                "aaazbz\n" +
//                "babb\n" +
//                "aazz\n" +
//                "azbz\n" +
//                "aabbaa\n" +
//                "abacc\n" +
//                "aba\n" +
//                "zzaz";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        String[] input = new String[cnt];

        for(int i=0; i<cnt; i++){
            input[i] = br.readLine();
        }
        
        for(int i=0; i<cnt; i++){
            boolean[] check = new boolean[26];
            boolean flag = true;
            for(int j=0; j<input[i].length(); j++){
                if(check[input[i].charAt(j) - 97] == false){
                    check[input[i].charAt(j) - 97] = true;
                }else if(check[input[i].charAt(j) - 97] == true && input[i].charAt(j) != input[i].charAt(j-1)){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                result++;
            }
        }
        
        bw.write(String.valueOf(result));
        
        br.close();

        bw.flush();
        bw.close();
    }
}