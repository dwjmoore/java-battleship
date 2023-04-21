public class Ship {
	private String type;
	private int length;
	private String[] location;

	public Ship(String type) {
		this.type = type;

		if (type == "carrier") {
			this.length = 5;
			this.location = new String[this.length];
		}
		if (type == "battleship") {
			this.length = 4;
		}
		if (type == "cruiser") {
			this.length = 3;
		}
		if (type == "submarine") {
			this.length = 3;
		}
		if (type == "destroyer") {
			this.length = 2;
		}
		this.location = new String[length];
	}

	public void takeAHit() {
		System.out.println("takeAHit() called, but not yet implemented.");
	}
}