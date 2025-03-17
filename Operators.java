public class Operators {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        //Arithmetic
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println();
        //Comparison
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println();
        //Assignment
        int c = 10;
        int d = 15;
        c += 20;
        d += c;
        System.out.println(c + d);
        System.out.println();
        //logical
        boolean e = true;
        System.out.println(a == 20 && b == 40);
        System.out.println(a == 20 && b == 45);
        System.out.println(a == 45 || b == 40);
        System.out.println(!e);
        System.out.println();
        //Unary
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(--a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println();
    }
}
