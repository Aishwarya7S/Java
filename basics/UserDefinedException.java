class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
    public static void main(String[] args) {
        int age = 17;

        try {
            checkAge(age);
        } 
        catch(InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Process completed...");
        }
    }
}
