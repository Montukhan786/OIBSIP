import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        NumberGuessing();
    }
    public static void NumberGuessing(){
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int n=0;
        int i,guess;
        int level = 0;
        System.out.println("Welcome to the Number Guessing Game");

        while(true) {
            while (true) {
                System.out.println("Difficulty Level");
                System.out.println("1.Easy - 7 Chances");
                System.out.println("2.Medium - 5 Chances");
                System.out.println("3.Hard - 3 Chances");

                System.out.println("Select the difficulty level");
                int temp = sc.nextInt();
                if (temp > 0 && temp < 4) {
                    level = temp;
                    break;
                }
                System.out.println("");
                System.out.println("Invalid, Please select valid option ");
                System.out.println("");
            }

            switch (level) {
                case 1:
                    n = 7;
                    break;
                case 2:
                    n = 5;
                    break;
                case 3:
                    n = 3;
                    break;
                default:
                    System.out.println("Please select the valid difficulty level");
                    return;
            }

            System.out.println("Guess the number between 1 to 100");
            System.out.println("You get " + n + " chances to guess the correct number");

            for (i = 1; i <= n; i++) {

                if (i == n) {
                    System.out.println("You have a last chance to guess the number");
                }

                System.out.println("Guess the number : ");
                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.You Win!!!");
                    break;
                } else if ((number > guess) && (i != n)) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess && i != n) {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (i == n + 1) {
                System.out.println("You have exhausted number of trials.You Lost!!!");

                System.out.println("The number was " + number);
            }

            System.out.println("Do you want to continue press Y for YES or N for NO :");
            String c = sc.next();

            if(c.charAt(0) == 'N' || c.charAt(0) == 'n'){
                break;
            }//else continue to loop on any string ;-)
        }
    }
}
