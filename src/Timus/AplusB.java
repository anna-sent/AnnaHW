package Timus;


import java.io.PrintWriter;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a+b;

        out.println(sum);
        out.flush();

    }
}
