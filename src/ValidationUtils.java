public class ValidationUtils {
    public static void validateLoginPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches("[a-zA-Z0-9_]+")) {           // [a-zA-Z0-9_] reges - регулярные выражения Java . https://javarush.com/groups/posts/regulyarnye-vyrazheniya-v-java
            throw new WrongLoginException("Login should contain only Latin letters, numbers, and underscores.");
        }

        if (login.length() >= 20) {
            throw new WrongLoginException("Login length should be less than 20 characters.");
        }

        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("Password should contain only Latin letters, numbers, and underscores.");
        }

        if (password.length() >= 20) {
            throw new WrongPasswordException("Password length should be less than 20 characters.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match.");
        }
    }

    public static void main(String[] args) {
        String login = "valid_login";
        String password = "valid_password";
        String confirmPassword = "valid_password";

        try {
            validateLoginPassword(login, password, confirmPassword);
            System.out.println("Login and password are valid.");
        } catch (WrongLoginException e) {
            System.out.println("Invalid login: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Invalid password: " + e.getMessage());
        }
    }
}
