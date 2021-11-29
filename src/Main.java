public class Main {
    public static void main(String[] args) {
        long currentBalance = 100;
        long payment = 12011;
        long bonus = 0;
        long newBalance;

        if (payment > 1000) {
            bonus = (payment / 100);
        }

        newBalance = currentBalance + payment + bonus;
        System.out.println("Спасибо за пополнение, ваш баланс равен: " + newBalance + " Сумма бонусов составила: " + bonus);
    }
}
