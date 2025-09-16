package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

public class IfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(IfElse.isWeird(N)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }

    public static boolean isWeird(int num) {
        return (num % 2 == 1) || (num >= 6 && num <= 20);
    }
}



