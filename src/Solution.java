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

        //you must read an integer, a double, and a String from stdin, then print the values
        // according to the instructions in the Output Format section below.
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}
