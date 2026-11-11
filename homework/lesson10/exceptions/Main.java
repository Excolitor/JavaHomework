package homework.lesson10.exceptions;

public class Main {

    public static String registerUser(String name, int age)
            throws InvalidAgeException {

        if (name == null || name.isEmpty()) {
            throw new EmptyNameException("Имя не может быть пустым!");
        }

        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Некорректный возраст: " + age);
        }

        return "Пользователь " + name + " успешно зарегистрирован!";
    }

    public static double withdrawMoney(double balance, double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Недостаточно средств! Баланс: " + balance
            );
        }

        return balance - amount;
    }

    public static void main(String[] args) {

        try {
            String result = registerUser("Alex", 200);
            System.out.println(result);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Блок finally выполнен");
        }

        System.out.println();

        try {
            String result = registerUser("", 25);
            System.out.println(result);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());

        } catch (EmptyNameException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Блок finally выполнен");
        }

        System.out.println();

        try {
            double newBalance = withdrawMoney(100, 150);
            System.out.println("Новый баланс: " + newBalance);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Блок finally выполнен");
        }
    }

    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    // 2. Unchecked exception — пустое имя
    static class EmptyNameException extends RuntimeException {
        public EmptyNameException(String message) {
            super(message);
        }
    }

    static class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }
}