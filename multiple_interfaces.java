interface Vehicles_Interface {
    void vehicle_Details1();
    void vehicle_Details2();
}

class Car_Interface1 implements Vehicles_Interface {
    public void vehicle_Details1() {
        System.out.println("---------------VEHICLE DETIALS--------------");
        System.out.println("CarAttributes Name : Mustang");
        System.out.println("CarAttributes Company : Ford");
        System.out.println("CarAttributes Price : 1 Crore");
    }
    @Override
    public void vehicle_Details2() {

    }
}

class Car_Interface2 implements Vehicles_Interface {
    @Override
    public void vehicle_Details1() {

    }

    public void vehicle_Details2() {
            System.out.println("---------------VEHICLE DETIALS--------------");
            System.out.println("CarAttributes Name : Supra");
            System.out.println("CarAttributes Company : Toyota");
            System.out.println("CarAttributes Price : 70 Lakhs");
    }
}

public class multiple_interfaces {
    public static void main(String[] args) {
        Car_Interface1 c1 = new Car_Interface1();
        c1.vehicle_Details1();
        Car_Interface2 c2 = new Car_Interface2();
        c2.vehicle_Details2();
    }
}