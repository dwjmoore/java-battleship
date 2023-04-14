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

	public void printBoard(String[][] board) {
		String[] letters = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		System.out.println("	|	1	|	2	|	3	|	4	|	5	|	6	|	7	|	8	|	9	|	10	|");
		System.out.println("-------------------------------------------------------------------------------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print(letters[i]);
			for (int j = 0; j < board.length; j++) {
				System.out.print("	|	" + board[i][j]);
			}
			System.out.println("	|");
			System.out.println("-------------------------------------------------------------------------------------");
		}
	}

	public String[][] getPlayerBoard() {
		return playerBoard;
	}

	public String[][] getEnemyBoard() {
		return enemyBoard;
	}
}