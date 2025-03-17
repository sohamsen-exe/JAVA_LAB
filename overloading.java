class mk{
    int a = 40;
    void fun(){
        System.out.println("Method 1");
    }
    void fun(float x){
        System.out.println(1.5 + x);
    }
    int fun(int a){
        System.out.println(a);
        return 0;
    }
    int fun(int a, int b){
        return a + b;
    }
    void fun(char c){
        System.out.println("Character is " + c);
    }
}

public class overloading {
    static void fun1(int a){
        System.out.println(a + 0.9);
    }
    static int fun1(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        mk o = new mk();
        o.fun();
        int r = o.fun(10);
        int t = o.fun(10, 20);
        o.fun('m');
        o.fun(5.6f);
    }
}