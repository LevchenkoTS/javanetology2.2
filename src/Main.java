public class Main {
    public static void main(String[] args) {

        int account = 200; // сумма на счете
        int refill = 1500; // сумма пополнения
        int bonus = 1; // бонус за каждые 100 руб

        int bonusAccount;
        if  (refill >= 1000){
            System.out.println("Бонусы: " + (refill / 100) + " Итоговый счет: " + (refill / 100 + account+refill));
        } else{
            System.out.println("Бонусы: 0" + " Итоговый счет: " + (account + refill));
        }
    }
}