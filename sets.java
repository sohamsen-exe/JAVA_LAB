import java.util.*;

public class sets {
    public static void main(String[] args) {
        Set fruit1 = new HashSet<>();
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Fruit Name: ");
            String fruit1_name = s1.next();
            if (fruit1_name.equalsIgnoreCase("Done")) {
                break;
            }
            System.out.println("Enter Fruit Quantity: ");
            int fruit1_quantity = s1.nextInt();
            System.out.println("Enter Fruit Price: ");
            int fruit1_price = s1.nextInt();

            fruit1.add(fruit1_name);
            fruit1.add(fruit1_quantity);
            fruit1.add(fruit1_price);
        }
        System.out.println("Fruit 1: " + fruit1);

        Set fruit2 = new HashSet<>();
        Scanner s2 = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Fruit Name: ");
            String fruit2_name = s2.next();
            if (fruit2_name.equalsIgnoreCase("Done")) {
                break;
            }
            System.out.println("Enter Fruit Quantity: ");
            int fruit2_quantity = s2.nextInt();
            System.out.println("Enter Fruit Price: ");
            int fruit2_price = s2.nextInt();

            fruit2.add(fruit2_name);
            fruit2.add(fruit2_quantity);
            fruit2.add(fruit2_price);
        }
        System.out.println("Fruit 1: " + fruit2);
    }
}
