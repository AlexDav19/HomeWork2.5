public class Main {
    public static void main(String[] args) {
        try {
            checkAccount("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException e) {
            System.out.println("Недопустимый логин");
        } catch (WrongPasswordException e) {
            System.out.println("Недопустимый пароль");
        } finally {
            System.out.println("Метод выполнен");
        }
    }

    public static void checkAccount(String login, String password, String confirmPassword) {
        if (!login.matches("\\w{1,}") || login.length() > 20) {
            throw new WrongLoginException("Недопустимый логин");
        } else if (!password.matches("\\w{1,}") || !password.equals(confirmPassword)
                || password.length() > 20) {
            throw new WrongPasswordException("Недопустимый пароль");
        }
    }
}