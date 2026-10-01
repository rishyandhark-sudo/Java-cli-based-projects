import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
System.out.println("------Number Hunt Game------");
        int target, guess;
        Random rand = new Random();

        target = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess (1-100): ");
        guess = sc.nextInt();

        int count = 1;

        while (guess != target) {

            if (guess > target) {
                System.out.print("Your guess is greater than the target number, please try again: ");
            } else {
                System.out.print("Your guess is less than the target number, please try again: ");
            }

            count++;
            guess = sc.nextInt();
        }

        System.out.println("Yayy! Your guess is correct in " + count + " attempts.");

        sc.close();
    }
}
