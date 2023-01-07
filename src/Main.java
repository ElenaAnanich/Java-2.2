public class Main {
    public static void main(String[] args) {
        int balanse = 100;// начальный баланс
        int amount = 1200; // пополнение
        int condition = 1000; //условия пополнения
        int bonus = amount / 100;

        if (amount > condition) {
            bonus = amount / 100;
        }
        {
            System.out.println(amount + balanse + bonus);
            System.out.println(bonus);
        }

    }
}