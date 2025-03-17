import java.io.*;
import java.util.Scanner;

public class CourseFileHandler {
    public static void main(String[] args) {
        String fileName = "courses.txt";

        // Writing to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter details for 5 courses:");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Course " + i + ":");

                System.out.print("Course Name: ");
                String course = scanner.nextLine();

                System.out.print("Fees Structure: ");
                String fees = scanner.nextLine();

                System.out.print("Duration: ");
                String duration = scanner.nextLine();

                System.out.print("Location: ");
                String location = scanner.nextLine();

                writer.write(course + ", " + fees + ", " + duration + ", " + location);
                writer.newLine();
            }
            scanner.close();
            System.out.println("Data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading from file
        System.out.println("\nReading data from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
