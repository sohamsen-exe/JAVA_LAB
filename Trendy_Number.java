import java.util.*;
import java.io.*;
public class Trendy_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a three digit number :");
        int n = s.nextInt();
        n = n / 10;
        n = n % 10;
        if (n % 3 == 0) {
            System.out.println("It is a Trendy Number");
        }
        else {
            System.out.println("It is not a Trendy Number");
        }
    }
}
