package Stage_6.문제2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "c=c=";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int cnt = 0;
        
        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch == 'c' && i < input.length()-1){
                if(input.charAt(i+1) == '=' || input.charAt(i+1) == '-'){
                    i++;
                }
            }else if(ch == 'd' && i < input.length()-1){
                if(input.charAt(i+1) == '-'){
                    i++;
                }else if(input.charAt(i+1) == 'z' && i < input.length()-2){
                    if(input.charAt(i+2) == '='){
                        i += 2;
                    }
                }
            }else if((ch == 'l' || ch == 'n') && i < input.length()-1){
                if(input.charAt(i+1) == 'j'){
                    i++;
                }
            }else if((ch == 's' || ch == 'z') && i < input.length()-1){
                if(input.charAt(i+1) == '='){
                    i++;
                }
            }
            cnt++;
        }
        
        bw.write(String.valueOf(cnt));

        br.close();

        bw.flush();
        bw.close();
    }
}
