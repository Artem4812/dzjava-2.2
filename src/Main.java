
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int replenishment = 900 ;
        int bonus = replenishment / 100;
        if  (replenishment < 1000) {
            bonus = 0;
        }
        int check = balance + replenishment + bonus;
        System.out.println("баланс =" + check);
    }
}
