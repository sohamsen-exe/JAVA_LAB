class CheckGender extends Exception {
    CheckGender() {
        super("ENTER A VALID GENDER");
    }
}

public class custom_exceptions_genders {
    public static void checkValid (String gender) throws CheckGender {
        if (gender == "Male") {
            System.out.println("Gender is Valid");
        }
        else if (gender == "Female") {
            System.out.println("Gender is Valid");
        }
        else {
            throw new CheckGender();
        }
    }

    public static void main(String[] args) {
        try {
            checkValid("Male");
        }
        catch (CheckGender e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
        finally {
            System.out.println("Code Finished");
        }
    }
}
