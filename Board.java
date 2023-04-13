public class Board {
	private String[][] playerBoard;
	private String[][] enemyBoard;

	public Board() {
		this.playerBoard = new String[10][10];
		this.enemyBoard = new String[10][10];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				playerBoard[i][j] = "X";
				enemyBoard[i][j] = "X";
			}
		}
	}

	public void printBoard(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.println(board[i][j]);
			}
		}
	}

	public String[][] getPlayerBoard() {
		return playerBoard;
	}

	public String[][] getEnemyBoard() {
		return enemyBoard;
	}
}