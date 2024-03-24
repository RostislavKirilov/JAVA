import java.util.Scanner;

public class SantaFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodPerDayFirst = Double.parseDouble(scanner.nextLine());
        double foodPerDaySecond = Double.parseDouble(scanner.nextLine());
        double foodPerDayThird = Double.parseDouble(scanner.nextLine());

        double totalFoodNeeded = (foodPerDayFirst + foodPerDaySecond + foodPerDayThird) * days;

        if (foodLeft >= totalFoodNeeded) {
            int foodLeftInt = (int) Math.floor(foodLeft - totalFoodNeeded);
            System.out.printf("%d kilos of food left.%n", foodLeftInt);
        } else {
            int foodNeeded = (int) Math.ceil(totalFoodNeeded - foodLeft);
            System.out.printf("%d more kilos of food are needed.%n", foodNeeded);
        }
    }
}
