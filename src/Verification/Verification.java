package Verification;

import java.util.Scanner;

public class Verification {
    public static void main(String[] args) {
        System.out.println("Please enter your login: ");
        String login = enter().nextLine();
        System.out.println("Please enter your password: ");
        String password = enter().nextLine();
        System.out.println("Please confirm your password: ");
        String confirmPassword = enter().nextLine();
        correctData(login, password, confirmPassword);
    }

    public static Scanner enter() {
        return new Scanner(System.in);
    }

    public static boolean correctData(String login, String password, String confirmPassword) {
        try {
            checkLogin(login);
            checkPassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    static void checkLogin(String login) throws WrongLoginException {
        if (login.length() >= 20) {
            throw new WrongLoginException();
        }
        if (login.contains(" ")) {
            throw new WrongLoginException();
        }
    }

    static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20) {
            throw new WrongPasswordException();
        }
        if (password.contains(" ")) {
            throw new WrongPasswordException();
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
