import java.util.Scanner;

public class Player {
	private int playerNumber;

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public void placeShips(Scanner scanner, Board board, Ship[] ships) {
		System.out.printf("Player %d, please place your ships.%n", playerNumber);
		board.printBoard(board.getPlayerBoard());
		scanner.nextLine();

		for (Ship ship : ships) {
			System.out.printf("Place the following ship: %s. It has a length of %d. Ships cannot be placed diagonally.%n",
					ship.getShipType(),
					ship.getShipLength());
			String[] coordinates = inputCoordinates(scanner);
		}
	}

	private String[] inputCoordinates(Scanner scanner) {
		String[] coordinates = new String[2];
		System.out.printf("Choose the coordinate for one end of the %s: ", ship.getShipType());
		coordinates[0] = scanner.nextLine();
		System.out.printf("Choose the coordinate for other end of the %s: ", ship.getShipType());
		coordinates[1] = scanner.nextLine();
		return coordinates;
	}

	public void attack() {
		System.out.println("Attack function called, but not implemented.");
	}
}