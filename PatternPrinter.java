// write a program to print the following 
// pattern :
// 1
// 121
// 12321
// 1234321
// 123454321


public class PatternPrinter {
    public static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
               
                System.out.print(j);

            }

            // Print numbers from i-1 to 1 in reverse order
            for (int j = i - 1; j >= 1; j--) {

                System.out.print(j);

            }

            System.out.println();  // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int rows = 5;
        printPattern(rows);

    }
}