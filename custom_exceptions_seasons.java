class CheckSeason extends Exception {
    CheckSeason() {
        super("ENTER A VALID MONTH");
    }
}

public class custom_exceptions_seasons {
    public static void checkMonth(String month) throws CheckSeason {
        if (month == "December" || month == "January" || month == "February") {
            System.out.println("WINTER");
        }
        else if (month == "March" || month == "April" || month == "May") {
            System.out.println("SUMMER");
        }
        else if (month == "June" || month == "July" || month == "August") {
            System.out.println("MONSOON");
        }
        else if (month == "September" || month == "October" || month == "November") {
            System.out.println("AUTUMN");
        }
        else {
            throw new CheckSeason();
        }
    }

    public static void main(String[] args) {
        try {
            checkMonth("March");
        }
        catch (CheckSeason e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("DONE");
        }
    }
}