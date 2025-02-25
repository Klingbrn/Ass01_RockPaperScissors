import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerOne = "";
        String playerTwo = "";
        String playAgain = "";

        do {

            do {
                System.out.println("Enter the move for Player One [R, P, S]: ");
                playerOne = scanner.nextLine().trim().toUpperCase();
                if (!playerOne.equals("R") && !playerOne.equals("P") && !playerOne.equals("S")) {
                    System.out.println("Invalid move! Please enter only R, P, or S.");
                }
            } while (!playerOne.equals("R") && !playerOne.equals("P") && !playerOne.equals("S"));


            do {
                System.out.println("Enter the move for Player Two [R, P, S]: ");
                playerTwo = scanner.nextLine().trim().toUpperCase();
                if (!playerTwo.equals("R") && !playerTwo.equals("P") && !playerTwo.equals("S")) {
                    System.out.println("Invalid move! Please enter only R, P, or S.");
                }
            } while (!playerTwo.equals("R") && !playerTwo.equals("P") && !playerTwo.equals("S"));


            if (playerOne.equals(playerTwo)) {
                System.out.println(playerOne + " vs " + playerTwo + " - It's a TIE!");
            } else if (playerOne.equals("R") && playerTwo.equals("S")) {
                System.out.println("Rock breaks Scissors, Player One wins!");
            } else if (playerOne.equals("P") && playerTwo.equals("R")) {
                System.out.println("Paper covers Rock, Player One wins!");
            } else if (playerOne.equals("S") && playerTwo.equals("P")) {
                System.out.println("Scissors cuts Paper, Player One wins!");
            } else if (playerTwo.equals("R") && playerOne.equals("S")) {
                System.out.println("Rock breaks Scissors, Player Two wins!");
            } else if (playerTwo.equals("P") && playerOne.equals("R")) {
                System.out.println("Paper covers Rock, Player Two wins!");
            } else if (playerTwo.equals("S") && playerOne.equals("P")) {
                System.out.println("Scissors cuts Paper, Player Two wins!");
            }

            System.out.println("Play again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();

        } while (playAgain.equals("Y"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
