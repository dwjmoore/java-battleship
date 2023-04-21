public class TwoPlayerGame {
	Player playerOne;
	Player playerTwo;
	Board playerOneBoard;
	Board playerTwoBoard;
	Ship playerOneCarrier;
	Ship playerOneBattleship;
	Ship playerOneCruiser;
	Ship playerOneSubmarine;
	Ship playerOneDestroyer;
	Ship playerTwoCarrier;
	Ship playerTwoBattleship;
	Ship playerTwoCruiser;
	Ship playerTwoSubmarine;
	Ship playerTwoDestroyer;

	public TwoPlayerGame() {
		this.playerOne = new Player(1);
		this.playerTwo = new Player(2);
		this.playerOneBoard = new Board();
		this.playerTwoBoard = new Board();
		this.playerOneCarrier = new Ship("carrier");
		this.playerOneBattleship = new Ship("battleship");
		this.playerOneCruiser = new Ship("cruiser");
		this.playerOneSubmarine = new Ship("submarine");
		this.playerOneDestroyer = new Ship("destroyer");
		this.playerTwoCarrier = new Ship("carrier");
		this.playerTwoBattleship = new Ship("battleship");
		this.playerTwoCruiser = new Ship("cruiser");
		this.playerTwoSubmarine = new Ship("submarine");
		this.playerTwoDestroyer = new Ship("destroyer");

		playerOne.placeShips();
	}
}