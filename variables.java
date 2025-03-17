public class variables {
    int b = 200; //global
    static int c = 300; //static
    static String n = "Soham Sen";
    public static void main(String[] args) {
        int a = 100; //local
        System.out.println(a);
        System.out.println(c);

        variables obj = new variables();
        System.out.println(obj.b);

        System.out.println(n);
    }
}
