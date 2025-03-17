import java.util.*;
public class Student {
    public static void main(String[] args) {
        String a,b;
        int c,d,e;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Name");
        a = s.next();
        System.out.println("Enter Last Name");
        b = s.next();
        System.out.println("Enter ID");
        c = s.nextInt();
        System.out.println("Enter Mark1");
        d = s.nextInt();
        System.out.println("Enter Mark2");
        e = s.nextInt();
        System.out.println("Student Name is " + a + " " + b);
        System.out.println("Student Id is " + c);
        System.out.println("Average is " + ((d + e)/2));
    }
}