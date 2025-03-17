abstract class Flowers {
    String flower_name = "Rose";
    String flower_colour = "Red";
    int flower_price = 15;
    public abstract void flower_details();
}
class Rose extends Flowers {
    public void flower_details() {
        System.out.println("FLOWER DETAILS");
        System.out.println("Flower name : " + this.flower_name);
        System.out.println("Flower colour : " + this.flower_colour);
    }
}
public class Flower_Main {
    public static void main(String[] args) {
        Rose r = new Rose();
        r.flower_details();
    }
}