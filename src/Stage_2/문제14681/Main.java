package Stage_2.문제14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "20";
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > 0 && b > 0) {
            System.out.println("1");
        } else if (a < 0 && b > 0) {
            System.out.println("2");
        } else if (a < 0 && b < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }

    }
}
