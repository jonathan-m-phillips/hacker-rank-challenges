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
//
//public class Solution {
//
//    public static void main(String[] args) {
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

//        Scanner in = new Scanner(System.in);
//        int n=in.nextInt();
//        in.nextLine();
//        for(int i=0;i<n;i++) {
//            String name=in.nextLine();
//            int phone=in.nextInt();
//            in.nextLine();
//            if (name.equalsIgnoreCase(i)) {
//
//            }
//        }
//        while(in.hasNext()) {
//            String s=in.nextLine();
//        }
//    }
//}


// ------------------------------------------

//public class Solution {
//    public static String reverse (String input) {
//        if (input == null || input.isEmpty()) {
//            return input;
//        }
//        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
//    }
//
//    public static boolean isPalindromeString(String string) {
//        String reverse = reverse(string).toLowerCase();
//        return string.toLowerCase().equals(reverse);
//    }
//
//    public static String YesNo (String s) {
//        if (isPalindromeString(s) == true) {
//            return "Yes";
//        } else {
//            return "No";
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPalindromeString("anna"));
//        System.out.println(isPalindromeString("Kayak"));
//        System.out.println(isPalindromeString("James"));
//        System.out.println(isPalindromeString("Table"));
//        System.out.println(YesNo("anna"));
//        System.out.println(YesNo("Kayak"));
//        System.out.println(YesNo("James"));
//    }
//}


// ---------------------------------------------------------

//public class Solution {
//    public static void fizzBuzz(int num) {
//        for (int i = 1; i <= num; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        fizzBuzz(20);
//    }
//}

// ------------------------------------------------------

//public class Solution {
//    static int fibonacci(int n) {
//        int fibonacci[] = new int[n + 2];
//
//        fibonacci[0] = 0;
//        fibonacci[1] = 1;
//
//        for (int i = 2; i <= n; i++) {
//            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
//        }
//        return fibonacci[n];
//    }
//
//    public static void main(String[] args) {
//        int n = 15;
//        System.out.println(fibonacci(n));
//    }
//}


//The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output:
//For the first line, sum the lengths of A and B.
//For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
//For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
//
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        String B=sc.next();
//        /* Enter your code here. Print output to STDOUT. */
//
//        System.out.println(A.length() + B.length());
//
//        if(A.compareTo(B) < 0) {
//            System.out.println("No");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        } else if (A.compareTo(B)==0) {
//            System.out.println("No");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        } else {
//            System.out.println("Yes");
//            A = A.substring(0,1).toUpperCase() + A.substring(1,A.length());
//            B = B.substring(0,1).toUpperCase() + B.substring(1,B.length());
//            System.out.println(A + " " + B);
//        }
//    }
//}

//The first line contains a single string denoting .
//The second line contains two space-separated integers denoting the respective values of Start and End.

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String S = in.next();
//        int start = in.nextInt();
//        int end = in.nextInt();
//
//        System.out.println(S.substring(start,end));
//    }
//}

//import java.util.Scanner;

//public class Solution {
//
//    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";
//
//        // Complete the function
//        // 'smallest' must be the lexicographically smallest substring of length 'k'
//        // 'largest' must be the lexicographically largest substring of length 'k'
//
//        for(int i = 0;i<=s.length()-k;i++){
//            String subString = s.substring(i,i+k);
//            if(i == 0){
//                smallest = subString;
//            }
//            if(subString.compareTo(largest)>0){
//                largest = subString;
//            }else if(subString.compareTo(smallest)<0)
//                smallest = subString;
//        }
//
//        return smallest + "\n" + largest;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();
//
//        System.out.println(getSmallestAndLargest(s, k));
//    }
//}

//public class Solution {
//    // coinsLength if the number of coins in the coins array
//    static int minimumCoins(int coins[], int coinsLength, int value) {
//        if (value == 0) {
//            return 0;
//        }
//
//        // Initialize result
//        int result = Integer.MAX_VALUE;
//
//        // Trying every coin that has a smaller value than
//        for (int i = 0; i < coinsLength; i++) {
//
//            if (coins[i] <= value) {
//
//                int subResults = minimumCoins(coins, coinsLength, value - coins[i]);
//
//                // Check for INT_MAX to avoid overflow and see if result can be minimized
//                if (subResults != Integer.MAX_VALUE && subResults + 1 < result) {
//                    result = subResults + 1;
//                }
//            }
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int coins[] = {1, 3, 5};
//        int coinsLength = coins.length;
//        int value = 10;
//        System.out.println("Minimum coins required is " + minimumCoins(coins, coinsLength, value));
//    }
//}

import java.nio.charset.IllegalCharsetNameException;


//public class Solution {
//    static int minimumCoins(int coins[], int coinsLength, int value) {
//        if (value == 0) {
//            return 0;
//        }
//
//        int results = Integer.MAX_VALUE;
//
//        for (int i = 0; i < coinsLength; i++) {
//            if (coins[i] <= value) {
//                int subResults = minimumCoins(coins, coinsLength, value - coins[i]);
//
//                if (subResults != Integer.MAX_VALUE && subResults + 1 < results) {
//                    results = subResults + 1;
//                }
//            }
//        }
//        return results;
//    }
//
//    public static void main(String[] args) {
//        int coins[] = {1, 3, 5};
//        int coinsLength = coins.length;
//        int value = 11;
//        System.out.println(minimumCoins(coins, coinsLength, value));
//    }
//}


import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        //lower case string
        a = a.toLowerCase();
        b = b.toLowerCase();

        // anagram boolean set to false
        boolean anagram = false;

        // setting strings to CharArray
        char[] aArray = a.toCharArray();
        Arrays.sort(aArray);
        char[] bArray = b.toCharArray();
        Arrays.sort(bArray);

        // creating new string with CharArray
        String A = new String (aArray);
        String B = new String (bArray);

        // if the CharArrays equal, anagram true
        if (A.equals(B)) {
            anagram = true;
        }
        return anagram;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}






