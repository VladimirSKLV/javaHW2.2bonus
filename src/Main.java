import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double UserBalance = 100;
        Scanner scan = new Scanner(System.in);
        System.out.print("Напишите сумму пополнения: ");
        double replenishment = scan.nextDouble();
        int bonus;
        if (replenishment > 1000) {
            bonus = (int) replenishment / 100;
        } else {
            bonus = 0;
        }
        UserBalance += replenishment + bonus;

        System.out.print("Бонус: ");
        System.out.println(bonus);
        System.out.print("Итого: ");
        System.out.println(UserBalance);
    }

}
