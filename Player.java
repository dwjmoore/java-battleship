public class Player {
	private int playerNumber;
	

	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public void attack() {
		System.out.println("Attack function called, but not implemented.");
	}

	public void placeShips() {
		System.out.printf("Player %d, please place your ships.", playerNumber);
	}
}