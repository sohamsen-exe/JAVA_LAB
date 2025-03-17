public class Vehicles {
    public static void car_company() {
        System.out.println("CarAttributes Company is : Benz");
    }
}
class Car extends Vehicles {
    public static void car_price() {
        System.out.println("CarAttributes Price is : 50 Lakhs");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("CarAttributes Details : ");
        System.out.println("================");
        Car obj = new Car();
        obj.car_company();
        obj.car_price();
    }
}