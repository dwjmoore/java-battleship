public enum Rows {
	A(0, "A"),
	B(1, "B"),
	C(2, "C"),
	D(3, "D"),
	E(4, "E"),
	F(5, "F"),
	G(6, "G"),
	H(7, "H"),
	I(8, "I"),
	J(9, "J");

	private int index;
	private String displayValue;

	private Rows(int index, String displayValue) {
		this.index = index;
		this.displayValue = displayValue;
	}
	
	public int getIndex() {
		return index;
	}

	public String getDisplayValue() {
		return displayValue;
	}
}