public class calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        return a / b;
    }
    int mod(int a, int b) {
        return a % b;
    }
    protected static void main(String[] args) {//built-in
        calculator obj = new calculator();
        System.out.println("Adding : " + obj.add(3, 5));
        System.out.println("Subtracting : " + obj.subtract(10, 7));
        System.out.println("Multiplying : " + obj.multiply(5, 6));
        System.out.println("Dividing : " + obj.divide(10, 5));
        System.out.println("Modulus : " + obj.mod(6, 4));
    }
}