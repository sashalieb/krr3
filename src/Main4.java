/*Задание с исключением. Проверка логина и пароля.*/
// Классы исключений
import java.util.Scanner;

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Wrong login");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Wrong password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();
        String confirmPassword = scanner.nextLine();
        if (validate(login, password, confirmPassword)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (!ValidLogin(login)) {
                throw new WrongLoginException();
            } else if (!ValidPassword(password, confirmPassword)) {
                throw new WrongPasswordException();
            } else {
                return true;
            }
        } catch (WrongPasswordException | WrongLoginException var4) {
            System.out.println(var4.getMessage());
            return false;
        }
    }

    private static boolean ValidLogin(String login) {
        return login.matches("[a-zA-Z0-9_]+") && login.length() < 20;
    }

    private static boolean ValidPassword(String password, String confirmPassword) {
        return password.matches("[a-zA-Z0-9_]+") && password.length() < 20 && password.equals(confirmPassword);
    }
}