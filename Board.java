public class Board {
	private String[][] playerBoard;
	private String[][] enemyBoard;

	public Board() {
		this.playerBoard = new String[10][10];
		this.enemyBoard = new String[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				playerBoard[i][j] = "";
				enemyBoard[i][j] = "";
			}
		}
	}

	private void printBoard() {
		System.out.println("Print board function called, but not implemented.");
	}

}