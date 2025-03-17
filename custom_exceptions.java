class InvalidAge extends Exception {
    InvalidAge() {
        super("Age is above 18");
    }
}

class custom_exceptions {

    public static void checkAge() throws InvalidAge{
        int age = 20;
        if (age > 18) {
            throw new InvalidAge();
        }
        else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge();
        }
        catch (InvalidAge e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
