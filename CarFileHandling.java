import java.io.*;
import java.util.*;

class CarAttributes {
    String name, colour, numberPlate, country;
    double price;

    CarAttributes(String name, String colour, String numberPlate, String country, double price) {
        this.name = name;
        this.colour = colour;
        this.numberPlate = numberPlate;
        this.country = country;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "," + colour + "," + numberPlate + "," + country + "," + price;
    }
}

public class CarFileHandling {
    private static final String FILE_NAME = "car_details.txt";

    public static void main(String[] args) {
        List <CarAttributes> carList = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Car: " + (i + 1) + ":");
            System.out.print("Car Name: ");
            String name = s.nextLine();
            System.out.print("Car Colour: ");
            String colour = s.nextLine();
            System.out.print("Car Number Plate: ");
            String numberPlate = s.nextLine();
            System.out.print("Car Country: ");
            String country = s.nextLine();
            System.out.print("Car Price: ");
            double price = Double.parseDouble(s.nextLine());

            carList.add(new CarAttributes(name, colour, numberPlate, country, price));
        }

        writeToFile(carList);

        readFromFile();
    }

    private static void writeToFile(List <CarAttributes> cars) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (CarAttributes car : cars) {
                writer.write(car.toString());
                writer.newLine();
            }
            System.out.println("Car details successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nReading car details from file:");
            while ((line = reader.readLine()) != null) {
                String [] details = line.split(",");
                System.out.println("Car Name: " + details[0] + ", Colour: " + details[1] + ", Number Plate: " + details[2] + ", Country: " + details[3] + ", Price: " + details[4]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
