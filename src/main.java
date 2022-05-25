
public class main {
    public static void main(String[] args) {
        int balans = 100;
        int popolnenie = 2000;
        int bonus = popolnenie / 100;
        int shet = balans + popolnenie + bonus;
        if  (popolnenie < 1000) {
            bonus = 0;
        }
        System.out.println("баланс =" + shet);
    }
}
