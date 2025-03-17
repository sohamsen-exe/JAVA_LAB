public class bike_details {
    public void bike_details() {
        System.out.println("Bike Details : ");
    }
}

class Bike extends bike_details {
    public void bike_details() {
        System.out.println("Bike Name : Panigale");
        System.out.println("Bike Brand : Ducati");
        System.out.println("Bike CCs : 1000cc");
        System.out.println("");
        System.out.println("Bike Name : R1M");
        System.out.println("Bike Brand : Yamaha");
        System.out.println("Bike Price : 1000cc");
        System.out.println("");
        System.out.println("Bike Name : ZX-10R");
        System.out.println("Bike Brand : Yamaha");
        System.out.println("Bike Price : 1000cc");
    }
}

class Class {
    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.bike_details();
    }
}