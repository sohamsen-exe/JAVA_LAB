public class array_exception {
    public static void main(String[] args) {
        try {
            int[] array = {1,2,3,4,5};
            System.out.println("Array: " + array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound is 10");
        }
    }
}
