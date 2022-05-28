
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 2000;
        int bonus = replenishment / 100;
        int check = balance + replenishment + bonus;
        if  (replenishment < 1000) {
            bonus = 0;
        }
        System.out.println("баланс =" + check);
    }
}
