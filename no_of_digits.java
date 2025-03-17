import java.util.*;
import java.io.*;
public class no_of_digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value of n :");
        int n = s.nextInt();

        if (n >= 0 && n <= 9) {
            System.out.println("It is a single digit number");
        }
        else if (n >= 10 && n <= 99) {
            System.out.println("It is a double digit number");
        }
        else if (n >= 100 && n <= 999) {
            System.out.println("It is a triple digit number");
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}