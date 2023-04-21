public class TwoPlayerGame {
	Player playerOne = new Player(1);
	Player playerTwo = new Player(2);

	public TwoPlayerGame() {
		System.out.println("Player One, please place your ships.");
		playerOne.placeShips();
	}
}