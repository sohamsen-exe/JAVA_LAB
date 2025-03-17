public class exception_handling {
    //static int a = 10;
    //static int b = 30;
    //static int div = a / b;
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int div = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by Zero");
        }
        finally {
            System.out.println("Error has either occurred or not occurred, the code has executed regardless");
        }
    }
}


