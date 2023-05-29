package Verification;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong, please enter password up to 20 characters and without spaces");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}