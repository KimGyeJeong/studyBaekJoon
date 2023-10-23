package Stage_6.문제25206;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //TEST용 코드
//        String istest = "ObjectOrientedProgramming1 3.0 A+\n" +
//                "IntroductiontoComputerEngineering 3.0 A+\n" +
//                "ObjectOrientedProgramming2 3.0 A0\n" +
//                "CreativeComputerEngineeringDesign 3.0 A+\n" +
//                "AssemblyLanguage 3.0 A+\n" +
//                "InternetProgramming 3.0 B0\n" +
//                "ApplicationProgramminginJava 3.0 A0\n" +
//                "SystemProgramming 3.0 B0\n" +
//                "OperatingSystem 3.0 B0\n" +
//                "WirelessCommunicationsandNetworking 3.0 C+\n" +
//                "LogicCircuits 3.0 B0\n" +
//                "DataStructure 4.0 A+\n" +
//                "MicroprocessorApplication 3.0 B+\n" +
//                "EmbeddedSoftware 3.0 C0\n" +
//                "ComputerSecurity 3.0 D+\n" +
//                "Database 3.0 C+\n" +
//                "Algorithm 3.0 B0\n" +
//                "CapstoneDesigninCSE 3.0 B+\n" +
//                "CompilerDesign 3.0 D0\n" +
//                "ProblemSolving 4.0 P";
//
//        InputStream is = new ByteArrayInputStream(istest.getBytes());
//        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 20;

        String[] input = null;

        String subject = null;
        double score = 0.0f;
        String grade = null;

        double total = 0.0f;
        double result = 0.0f;

        String[] gradeList = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] scoreList = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0, 0};

        for (int i = 0; i < cnt; i++) {
            input = br.readLine().split(" ");

            subject = input[0];
            score = Double.parseDouble(input[1]);
            grade = input[2];

            for (int j = 0; j < gradeList.length; j++) {
                if (grade.equals(gradeList[j])) {
                    total += score * scoreList[j];
                    if (!grade.equals("P")) {
                        result += score;
                    }
                }
            }
        }

        bw.write(String.valueOf(total / result));

        br.close();

        bw.flush();
        bw.close();
    }
}
