import java.util.Scanner;

public class BattleshipMenu {
	private Scanner scanner;
	private int numPlayers;

	public BattleshipMenu(Scanner scanner) {
		this.scanner = scanner;

		printGameTitle();
		selectNumOfPlayers();
	}

	private void printGameTitle() {
		System.out.println();
		System.out.println("///////////////////////////////////////////////////////////////////////////////");
		System.out.println();
		System.out.println("BBBBBB   AAAAA  TTTTTTT TTTTTTT L       EEEEEEE SSSSSSS H     H IIIIIII PPPPPP");
		System.out.println("B     B A     A    T       T    L       E       S       H     H    I    P     P");
		System.out.println("B     B A     A    T       T    L       E       S       H     H    I    P     P");
		System.out.println("BBBBBB  AAAAAAA    T       T    L       EEEEEE  SSSSSSS HHHHHHH    I    PPPPPP");
		System.out.println("B     B A     A    T       T    L       E             S H     H    I    P");
		System.out.println("B     B A     A    T       T    L       E             S H     H    I    P");
		System.out.println("BBBBBB  A     A    T       T    LLLLLLL EEEEEEE SSSSSSS H     H IIIIIII P");
		System.out.println();
		System.out.println("///////////////////////////////////////////////////////////////////////////////");
		System.out.println();
	}

	private void selectNumOfPlayers() {
		System.out.print("Select the number of players. Enter 1 or 2: ");
		this.numPlayers = getNextIntFromUser();

		while (numPlayers != 1 && numPlayers != 2) {
			System.out.print("Invalid entry. Please enter 1 for a one-player game or 2 for a two-player game: ");
			this.numPlayers = getNextIntFromUser();
		}

		if (numPlayers == 1) {
			playOnePlayerGame();
		}
		if (numPlayers == 2) {
			playTwoPlayerGame();
		}
	}

	private void playOnePlayerGame() {
		System.out.println("One-player game selected, but not yet implemented.");
	}

	private void playTwoPlayerGame() {
		System.out.println("Two-player game selected, but not yet implemented.");
	}

	private int getNextIntFromUser() {
		while (!scanner.hasNextInt()) {
			System.out.println("Selection not valid. Try again.");
			scanner.next();
		}
		return scanner.nextInt();
	}
}