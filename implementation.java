abstract class Flower {
    String flower_name;
    String flower_colour;
    int flower_price;
    String flower_size;
    String flower_smell;
    public abstract void flower_details(String flower_name,
                                        String flower_colour,
                                        String flower_price,
                                        String flower_size,
                                        String flower_smell);
}

class Lilly extends Flower {
    public void flower_details() {
        System.out.println("Flower Name : " + flower_name);
        System.out.println("Flower Colour : " + flower_colour);
        System.out.println("Flower Price : " + flower_price);
        System.out.println("Flower Size : " + flower_size);
        System.out.println("Flower Smell : " + flower_smell);
    }

    @Override
    public void flower_details(String flower_name, String flower_colour, String flower_price, String flower_size, String flower_smell) {

    }
}

public class implementation {
    public static void main (String[] args) {
        Lilly l = new Lilly();
        l.flower_details("Lilly", "White", String.valueOf(1000), "Big", "Sweet");
    }
}
