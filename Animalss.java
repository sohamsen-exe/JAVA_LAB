import java.util.*;
abstract class Animalss {
    protected abstract void details();
}
class Doggo extends Animalss {
    protected void details(String Name, String Breed, int Price, String Location, String Owner) {
        System.out.println("Dog Name : " + Name);
        System.out.println("Dog Breed : " + Breed);
        System.out.println("Dog Price : " + Price);
        System.out.println("Dog Location : " + Location);
        System.out.println("Dog Owner : " + Owner);
    }
    @Override
    protected void details() {
    }
}
class Mainn {
    protected static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Dog Name :");
        String Name = s.next();

        System.out.println("Enter Dog Breed :");
        String Breed = s.next();

        System.out.println("Enter Dog Price :");
        int Price = s.nextInt();

        System.out.println("Enter Dog Location :");
        String Location = s.next();

        System.out.println("Enter Dog Owner :");
        String Owner = s.next();

        Doggo obj = new Doggo();
        obj.details(Name, Breed, Price, Location, Owner);
    }
}