package Verification;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong, please enter login up to 20 characters and without spaces");
    }
        public WrongLoginException(String message) {
            super(message);
}
}
