import java.util.*;

class Number_Guessing {
    static class Game {
        int computer;

        public Game() {
            Random r = new Random();
            computer = r.nextInt(100);
            System.out.println("Guess the number from 1 to 100");
        }

        public int computerNo() {
            return computer;
        }
    }

    static int takeuserInput() {
        int user;
        System.out.println("Enter your guess:");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int user, int computer) {
        if (user == computer) {
            System.out.println("Correct guess!");
        } else if (user > computer) {
            System.out.println("Your guess is bigger than the computer's number.");
        } else {
            System.out.println("Your guess is smaller than the computer's number.");
        }
    }

    public static void main(String args[]) {
        int user, computer, iteration = 0;
        Game g = new Game();
        do {
            user = takeuserInput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            iteration++;
        } while (user != computer);

        System.out.println("You guessed the number in " + iteration + " iterations.");
    }
}
