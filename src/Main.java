public class Main {

    public static void main(String[] args) {
        int initialBalance = 100;
        int add = 1_100;

        int bonus;
        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = initialBalance + add + bonus;
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
