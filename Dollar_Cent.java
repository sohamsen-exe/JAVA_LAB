import java.util.*;
public class Dollar_Cent {
    protected static void main(String[] args) {
        int d1, c1, d2, c2, q;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Dollar 1");
        d1 = s.nextInt();
        System.out.println("Enter Cent 1");
        c1 = s.nextInt();
        System.out.println("Enter Dollar 2");
        d2 = s.nextInt();
        System.out.println("Enter Cent 2");
        c2 = s.nextInt();
        q = (c1 + c2)/100;

        System.out.println("Total Dollar \n" + ((d1 + d2) + q));
        System.out.println("Total Cent \n" + ((c1 + c2) % 100));
    }
}
