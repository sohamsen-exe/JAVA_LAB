import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Expenses {
    private String category;
    private double amount;
    private String description;

    public Expenses(String category, double amount, String description) {
        this.category = category;
        this.amount = amount;
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Category: " + category + ", Amount: " + amount + ", Description: " + description;
    }
}

public class Expense_Tracker {
    private static List <Expenses> expenses = new ArrayList<>();
    private static Scanner s = new Scanner(System.in);

    private static void addExpenses() {
        System.out.println("\nEnter Expenses Category: ");
        String category = s.next();

        System.out.println("Enter Amount: ");
        double amount = s.nextDouble();

        System.out.println("Enter Description: ");
        String description = s.next();
        System.out.println();

        expenses.add(new Expenses(category, amount, description));
    }
    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("\nNo Expenses Recorded\n");
        }
        else {
            System.out.println("\nExpenses: ");
            for (Expenses expenses : Expense_Tracker.expenses) {
                System.out.println(expenses);
            }
            System.out.println();
        }
    }
    private static void calculateExpenses() {
        double total = 0;
        for (Expenses expenses : Expense_Tracker.expenses) {
            total += expenses.getAmount();
        }
        System.out.println("\nTotal Expenses: " + total);
        System.out.println();
    }
    private static void filterExpenses() {
        System.out.println("\nEnter Expenses Category: ");
        String category = s.next();
        boolean found = false;

        System.out.println("\nExpenses in Category: " + category);
        for (Expenses expenses : Expense_Tracker.expenses) {
            if (expenses.getCategory().equalsIgnoreCase((category))) {
                System.out.println(expenses);
                found = true;
                System.out.println();
            }
            if (!found) {
                System.out.println("No Expenses found in this Category");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("Expenses Tracker");
            System.out.println("1. Add Expenses");
            System.out.println("2. View Expenses");
            System.out.println("3. Calculate Total Expenses");
            System.out.println("4. Filter Expenses by Category");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    addExpenses();
                    break;
                case 2:
                    viewExpenses();
                    break;
                case 3:
                    calculateExpenses();
                    break;
                case 4:
                    filterExpenses();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    return;
                default:
                    System.out.println("Enter a Valid Choice!");
            }
        }
    }
}
