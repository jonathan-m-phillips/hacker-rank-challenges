import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        // You must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//--------------------------------------------------------------
        // Given an integer, , perform the following conditional actions:
        //
        //If n is odd, print Weird
        //If n is even and in the inclusive range of 2 to 5, print Not Weird
        //If n is even and in the inclusive range of 6 to 20, print Weird
        //If n is even and greater than 20, print Not Weird
//        final Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//
//        if (N % 2 != 0) {
//            System.out.println("Weird");
//        } else if (N > 1 && N < 6 || N > 20) {
//            System.out.println("Not Weird");
//        } else if (N % 2 == 0 && N > 5) {
//            System.out.println("Weird");
//        }

//--------------------------------------------------------------
        //you must read an integer, a double, and a String from stdin, then print the values
        // according to the instructions in the Output Format section below.
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);

//--------------------------------------------------------------
//        Scanner sc=new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            String s1=sc.next();
//            int x=sc.nextInt();
//            if (x < 10) {
//                System.out.printf("%-15s0%d0\n", s1, x);
//            } else if (x < 100) {
//                System.out.printf("%-15s0%d\n", s1, x);
//            } else if (x > 99) {
//                System.out.printf("%-15s%d\n", s1, x);
//            }
//        }
//        System.out.println("================================");

//--------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//
//        for (int i = 1; i < 11; i++) {
//            int n = N * i;
//            System.out.println(N + " x " + i + " = " + n);
//        }

//--------------------------------------------------------------
        // You are given q queries in the form of a, b, and n. For each query,
        // print the series corresponding to the given a, b, and n values as a
        // single line of n space-separated integers.
//        Scanner in = new Scanner(System.in);
//        int t=in.nextInt();
//        int count = 1;
//        for(int i=0;i<t;i++){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//            arrange(a, b, n);
//        }
//        in.close();
//
//    }
//
//    public static void arrange(int a,int b,int n){
//        int sum = a+b;
//        for(int j=1; j<=n; j++){
//            System.out.print(sum+" ");
//            sum+=((Math.pow(2,j))*b);
//        }
//        System.out.println();
//    }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte\n* short\n* int\n* long");
                else if (x >= -32768 && x <= 32767)System.out.println("* short\n* int\n* long");
                else if (x >= -2147483648 && x <= 2147483647) System.out.println("* int\n* long");
                else if (x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}
