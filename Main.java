import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new BattleshipMenu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))));
	}
}