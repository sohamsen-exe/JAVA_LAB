import java.util.Scanner;

class AAnimal extends Thread {
    Scanner s = new Scanner(System.in);
    public void animal1() {
        String animal_name, animal_color, animal_age, animal_price;
        System.out.println("Animal 1 Name: ");
        animal_name = s.next();
        System.out.println("Animal 1 Color: ");
        animal_color = s.next();
        System.out.println("Animal 1 Age: ");
        animal_age = s.next();
        System.out.println("Animal 1 Price: ");
        animal_price = s.next();

        System.out.println("\nAnimal 1 Name: " + animal_name);
        System.out.println("Animal 1 Color: " + animal_color);
        System.out.println("Animal 1 Age: " + animal_age);
        System.out.println("Animal 1 Price: " + animal_price);
    }
    public void animal2() {
        String animal_name, animal_color, animal_age, animal_price;
        System.out.println("\nAnimal 2 Name: ");
        animal_name = s.next();
        System.out.println("Animal 2 Color: ");
        animal_color = s.next();
        System.out.println("Animal 2 Age: ");
        animal_age = s.next();
        System.out.println("Animal 2 Price: ");
        animal_price = s.next();

        System.out.println("\nAnimal 2 Name: " + animal_name);
        System.out.println("Animal 2 Color: " + animal_color);
        System.out.println("Animal 2 Age: " + animal_age);
        System.out.println("Animal 2 Price: " + animal_price);
    }
    public void animal3() {
        String animal_name, animal_color, animal_age, animal_price;
        System.out.println("\nAnimal 3 Name: ");
        animal_name = s.next();
        System.out.println("Animal 3 Color: ");
        animal_color = s.next();
        System.out.println("Animal 3 Age: ");
        animal_age = s.next();
        System.out.println("Animal 3 Price:");
        animal_price = s.next();

        System.out.println("\nAnimal 3 Name: " + animal_name);
        System.out.println("Animal 3 Color: " + animal_color);
        System.out.println("Animal 3 Age: " + animal_age);
        System.out.println("Animal 3 Price: " + animal_price);
    }
    public void animal4() {
        String animal_name, animal_color, animal_age, animal_price;
        System.out.println("\nAnimal 4 Name: ");
        animal_name = s.next();
        System.out.println("Animal 4 Color: ");
        animal_color = s.next();
        System.out.println("Animal 4 Age: ");
        animal_age = s.next();
        System.out.println("Animal 4 Price: ");
        animal_price = s.next();

        System.out.println("\nAnimal 4 Name: " + animal_name);
        System.out.println("Animal 4 Color: " + animal_color);
        System.out.println("Animal 4 Age: " + animal_age);
        System.out.println("Animal 4 Price: " + animal_price);
    }
    public void animal5() {
        String animal_name, animal_color, animal_age, animal_price;
        System.out.println("\nAnimal 5 Name: ");
        animal_name = s.next();
        System.out.println("Animal 5 Color: ");
        animal_color = s.next();
        System.out.println("Animal 5 Age: ");
        animal_age = s.next();
        System.out.println("Animal 5 Price: ");
        animal_price = s.next();

        System.out.println("\nAnimal 5 Name: " + animal_name);
        System.out.println("Animal 5 Color: " + animal_color);
        System.out.println("Animal 5 Age: " + animal_age);
        System.out.println("Animal 5 Price: " + animal_price);
    }
}

public class Threads {
    public static void main(String[] args) {
        AAnimal a = new AAnimal();
        a.animal1();
        a.animal2();
        a.animal3();
        a.animal4();
        a.animal5();
    }
}
