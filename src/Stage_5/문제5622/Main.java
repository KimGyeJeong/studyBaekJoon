package Stage_5.문제5622;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "UNUCIC";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        char[] arr = str.toCharArray();

        int sum = 0;

        for(int i=0; i<arr.length ; i++){
            switch (arr[i]) {
                case 'A':
                case 'B':
                case 'C':
                    sum += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    sum += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    sum += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    sum += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    sum += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    sum += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 10;
                    break;
                default: break;
            }

        }
        bw.write(String.valueOf(sum) + "\n");


        br.close();

        bw.flush();
        bw.close();
    }
}
