import java.util.Scanner;

public class BattleshipMenu {
	private Scanner scanner;
	private String[] menuOptions = {
			"Exit",
			"1-Player Game",
			"2-Player Game"
	};

	public BattleshipMenu(Scanner scanner) {
		this.scanner = scanner;

		printGameTitle();
		executeBattleshipMenu();
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

	private void executeBattleshipMenu() {
		printMenuOptions();
		int gameOption = getNextIntFromUser();
		while (gameOption != 0) {
			if (gameOption == 1) {
				new OnePlayerGame();
			} else if (gameOption == 2) {
				new TwoPlayerGame();
			} else {
				System.out.println("Selection is not valid.");
			}
			printMenuOptions();
			gameOption = getNextIntFromUser();
		}
		exit();
	}

	private void printMenuOptions() {
		System.out.println("\n----Menu----");
		System.out.println("Select an option using one of the numbers shown:");
		System.out.println();

		for (int i = 0; i < menuOptions.length; i++) {
			System.out.print(i + ": ");
			System.out.println(menuOptions[i]);
		}
	}

	private int getNextIntFromUser() {
		while (!scanner.hasNextInt()) {
			System.out.println("Selection not valid. Try again.");
			scanner.next();
		}
		return scanner.nextInt();
	}

	private void exit() {
		System.out.println("Exiting now. Goodbye.");
		scanner.close();
	}
}