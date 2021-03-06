/*
A unique-digit integer is a positive integer (without leading zeros)
with no duplicate digits.
For example 7, 135, 214 are all unique-digit integers
whereas 33, 3121, 300 are not.

Given two positive integers m and n, write a program to determine how
many unique-digit integers are there in the range between m and n
(both inclusive) and output them.

The input contains two positive integers m and n.
Assume m < 30000 and n < 30000. You are to output the number of
unique-digit integers in the specified range along with their values
in the format specified below:



SAMPLE DATA:

INPUT:  m = 100
        n  = 120
OUTPUT: THE UNIQUE-DIGIT INTEGERS ARE:-
        102, 103, 104, 105, 106, 107, 108, 109, 120.
        FREQUENCY OF UNIQUE-DIGIT IN INTEGERS IS : 9

INPUT:  m  =  2500
        n  =  2550
OUTPUT: THE UNIQUE-DIGIT INTEGERS ARE:-
        2501, 2503, 2504, 2506, 2507, 2508, 2509, 2510, 2513, 2514, 2516, 2517, 2518, 2519,
        2530, 2531, 2534, 2536, 2537, 2538, 2539, 2540, 2541, 2543, 2546, 2547, 2548, 2549.
        FREQUENCY OF UNIQUE-DIGIT INTEGERS IS : 28

 * UniqueNumbers
 */

import java.util.Scanner;

public class UniqueNumbers {

    private static boolean isUnique(int number) {
        boolean [] nCount = new boolean[10];
        nCount [number%10] = true;
        while ((number/=10) > 0) {
            if (nCount [number%10])
                return false;
            nCount [number%10] = true;
        }
        return true;
    }

    private void unique(int m, int n) {
        int frequency = 0;
        System.out.print("\t\t");
        while (m <= n) {
            if (isUnique(m)) {
                System.out.print(m + ", ");
                frequency++;
            }
            m++;
        }
        System.out.println("\n\t\tFREQUENCY OF UNIQUE-DIGIT NUMBERS IS : " + frequency);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("INPUT:  m = ");
        m = sc.nextInt();
        System.out.print("\t\tn = ");
        n = sc.nextInt();
        System.out.println("OUTPUT: THE UNIQUE-DIGIT NUMBERS ARE ::-");
        UniqueNumbers uniqueNumbers = new UniqueNumbers();
        uniqueNumbers.unique(m,n);
        sc.close();
    }
}
