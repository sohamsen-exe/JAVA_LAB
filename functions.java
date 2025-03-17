import java.util.*;
public class functions {
    int fun(){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        return a + b;
    }
    public static void main(String[] args) {
        functions o = new functions();
        int r = o.fun();
        int t = o.fun();
        int x = o.fun();
        System.out.println(r + t + x);
    }
}