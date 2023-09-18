package Stage_2.문제9498;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "20";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);

        switch (a/10) {
            case 10 :
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }

    }
}
