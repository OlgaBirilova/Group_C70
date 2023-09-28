package Homework11;

public class hw11_1 {
    public static class WrongLoginException extends Exception {
        public WrongLoginException(String message) {
            super(message);
        }
    }
        public static class WrongPasswordException extends Exception {
        public WrongPasswordException(String message) {
            super(message);
        }
    }
    public static boolean registerUser(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Неверный формат логина!");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Неверный формат пароля!");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Введённые пароли не совпадают!");
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            boolean isValid = registerUser("login", "password1", "password2");
            System.out.println("Регистрация прошла успешно!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка регистрации: " + e.getMessage());
        }
    }
}
