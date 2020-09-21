import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;
import java.util.regex.*;

//public class Solution {


//    public static void main(String[] args) {
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


//--------------------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for (int i = 0; i < t; i++) {
//
//            try {
//                long x = sc.nextLong();
//                System.out.println(x + " can be fitted in:");
//                if (x >= -128 && x <= 127) System.out.println("* byte\n* short\n* int\n* long");
//                else if (x >= -32768 && x <= 32767)System.out.println("* short\n* int\n* long");
//                else if (x >= -2147483648 && x <= 2147483647) System.out.println("* int\n* long");
//                else if (x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
//            } catch (Exception e) {
//                System.out.println(sc.next() + " can't be fitted anywhere.");
//            }
//
//        }

//--------------------------------------------------------------

//        Scanner scanner = new Scanner(System.in);
//        int line = 0;
//        do {
//            System.out.println(++line + " " + scanner.nextLine());
//        } while (scanner.hasNext());
//        scanner.close();

//--------------------------------------------------------------

//    static int B;
//    static int H;
//    static boolean flag = true;
//
//    static {
//        Scanner scanner = new Scanner(System.in);
//        B = scanner.nextInt();
//        H = scanner.nextInt();
//        if (B <=0 || H <= 0) {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//            flag = false;
//        }
//    }
//
//    public static void main(String[] args) {
//        if (flag) {
//            int area = B * H;
//            System.out.print(area);
//        }
//    }

//--------------------------------------------------------------

//    public static void main(String[] args) {
//
//        DoNotTerminate.forbidExit();
//
//        try {
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//            in.close();
//            String s = Integer.toString(n);
//
//
//            if (n == Integer.parseInt(s)) {
//                System.out.println("Good job");
//            } else {
//                System.out.println("Wrong answer.");
//            }
//        } catch (DoNotTerminate.ExitTrappedException e) {
//            System.out.println("Unsuccessful Termination!!");
//        }
//    }
//}
//
////The following class will prevent you from terminating the code using exit(0)!
//class DoNotTerminate {
//
//    public static class ExitTrappedException extends SecurityException {
//
//        private static final long serialVersionUID = 1;
//    }
//
//    public static void forbidExit() {
//        final SecurityManager securityManager = new SecurityManager() {
//            @Override
//            public void checkPermission(Permission permission) {
//                if (permission.getName().contains("exitVM")) {
//                    throw new ExitTrappedException();
//                }
//            }
//        };
//        System.setSecurityManager(securityManager);
//    }

//--------------------------------------------------------------

//class Result {
//
//    public static String findDay(int month, int day, int year) {
//        Calendar calendar = Calendar.getInstance();
//
//        calendar.set(Calendar.MONTH, month-1);
//        calendar.set(Calendar.DAY_OF_MONTH, day);
//        calendar.set(Calendar.YEAR, year);
//
//        String[] week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
//
//        return week[calendar.get(Calendar.DAY_OF_WEEK)-1];
//    }
//
//}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}

//  }
//}

public class Solution {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("EN", "IN"));
//        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        String us = usFormat.format(payment);
//        String india = indiaFormat.format(payment);
//        String china = chinaFormat.format(payment);
//        String france = franceFormat.format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            if (name.equalsIgnoreCase(i)) {

            }
        }
        while(in.hasNext()) {
            String s=in.nextLine();
        }
    }
}
