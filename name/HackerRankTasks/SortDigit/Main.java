import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void sortByDigitSum(Integer[] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(getDigitSum(a), getDigitSum(b)));
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int N = scanner.nextInt();

        Integer[] array = new Integer[N];
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt();
        }

        sortByDigitSum(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
