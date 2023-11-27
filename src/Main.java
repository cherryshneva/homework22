public class Main {
    public static void main(String[] args) {

        int initialCount = 50;
        int increaseAmount = 1400;

        int bonus = (increaseAmount / 100);

        if(increaseAmount > 1000) {
            bonus = (increaseAmount / 100);
        } else {
            bonus = 0;
        }

        int total = (initialCount + increaseAmount + bonus);

        System.out.println("Итоговый счет:" + total);
        System.out.println("Итоговый бонус:" + bonus);

    }
}



