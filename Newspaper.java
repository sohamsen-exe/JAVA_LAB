import java.util.*;
public class Newspaper {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int p = (a * b) - (a * c) - 100;
        System.out.println(p);
    }
}