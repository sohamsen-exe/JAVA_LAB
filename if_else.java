import java.util.*;
import java.io.*;
public class if_else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value of n :");
        int n = s.nextInt();
        if ( n >= 100 && n <= 999){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
