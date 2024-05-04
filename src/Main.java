public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // начальная сумма на счету
        int depositAmount = 1100; // сумма пополнения

        int bonus = 0;

        if (depositAmount > 1000) {
            bonus = (depositAmount ) / 100;
            System.out.println("Бонус: " + bonus + " рублей");
        }

        int totalAmount = initialAmount + depositAmount + bonus;

        System.out.println("Итоговая сумма на счету: " + totalAmount + " рублей");
    }
}


