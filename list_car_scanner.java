import java.util.*;

public class list_car_scanner {
    public static void main(String[] args) {
        List Cars1  = new ArrayList<>();
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Car 1 Name: ");
            String car_name = s1.next();
            if (car_name.equalsIgnoreCase("Done")) {
                break;
            }

            System.out.println("Enter Car 1 Colour: ");
            String car_colour = s1.next();
            System.out.println("Enter Car 1 Price: ");
            String car_price = s1.next();

            Cars1.add(car_name);
            Cars1.add(car_colour);
            Cars1.add(car_price);
        }
        System.out.println("Car 1 Details: " + Cars1);

        List Cars2 = new ArrayList<>();
        Scanner s2 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Car 2 Name: ");
            String car_name = s2.next();
            if (car_name.equalsIgnoreCase("Done")) {
                break;
            }

            System.out.println("Enter Car 2 Colour: ");
            String car_colour = s2.next();
            System.out.println("Enter Car 2 Price: ");
            String car_price = s2.next();

            Cars2.add(car_name);
            Cars2.add(car_colour);
            Cars2.add(car_price);
        }
        System.out.println("Car 2 Details: " + Cars2);
    }
}
