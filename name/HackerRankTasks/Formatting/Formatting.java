import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        while(scanner.hasNext()) {
            String s = scanner.next();
            int x = scanner.nextInt();
            System.out.printf("%-15s%03d%n", s, x); 
        }
        System.out.println("================================");
        scanner.close();
    }
}
