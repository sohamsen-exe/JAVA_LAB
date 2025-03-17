import java.util.*;
import java.io.*;
public class Even_Or_Odd_Or_Zero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("Zero");
        }
        else if (n % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
