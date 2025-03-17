import java.util.*;
public class Area_Perimeter {
    protected static void main(String[] args) {
        int l, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length");
        l = s.nextInt();
        System.out.println("Enter Breadth");
        b = s.nextInt();
        System.out.println("Area is " + (l * b) + "sqm");
        System.out.println("Perimeter is " + (2 * (l + b)) + "sqm");
    }
}
