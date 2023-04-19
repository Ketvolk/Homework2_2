public class Main {
    public static void main(String[] args) {

        int balanceCurrent = 100;
        int balanceAdd = 1100;
        int bonus;

        if (balanceAdd >= 1000) {
            System.out.println("Бонусные рубли: " + (balanceAdd / 100));
            System.out.println("Итоговый баланс: " + (balanceCurrent + balanceAdd + balanceAdd / 100));
        } else {
            System.out.println("Бонусные рубли: 0");
            System.out.println("Итоговый баланс: " + (balanceCurrent + balanceAdd));
        }
    }
}