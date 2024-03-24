import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstUpperBound = Integer.parseInt(scanner.nextLine());
        int secondUpperBound = Integer.parseInt(scanner.nextLine());
        int thirdUpperBound = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= firstUpperBound; i += 2) {
            for (int j = 2; j <= secondUpperBound; j++) {
                if (isPrime(j)) {
                    for (int k = 2; k <= thirdUpperBound; k += 2) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
