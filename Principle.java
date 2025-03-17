import java.util.*;
public class Principle {
    public static void main(String[] args) {
        int p, r, t, i;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Principle Amount");
        p = s.nextInt();
        System.out.println("Enter No. of years");
        t = s.nextInt();
        System.out.println("Enter Rate of Interest");
        r = s.nextInt();
        i = (p * r * t)/100;
        System.out.println("Total Interest:" + i +"Rs");
        System.out.println("Total Amount: " + (p + i) + "Rs");
    }
}
