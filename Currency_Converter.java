import java.util.Scanner;

public class Currency_Converter {
    public static void main ( String[] args ) {
        System.out.println("""
                Welcome to our currency converter, supporting the following currencies:\s
                Euro\s
                Dollar\s
                Rupee;""");

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose the currency that you want to convert.");
        int choice = scan.nextInt();

        System.out.println("Enter the amount that you want to convert.");
        double amount = scan.nextDouble();

        switch (choice) {
            case 1:
                Euro_to_other(amount);
                break;

            case 2:
                Dollar_to_other(amount);
                break;

            case 3:
                Rupee_to_other(amount);
                break;
        }
    }

    public static void Euro_to_other ( double amt ) {

        System.out.println("Choose which currency to convert the euro to. \n1.Dollar \n2. Rupee");
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            int curChoice = sc.nextInt();
            switch (curChoice) {
                case 1:

                    System.out.println("1 Euro = " + 1.02 + " dollar.");
                    System.out.println();

                    System.out.println(amt + " Euro = " + (amt * 1.02) + " dollar.");

                    break;

                case 2:
                    System.out.println("1 Euro = " + 80.85 + "rupee.");
                    System.out.println();

                    System.out.println(amt + " euro = " + (amt * 80.85) + " rupee.");
                    System.out.println();

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to continue to convert? (y/n)");
            String continueChoice = sc.next().toLowerCase();
            run = continueChoice.equals("y");
        }
        System.out.println("Bye!");
    }


    public static void Dollar_to_other ( double amt ) {
        System.out.println("Choose which currency to convert the dollar to. \n1.Euro \n2. Rupee");
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            int curChoice = sc.nextInt();
            switch (curChoice) {
                case 1:
                    System.out.println("1 dollar = " + 0.98 + " euro.");
                    System.out.println();
                    System.out.println(amt + " dollar = " + (amt * 0.98) + " euro.");
                    break;
                case 2:
                    System.out.println("1 dollar = " + 79.37 + " rupee.");
                    System.out.println();
                    System.out.println(amt + " dollar = " + (amt * 79.37) + " rupee.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to continue to convert? (y/n)");
            String continueChoice = sc.next().toLowerCase();
            run = continueChoice.equals("y");
        }
        System.out.println("Bye!");
}
    
    public static void Rupee_to_other(double amt) {
        System.out.println("1 rupee = " + 0.013 + " dollar.");
        System.out.println();

        System.out.println(amt+" rupee = " + (amt*0.013) + " dollar.");
        System.out.println();

        System.out.println("1 rupee = " + 0.012 + " euro.");
        System.out.println();
        System.out.println(amt+" rupee = " + (amt*0.012) + " euro.");
        System.out.println();

    }
}
